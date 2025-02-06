package metier;

import jakarta.persistence.*;

@Entity
public class Stats {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "evenement_id")
    private Evenement evenement;
}
