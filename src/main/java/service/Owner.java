package service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;

@Entity
public class Owner implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int owner_id;
    private String name;
    private String phone_nomber;

    public Owner() {
    }

    public Owner(int owner_id, String name, String phone_nomber) {
        this.owner_id = owner_id;
        this.name = name;
        this.phone_nomber = phone_nomber;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_nomber() {
        return phone_nomber;
    }

    public void setPhone_nomber(String phone_nomber) {
        this.phone_nomber = phone_nomber;
    }

}
