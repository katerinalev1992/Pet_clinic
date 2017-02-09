package com.klevytska.pet_clinic.dto;

import com.klevytska.pet_clinic.model.Pet;
import com.klevytska.pet_clinic.model.Veterinarian;

import java.util.List;

/**
 * Created by klevytska on 09/02/2017.
 */
public class OwnerDTO {

    private String name;
    private List<Pet> pet;
    private Veterinarian home_veterinarian;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPet() {
        return pet;
    }

    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }

    public Veterinarian getHome_veterinarian() {
        return home_veterinarian;
    }

    public void setHome_veterinarian(Veterinarian home_veterinarian) {
        this.home_veterinarian = home_veterinarian;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OwnerDTO ownerDTO = (OwnerDTO) o;

        if (name != null ? !name.equals(ownerDTO.name) : ownerDTO.name != null) return false;
        if (pet != null ? !pet.equals(ownerDTO.pet) : ownerDTO.pet != null) return false;
        return home_veterinarian != null ? home_veterinarian.equals(ownerDTO.home_veterinarian) : ownerDTO.home_veterinarian == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (pet != null ? pet.hashCode() : 0);
        result = 31 * result + (home_veterinarian != null ? home_veterinarian.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OwnerDTO{" +
                "name='" + name + '\'' +
                ", pet=" + pet +
                ", home_veterinarian=" + home_veterinarian +
                '}';
    }
}
