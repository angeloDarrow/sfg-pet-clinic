package com.angelo.sfgpetclinic.bootstrap;

import com.angelo.sfgpetclinic.model.*;
import com.angelo.sfgpetclinic.services.OwnerService;
import com.angelo.sfgpetclinic.services.PetTypeService;
import com.angelo.sfgpetclinic.services.SpecialtySevice;
import com.angelo.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private  final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtySevice specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtySevice specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findaAll().size();

        if(count == 0)
            loadData();

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);


        //TODO RETURN SPECIALITIES
        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        radiology.setDescription("Surgery");
        specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        radiology.setDescription("Dentistry");
        specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Angelis");
        owner1.setLastName("Ntavelos");
        owner1.setLastName("Karaiskaki 24");
        owner1.setCity("Argos");
        owner1.setTelephone("34235233");

        Pet chan = new Pet();
        chan.setName("Chan");
        chan.setPetType(saveDogPetType);
        chan.setOwener(owner1);
        chan.setLocalDate(LocalDate.now());
        owner1.getPets().add(chan);


        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Aris");
        owner2.setLastName("Triantafullou");
        owner2.setLastName("Karaiskaki 24");
        owner2.setCity("Argos");
        owner2.setTelephone("34235233");


        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Paparis");
        vet1.setLastName("Paparakis");
        vet1.getSpecialties().add(radiology);


        Pet owners2Pet = new Pet();
        chan.setName("Makis");
        chan.setPetType(saveCatPetType);
        chan.setOwener(owner2);
        chan.setLocalDate(LocalDate.now());
        owner2.getPets().add(owners2Pet);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Mixalis");
        vet2.setLastName("Pirpiris");
        vet2.getSpecialties().add(surgery);

        vetService.save(vet2);

        System.out.println("Loaded vets...");
    }
}
