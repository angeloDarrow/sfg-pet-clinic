package com.angelo.sfgpetclinic.bootstrap;

import com.angelo.sfgpetclinic.model.Owner;
import com.angelo.sfgpetclinic.model.Pet;
import com.angelo.sfgpetclinic.model.PetType;
import com.angelo.sfgpetclinic.model.Vet;
import com.angelo.sfgpetclinic.services.OwnerService;
import com.angelo.sfgpetclinic.services.PetTypeService;
import com.angelo.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private  final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {



        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

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

        vetService.save(vet2);

        System.out.println("Loaded vets...");

    }
}
