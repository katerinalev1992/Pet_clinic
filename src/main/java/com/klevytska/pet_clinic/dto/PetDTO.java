package com.klevytska.pet_clinic.dto;

/**
 * Created by klevytska on 09/02/2017.
 */
public class PetDTO {

    private String name;
    private String race;
    private String gender;
    private Long age;

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

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PetDTO petDTO = (PetDTO) o;

        if (name != null ? !name.equals(petDTO.name) : petDTO.name != null) return false;
        if (race != null ? !race.equals(petDTO.race) : petDTO.race != null) return false;
        if (gender != null ? !gender.equals(petDTO.gender) : petDTO.gender != null) return false;
        return age != null ? age.equals(petDTO.age) : petDTO.age == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (race != null ? race.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PetDTO{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
