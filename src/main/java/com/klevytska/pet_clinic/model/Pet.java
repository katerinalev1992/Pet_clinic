package com.klevytska.pet_clinic.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by klevytska on 09/02/2017.
 */

@Entity
@Table(name="pets")
public class Pet implements Serializable{

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "race")
    private String race;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private long age;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="owner")
    private Owner owner;

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

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pet pet = (Pet) o;

        if (id != pet.id) return false;
        if (age != pet.age) return false;
        if (name != null ? !name.equals(pet.name) : pet.name != null) return false;
        if (race != null ? !race.equals(pet.race) : pet.race != null) return false;
        if (gender != null ? !gender.equals(pet.gender) : pet.gender != null) return false;
        return owner != null ? owner.equals(pet.owner) : pet.owner == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (race != null ? race.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (int) (age ^ (age >>> 32));
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        return result;
    }
}
