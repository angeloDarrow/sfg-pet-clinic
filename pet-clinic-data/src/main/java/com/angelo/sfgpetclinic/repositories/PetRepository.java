package com.angelo.sfgpetclinic.repositories;

import com.angelo.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
