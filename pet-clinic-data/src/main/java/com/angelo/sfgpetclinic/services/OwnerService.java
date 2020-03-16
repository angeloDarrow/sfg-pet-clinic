package com.angelo.sfgpetclinic.services;

import com.angelo.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

   Owner OwnfindById(Long id);

   Owner save(Owner owner);

   Set<Owner> findAll();
}
