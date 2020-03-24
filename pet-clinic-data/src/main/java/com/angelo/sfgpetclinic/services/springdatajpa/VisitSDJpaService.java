package com.angelo.sfgpetclinic.services.springdatajpa;

import com.angelo.sfgpetclinic.model.Visit;
import com.angelo.sfgpetclinic.repositories.VisitRepository;
import com.angelo.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {
    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findaAll() {

        Set<Visit> vets = new HashSet<>();
        visitRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Visit finfById(Long aLong) {
       return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {

            return  visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
