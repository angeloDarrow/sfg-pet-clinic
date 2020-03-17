package com.angelo.sfgpetclinic.services.map;

import com.angelo.sfgpetclinic.model.Owner;
import com.angelo.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {


    @Override
    public Set<Owner> findaAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Owner owner) {

    }

    @Override
    public Owner finfById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object,object.getId());
    }
}
