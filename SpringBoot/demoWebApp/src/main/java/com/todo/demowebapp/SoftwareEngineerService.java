package com.todo.demowebapp;

//handle bussiness or application logic

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;

    //acess the current class using constructor
    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository){
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getSoftwareEngineerList(){
        //map to dto(data transfer object)
        //return softwareEngineerRepository.findAll().stream().map();

        //or,if not
        return softwareEngineerRepository.findAll();
    }


    public SoftwareEngineer saveEngineer(SoftwareEngineer engineer){
        return softwareEngineerRepository.save(engineer);
    }


    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerbyId(Integer id) {
        return softwareEngineerRepository.findById(id)
                .orElseThrow( () -> new IllegalStateException(
                        id + "not found"));
    }


}
