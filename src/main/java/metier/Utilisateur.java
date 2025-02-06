package metier;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_utilisateur", discriminatorType = DiscriminatorType.STRING)
 public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue
    private int id;
    @Column(length = 100, name = "nom")
    private String nom;
    @Column(length = 100, name = "prenom")
    private String prenom;
    @Column(length = 100, name = "email")
    private String email;
    @Column(length = 100, name = "password")
    private String password;
    @OneToMany(mappedBy = "utilisateur")
    private List<Ticket> tickets;
}
