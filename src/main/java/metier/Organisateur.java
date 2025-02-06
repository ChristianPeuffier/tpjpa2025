package metier;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@DiscriminatorValue("organisateur")
public class Organisateur extends Utilisateur {

    @OneToMany(mappedBy = "organisateur")
    private List<Evenement> evenements;

    public Organisateur( String nom, String prenom, String email, String motDePasse) {
        super( nom, prenom, email, motDePasse);
    }

    public Organisateur() {
        super();
    }
}
