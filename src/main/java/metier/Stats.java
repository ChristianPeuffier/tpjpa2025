package metier;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Stats implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "evenement_id")
    private Evenement evenement;
}
