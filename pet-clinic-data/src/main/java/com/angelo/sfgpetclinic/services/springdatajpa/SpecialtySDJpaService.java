package com.angelo.sfgpetclinic.services.springdatajpa;

import com.angelo.sfgpetclinic.model.Specialty;
import com.angelo.sfgpetclinic.repositories.SpecialtyRepository;
import com.angelo.sfgpetclinic.services.SpecialtySevice;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialtySDJpaService implements SpecialtySevice {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findaAll() {

        Set<Specialty> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty finfById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return  specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);

    }
}
