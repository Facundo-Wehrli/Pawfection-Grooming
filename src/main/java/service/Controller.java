package service;

import java.util.List;
import persistence.PersistenceController;

public class Controller {
    
    PersistenceController controlPersis = new PersistenceController();
    
    public void save(String petName, String breed, String color, String observations, String ownerName, String ownerPhoneNumber, String allergic, String specialAttention) {
        //create owner and asign values
        Owner owner = new Owner();
        owner.setName(ownerName);
        owner.setPhone_nomber(ownerPhoneNumber);
        //create pet and asign values
        Pet pet = new Pet();
        pet.setDog_name(petName);
        pet.setBreed(breed);
        pet.setColor(color);
        pet.setAllergic(allergic);
        pet.setSpecial_attention(specialAttention);
        pet.setObservations(observations);
        pet.setOwner(owner);
        
        controlPersis.save(owner, pet);
    }
    
    public List<Pet> getPets() {
        return controlPersis.getPets();
    }
    
    public void deletePet(int num_client) {
        controlPersis.deletePet(num_client);
    }
    
    public Pet getPet(int num_client) {
        return controlPersis.getPet(num_client);
        
    }
    
    public void modifyPet(Pet pet, String petName, String breed, String color, String observations, String ownerName, String ownerPhoneNumber, String allergic, String specialAttention) {
        pet.setDog_name(petName);
        pet.setBreed(breed);
        pet.setColor(color);
        pet.setObservations(observations);
        pet.setAllergic(allergic);
        pet.setSpecial_attention(specialAttention);
        
        //modify pet
        controlPersis.modifyPet(pet);
        
        //set new owner values
        Owner owner = this.searchOwner(pet.getOwner().getOwner_id());
        owner.setPhone_nomber(ownerPhoneNumber);
        owner.setName(ownerName);
        
        //call modify owner
        this.modifyOwner(owner);
        
        
    }
    
    private Owner searchOwner(int owner_id) {
        return controlPersis.getOwner(owner_id);
    }

    
    private void modifyOwner(Owner owner) {
        controlPersis.modifyOwner(owner);
    }
    
    
}
