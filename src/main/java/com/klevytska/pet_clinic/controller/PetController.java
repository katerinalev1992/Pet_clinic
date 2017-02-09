package com.klevytska.pet_clinic.controller;

import com.klevytska.pet_clinic.dao.PetRepository;
import com.klevytska.pet_clinic.logic.TransferDTO;
import com.klevytska.pet_clinic.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by klevytska on 09/02/2017.
 */
@RestController
@RequestMapping("pet")
public class PetController {

    @Autowired
    private TransferDTO transferDTO;

    @Autowired
    private PetRepository petRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Pet> getAll(){
        return (List<Pet>)petRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Pet getPetById(@PathVariable("id") Long id){
        return petRepository.findOne(id);
    }

}
