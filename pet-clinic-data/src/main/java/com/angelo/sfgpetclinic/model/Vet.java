package com.angelo.sfgpetclinic.model;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
