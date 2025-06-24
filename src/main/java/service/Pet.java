package service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import javax.persistence.Id;

@Entity
public class Pet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int client_number;
    private String dog_name;
    private String breed;
    private String color;
    private String allergic;
    private String special_attention;

    @OneToOne
    private Owner owner;

    public Pet() {
    }

    public Pet(int client_number, String dog_name, String breed, String color, String allergic, String special_attention, Owner owner) {
        this.client_number = client_number;
        this.dog_name = dog_name;
        this.breed = breed;
        this.color = color;
        this.allergic = allergic;
        this.special_attention = special_attention;
        this.owner = owner;
    }

    public int getClient_number() {
        return client_number;
    }

    public void setClient_number(int client_number) {
        this.client_number = client_number;
    }

    public String getDog_name() {
        return dog_name;
    }

    public void setDog_name(String dog_name) {
        this.dog_name = dog_name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getSpecial_attention() {
        return special_attention;
    }

    public void setSpecial_attention(String special_attention) {
        this.special_attention = special_attention;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

}
