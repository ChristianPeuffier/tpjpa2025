package metier;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue
    private int id;


    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "evenement_id")
    private Evenement evenement;

    @Column(length = 100, name = "prix")
    private Double prix;

    @Temporal(TemporalType.DATE)
    private Date dateAchat;

    @Enumerated(EnumType.STRING)
    @Column(length = 100, name = "statut")
    private StatutTicket statut;

}
