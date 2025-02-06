package metier;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("administrateur")
public class Administrateur extends Utilisateur {

}
