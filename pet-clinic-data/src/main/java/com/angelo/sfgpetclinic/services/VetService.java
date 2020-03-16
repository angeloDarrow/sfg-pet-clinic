package com.angelo.sfgpetclinic.services;

import com.angelo.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {


    Vet OwnfindById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
