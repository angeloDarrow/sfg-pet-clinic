package com.angelo.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType petType;
    private Owner owener;
    private LocalDate localDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwener() {
        return owener;
    }

    public void setOwener(Owner owener) {
        this.owener = owener;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
