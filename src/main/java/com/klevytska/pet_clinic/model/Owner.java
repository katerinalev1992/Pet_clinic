package com.klevytska.pet_clinic.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by klevytska on 09/02/2017.
 */

@Entity
@Table( name = "owners")
public class Owner implements Serializable{

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy="pet")
    private List<Pet> pet;

    @Column(name = "home_veterinarian")
    private Veterinarian home_veterinarian;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

        Owner owner = (Owner) o;

        if (id != owner.id) return false;
        if (name != null ? !name.equals(owner.name) : owner.name != null) return false;
        if (pet != null ? !pet.equals(owner.pet) : owner.pet != null) return false;
        return home_veterinarian != null ? home_veterinarian.equals(owner.home_veterinarian) : owner.home_veterinarian == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pet != null ? pet.hashCode() : 0);
        result = 31 * result + (home_veterinarian != null ? home_veterinarian.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pet=" + pet +
                ", home_veterinarian=" + home_veterinarian +
                '}';
    }
}
