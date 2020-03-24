package com.angelo.sfgpetclinic.services.map;

import com.angelo.sfgpetclinic.model.Visit;
import com.angelo.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Set<Visit> findaAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);

    }

    @Override
    public Visit finfById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Visit save(Visit visit) {

        if(visit.getPet() == null || visit.getPet().getOwner() == null
            || visit.getPet().getId() == null){

            throw  new RuntimeException("Invalid Visit");
        }


        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {

        super.delete(object);
    }
}
