package jpa.ordinateur;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="ORDINATEUR_DISPO")
public class Ordinateur_dispo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ordinateur_dispo;
    private int id_ordinateur;

    @ManyToOne
    @JoinColumn(name = "id_ordinateur", nullable = false)
    private Ordinateur ordinateur;

    public Ordinateur_dispo() {
        this(0);
    }

    public Ordinateur getOrdinateur() {
        return this.ordinateur;
    }

    public Ordinateur_dispo(int id_ordinateur) {
        this.id_ordinateur = id_ordinateur;
    }

    public int getId_ordinateur_dispo() {
        return id_ordinateur_dispo;
    }

    public int getId_ordinateur() {
        return id_ordinateur;
    }

    public void setId_ordinateur(int id_ordinateur) {
        this.id_ordinateur = id_ordinateur;
    }
}
