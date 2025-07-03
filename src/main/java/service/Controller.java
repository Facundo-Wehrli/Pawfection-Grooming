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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
