package com.angelo.sfgpetclinic.services.map;

import com.angelo.sfgpetclinic.model.Owner;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;

    final Long ownerId = 1L;
    final String lastName = "Paparakis";

    @BeforeEach
    void setUp() {

        ownerServiceMap = new OwnerServiceMap(new PetTypeMapService(),new PetServiceMap());

        ownerServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());

    }

    @Test
    void findaAll() {
       Set<Owner> owners = ownerServiceMap.findaAll();

       assertEquals(1,owners.size());
    }

    @Test
    void deleteById() {

        ownerServiceMap.deleteById(ownerId);

        assertEquals(0,ownerServiceMap.findaAll().size());

    }

    @Test
    void delete() {

        ownerServiceMap.delete(ownerServiceMap.finfById(ownerId));

        assertEquals(0,ownerServiceMap.findaAll().size());
    }

    @Test
    void finfById() {
        Owner owner = ownerServiceMap.finfById(ownerId);

        assertEquals(ownerId,owner.getId());
    }

    @Test
    void saveExistingId() {

        Long id = 2L;

        Owner owner2 = Owner.builder().id(2L).build();

        Owner savedOwner = ownerServiceMap.save(owner2);

        assertEquals(id,savedOwner.getId());
    }

    @Test
    void saveNoId() {

        Owner savedOwner = ownerServiceMap.save(Owner.builder().build());

        assertNotNull(savedOwner);
        assertNotNull(ownerId);
    }

    @Test
    void findByLastName() {
        Owner paparakis = ownerServiceMap.findByLastName(lastName);

        assertNotNull(paparakis);

        assertEquals(ownerId,paparakis.getId());
    }

    @Test
    void findByLastNameNotFound() {
        Owner paparakis = ownerServiceMap.findByLastName("kostas");

        log.debug("Trying to find an non existed owner...");
        assertNull(paparakis);

        log.debug("Test Passed!");
    }
}