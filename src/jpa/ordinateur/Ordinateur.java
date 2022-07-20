package jpa.ordinateur;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="ORDINATEUR")
public class Ordinateur implements Serializable {
    
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ordinateur;
    private String marque;
    private String processeur;
    private double rom;
    private double ram;
    private double vitesse;

    public Ordinateur() {
        this("unknow", "unknow", 0, 0, 0);
    }

    public Ordinateur(String marque, String processeur, double rom, double ram, double vitesse) {
        this.marque = marque;
        this.processeur = processeur;
        this.ram = ram;
        this.rom = rom;
        this.vitesse = vitesse;
    }

    public int getId_ordinayeur() {
        return id_ordinateur;
    }

    public String getMarque() {
        return marque;
    }

    public double getRam() {
        return ram;
    }

    public double getRom() {
        return rom;
    }

    public String getProcesseur() {
        return processeur;
    }

    public double getVitesse() {
        return vitesse;
    }
    
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setProcesseur(String processeur) {
        this.processeur = processeur;

    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public void setRom(double rom) {
        this.rom = rom;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }
}
