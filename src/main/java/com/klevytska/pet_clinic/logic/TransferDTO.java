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
public interface TransferDTO {

    Pet transferPet (PetDTO petDTO);
    Owner transferPet (OwnerDTO OwnerDTO);
    Veterinarian transferPet (VeterinarianDTO VeterinarianDTO);

}

