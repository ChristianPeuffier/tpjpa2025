package metier;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("administrateur")
public class Administrateur extends Utilisateur {

    public Administrateur( String nom, String prenom, String email, String motDePasse) {
        super( nom, prenom, email, motDePasse);
    }

    public Administrateur() {
        super();
    }
}
