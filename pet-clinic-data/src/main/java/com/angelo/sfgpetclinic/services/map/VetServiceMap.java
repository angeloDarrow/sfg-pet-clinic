package com.angelo.sfgpetclinic.services.map;

import com.angelo.sfgpetclinic.model.Specialty;
import com.angelo.sfgpetclinic.model.Vet;
import com.angelo.sfgpetclinic.services.SpecialtySevice;
import com.angelo.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtySevice specialtySevice;

    public VetServiceMap(SpecialtySevice specialtySevice) {
        this.specialtySevice = specialtySevice;
    }

    @Override
    public Set<Vet> findaAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {

        super.delete(object);
    }

    @Override
    public Vet finfById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet vet) {

        if(vet.getSpecialties().size() > 0)
            vet.getSpecialties().forEach(specialty -> {
                if(specialty != null && specialty.getId() == null){
                    Specialty savedSpecialty = specialtySevice.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });

        return super.save(vet);
    }
}
