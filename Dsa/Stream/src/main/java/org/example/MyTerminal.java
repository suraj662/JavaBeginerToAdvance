package org.example;

import java.io.File;
import java.util.Scanner;

public class MyTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        File currentDir = new File(System.getProperty("user.dir"));

        while (true) {
            System.out.print(currentDir.getAbsolutePath() + " > ");
            String input = scanner.nextLine();

            String[] parts = input.split(" ");
            String command = parts[0];

            switch (command) {

                case "exit":
                    System.out.println("Exiting...");
                    return;

                case "pwd":
                    System.out.println(currentDir.getAbsolutePath());
                    break;

                case "ls":
                    File[] files = currentDir.listFiles();
                    if (files != null) {
                        for (File f : files) {
                            System.out.println(f.getName());
                        }
                    }
                    break;

                case "mkdir":
                    if (parts.length < 2) {
                        System.out.println("Usage: mkdir <folder>");
                        break;
                    }
                    File newDir = new File(currentDir, parts[1]);
                    if (newDir.mkdir()) {
                        System.out.println("Directory created");
                    } else {
                        System.out.println("Failed to create directory");
                    }
                    break;

                case "cd":
                    if (parts.length < 2) {
                        System.out.println("Usage: cd <folder>");
                        break;
                    }

                    if (parts[1].equals("..")) {
                        currentDir = currentDir.getParentFile();
                    } else {
                        File temp = new File(currentDir, parts[1]);
                        if (temp.exists() && temp.isDirectory()) {
                            currentDir = temp;
                        } else {
                            System.out.println("Directory not found");
                        }
                    }
                    break;

                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
