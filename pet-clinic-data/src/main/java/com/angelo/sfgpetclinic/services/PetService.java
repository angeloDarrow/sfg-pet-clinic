package com.angelo.sfgpetclinic.services;

import com.angelo.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {


    Pet OwnfindById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
