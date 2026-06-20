console.log("inventory.js loaded");

const BASE = "http://localhost:8080";

let products = [];

async function loadData() {
    await loadProducts();
    await loadOrders();
}

async function loadProducts() {

    const res = await fetch(`${BASE}/products`);
    products = await res.json();

    document.getElementById("totalProducts").innerText = products.length;

    document.getElementById("lowStock").innerText =
        products.filter(p => p.quantity < 5).length;

    const tbody = document.getElementById("productsTable");
    tbody.innerHTML = "";

    products.forEach(p => {

        const status = p.quantity < 5
            ? `<span class="low">Low Stock</span>`
            : `<span class="ok">In Stock</span>`;

        tbody.innerHTML += `
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>₹${p.price}</td>
                <td>${p.quantity}</td>
                <td>${status}</td>
            </tr>
        `;
    });

    const select = document.getElementById("productSelect");

    select.innerHTML = products.map(p =>
        `<option value="${p.id}">${p.name}</option>`
    ).join("");

    updateStockInfo();
}

async function loadOrders() {

    const res = await fetch(`${BASE}/orders`);
    const orders = await res.json();

    document.getElementById("totalOrders").innerText = orders.length;

    const tbody = document.getElementById("ordersTable");
    tbody.innerHTML = "";

    orders.reverse().forEach(o => {

        tbody.innerHTML += `
        <tr>
            <td>${o.id}</td>
            <td>${o.productName}</td>
            <td>${o.orderedQuantity}</td>
            <td>${new Date(o.orderDate).toLocaleString()}</td>
        </tr>
        `;
    });
}

function updateStockInfo() {

    const id = Number(
        document.getElementById("productSelect").value
    );

    const product = products.find(
        p => p.id === id
    );

    if (product) {
        document.getElementById("availableStock").innerText =
            `Available Stock: ${product.quantity}`;
    }
}

async function addProduct() {

    const product = {
        name: document.getElementById("name").value,
        price: document.getElementById("price").value,
        quantity: document.getElementById("quantity").value
    };

    await fetch(`${BASE}/products`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(product)
    });

    loadData();
}

async function placeOrder() {

    const order = {
        productId: document.getElementById("productSelect").value,
        quantity: document.getElementById("orderQty").value
    };

    const res = await fetch(`${BASE}/orders`, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(order)
    });

    if (!res.ok) {
        alert("Insufficient stock!");
        return;
    }

    alert("Order placed successfully");
    loadData();
}

// Register event listener AFTER page loads
window.addEventListener("DOMContentLoaded", () => {

    const select = document.getElementById("productSelect");

    if (select) {
        select.addEventListener("change", updateStockInfo);
    }

    loadData();
});