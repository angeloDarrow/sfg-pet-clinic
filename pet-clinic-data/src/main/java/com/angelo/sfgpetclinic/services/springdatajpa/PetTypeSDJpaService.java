package com.angelo.sfgpetclinic.services.springdatajpa;

import com.angelo.sfgpetclinic.model.PetType;
import com.angelo.sfgpetclinic.repositories.PetTypeRepository;
import com.angelo.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findaAll() {
        Set<PetType> petTypeServices = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypeServices::add);
        return petTypeServices;
    }

    @Override
    public PetType finfById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return  petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);

    }
}
