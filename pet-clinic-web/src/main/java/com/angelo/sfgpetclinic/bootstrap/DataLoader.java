package com.angelo.sfgpetclinic.bootstrap;

import com.angelo.sfgpetclinic.model.Owner;
import com.angelo.sfgpetclinic.model.PetType;
import com.angelo.sfgpetclinic.model.Vet;
import com.angelo.sfgpetclinic.services.OwnerService;
import com.angelo.sfgpetclinic.services.PetTypeService;
import com.angelo.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Aris");
        owner2.setLastName("Triantafullou");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Paparis");
        vet1.setLastName("Paparakis");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Mixalis");
        vet2.setLastName("Pirpiris");

        vetService.save(vet2);

        System.out.println("Loaded vets...");

    }
}
