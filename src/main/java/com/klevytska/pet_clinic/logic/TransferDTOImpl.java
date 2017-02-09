package com.klevytska.pet_clinic.logic;

import com.klevytska.pet_clinic.dto.OwnerDTO;
import com.klevytska.pet_clinic.dto.PetDTO;
import com.klevytska.pet_clinic.dto.VeterinarianDTO;
import com.klevytska.pet_clinic.model.Owner;
import com.klevytska.pet_clinic.model.Pet;
import com.klevytska.pet_clinic.model.Veterinarian;

/**
 * Created by klevytska on 09/02/2017.
 */
public class TransferDTOImpl implements TransferDTO{
    @Override
    public Pet transferPet(PetDTO petDTO) {
        return getPet(petDTO);
    }

    @Override
    public Owner transferPet(OwnerDTO ownerDTO) {
        return getOwner(ownerDTO);
    }

    @Override
    public Veterinarian transferPet(VeterinarianDTO veterinarianDTO) {
        return getVeterinarian(veterinarianDTO);
    }

    private Pet getPet(PetDTO petDTO){
        Pet pet = new Pet();
        pet.setName(petDTO.getName());
        pet.setGender(petDTO.getGender());
        pet.setAge(petDTO.getAge());
        pet.setRace(petDTO.getRace());
        return pet;
    }

    private Owner getOwner(OwnerDTO ownerDTO){
        Owner owner = new Owner();
        owner.setName(ownerDTO.getName());
        owner.setHome_veterinarian(ownerDTO.getHome_veterinarian());
        owner.setPet(ownerDTO.getPet());
        return owner;
    }

    private Veterinarian getVeterinarian(VeterinarianDTO veterinarianDTO){
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName(veterinarianDTO.getName());
        veterinarian.setTreated_pet(veterinarianDTO.getTreated_pet());
        veterinarian.setCurrent_customer(veterinarianDTO.getCurrent_customer());
        return veterinarian;
    }

}
