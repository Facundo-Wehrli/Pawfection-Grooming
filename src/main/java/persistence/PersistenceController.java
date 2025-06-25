package persistence;

import service.Owner;
import service.Pet;

public class PersistenceController {

    OwnerJpaController ownerJpa = new OwnerJpaController();
    PetJpaController petJpa = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        //crete the owner in bd
        ownerJpa.create(owner);
        //create the pet in bd
        petJpa.create(pet);
    }

}
