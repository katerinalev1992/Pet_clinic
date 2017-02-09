package com.klevytska.pet_clinic.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by klevytska on 09/02/2017.
 */
@Entity
@Table( name = "veterinarian")
public class Veterinarian implements Serializable{

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "current_customer")
    private Owner current_customer;

    @OneToMany(mappedBy="treated_pet")
    private List<Pet> treated_pet;

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

    public Owner getCurrent_customer() {
        return current_customer;
    }

    public void setCurrent_customer(Owner current_customer) {
        this.current_customer = current_customer;
    }

    public List<Pet> getTreated_pet() {
        return treated_pet;
    }

    public void setTreated_pet(List<Pet> treated_pet) {
        this.treated_pet = treated_pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Veterinarian that = (Veterinarian) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (current_customer != null ? !current_customer.equals(that.current_customer) : that.current_customer != null)
            return false;
        return treated_pet != null ? treated_pet.equals(that.treated_pet) : that.treated_pet == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (current_customer != null ? current_customer.hashCode() : 0);
        result = 31 * result + (treated_pet != null ? treated_pet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Veterinarian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", current_customer=" + current_customer +
                ", treated_pet=" + treated_pet +
                '}';
    }
}
