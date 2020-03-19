package com.angelo.sfgpetclinic.services.map;

import com.angelo.sfgpetclinic.model.Specialty;
import com.angelo.sfgpetclinic.services.SpecialtySevice;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyMapSerivice extends  AbstractMapService<Specialty, Long> implements SpecialtySevice {
    @Override
    public Set<Specialty> findaAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {

        super.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty finfById(Long aLong) {
        return super.findById(aLong);
    }
}
