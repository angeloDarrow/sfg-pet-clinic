package com.angelo.sfgpetclinic.services.map;

import com.angelo.sfgpetclinic.model.Pet;
import com.angelo.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
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
        return super.save(object);
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
