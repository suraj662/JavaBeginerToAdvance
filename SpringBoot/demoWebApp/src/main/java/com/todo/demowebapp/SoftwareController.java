package com.todo.demowebapp;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/v1/software-engineering")
public class SoftwareController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    //server to client
    @GetMapping
    public List<SoftwareEngineer> getSoftwareEng() {
  //      return List.of(
//                new SoftwareEngineer(
//                        1 ,
//                        "suraj" ,
//                        "JS , node , react "
//                ) ,
//                new SoftwareEngineer(
//                    2 ,
//                    "suraj yadav" ,
//                    "Java , Spring  , SpringBoot "
//                ) );


                //or


        return softwareEngineerService.getSoftwareEngineerList();
    }

    //Read
    @GetMapping("{id}")
    public SoftwareEngineer getEngineerbyId(@PathVariable Integer id) {
        return softwareEngineerService.getSoftwareEngineerbyId(id);
    }

    //Create
    //add new endpoint for softwareengineer using
    //client to server
    @PostMapping
    public void addSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }


}
