package me.asiimwedismas.petclinic.bootstrap;

import me.asiimwedismas.petclinic.model.Owner;
import me.asiimwedismas.petclinic.model.Vet;
import me.asiimwedismas.petclinic.service.OwnerService;
import me.asiimwedismas.petclinic.service.PetService;
import me.asiimwedismas.petclinic.service.VetService;
import me.asiimwedismas.petclinic.service.map.OwnerServiceMap;
import me.asiimwedismas.petclinic.service.map.PetServiceMap;
import me.asiimwedismas.petclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootLoader  implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;

    public BootLoader() {
        this.ownerService = new OwnerServiceMap();
        this.petService = new PetServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("fiona");
        owner2.setLastName("asiimwe");
        ownerService.save(owner2);

        System.out.println("loaded oweners....");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("same");
        vet1.setLastName("diana");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("ainebyona");
        vet2.setLastName("daniel");
        vetService.save(vet2);

        System.out.println("Loaded vets... ");

    }
}
