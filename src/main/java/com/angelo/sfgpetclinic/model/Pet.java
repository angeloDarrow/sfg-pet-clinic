package com.angelo.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType petType;
    private Owener owener;
    private LocalDate localDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owener getOwener() {
        return owener;
    }

    public void setOwener(Owener owener) {
        this.owener = owener;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
