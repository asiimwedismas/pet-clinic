package me.asiimwedismas.petclinic.bootstrap;

import me.asiimwedismas.petclinic.model.Owner;
import me.asiimwedismas.petclinic.model.Vet;
import me.asiimwedismas.petclinic.service.OwnerService;
import me.asiimwedismas.petclinic.service.PetService;
import me.asiimwedismas.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootLoader  implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;

    public BootLoader(OwnerService ownerService, PetService petService, VetService vetService) {
        this.ownerService = ownerService;
        this.petService = petService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("fiona");
        owner2.setLastName("asiimwe");
        ownerService.save(owner2);

        System.out.println("loaded oweners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("same");
        vet1.setLastName("diana");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("ainebyona");
        vet2.setLastName("daniel");
        vetService.save(vet2);

        System.out.println("Loaded vets... ");

    }
}
