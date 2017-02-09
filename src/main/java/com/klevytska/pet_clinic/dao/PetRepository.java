package com.klevytska.pet_clinic.dao;

import com.klevytska.pet_clinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by klevytska on 09/02/2017.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
