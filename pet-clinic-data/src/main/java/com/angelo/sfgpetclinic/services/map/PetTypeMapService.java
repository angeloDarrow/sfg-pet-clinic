package com.angelo.sfgpetclinic.services.map;

import com.angelo.sfgpetclinic.model.PetType;
import com.angelo.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findaAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {

        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType finfById(Long aLong) {
        return super.findById(aLong);
    }
}
