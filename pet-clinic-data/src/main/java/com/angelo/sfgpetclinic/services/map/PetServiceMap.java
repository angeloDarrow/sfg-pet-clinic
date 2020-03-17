package com.angelo.sfgpetclinic.services.map;

import com.angelo.sfgpetclinic.model.Pet;
import com.angelo.sfgpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findaAll() {
        return super.findAll();
    }

    @Override
    public Pet finfById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object,object.getId());
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
