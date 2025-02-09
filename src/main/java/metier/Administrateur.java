package metier;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.io.Serializable;

@Entity
@DiscriminatorValue("administrateur")
public class Administrateur extends Utilisateur implements Serializable {


    public Administrateur() {
        super();
    }
}
