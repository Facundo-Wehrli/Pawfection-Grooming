package persistence;

import java.util.List;
import persistence.exceptions.NonexistentEntityException;
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

    public List<Pet> getPets() {
        return petJpa.findPetEntities();
    }

    public void deletePet(int num_client) {
        try {
            petJpa.destroy(num_client);
        } catch (NonexistentEntityException ex) {
            System.getLogger(PersistenceController.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

}
