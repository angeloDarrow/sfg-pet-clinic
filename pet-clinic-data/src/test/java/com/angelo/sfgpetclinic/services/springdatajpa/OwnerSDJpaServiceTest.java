package com.angelo.sfgpetclinic.services.springdatajpa;

import com.angelo.sfgpetclinic.model.Owner;
import com.angelo.sfgpetclinic.repositories.OwnerRepository;
import com.angelo.sfgpetclinic.repositories.PetRepository;
import com.angelo.sfgpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJpaService service;

    final String PAPARAKIS = "Paparakis";

    Owner returnOwener;

    @BeforeEach
    void setUp() {
        returnOwener = Owner.builder().id(1L).lastName(PAPARAKIS).build();
    }

    @Test
    void findByLastName() {

        when(ownerRepository.findByLastName(any())).thenReturn(returnOwener);
        Owner paparakis = service.findByLastName(PAPARAKIS);

        assertEquals(PAPARAKIS,paparakis.getLastName());

        verify(ownerRepository).findByLastName(any());
    }

    @Test
    void findaAll() {

        Set<Owner> owners = new HashSet<>();
        owners.add(Owner.builder().id(1L).build());
        owners.add(Owner.builder().id(2L).build());

        when(ownerRepository.findAll()).thenReturn(owners);

        Set<Owner> owners1 = service.findaAll();

        assertEquals(2,owners1.size());
    }

    @Test
    void finfById() {

        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwener));

        Owner owner = service.finfById(1L);

        assertNotNull(owner);
    }


    @Test
    void finfByIdNotFound() {

        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner owner = service.finfById(1L);

        assertNull(owner);
    }

    @Test
    void save() {

        Owner ownertoSave = Owner.builder().id(1L).build();

        when(ownerRepository.save(any())).thenReturn(returnOwener);

        Owner savedOwner = service.save(ownertoSave);

        assertNotNull(savedOwner);

        verify(ownerRepository).save(any());
    }

    @Test
    void delete() {
        service.delete(returnOwener);

        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteById() {

        service.deleteById(1L);

        verify(ownerRepository).deleteById(anyLong());
    }
}