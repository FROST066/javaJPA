package jpa.ordinateur;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="ORDINATEUR")
public class ordinateur implements Serializable {
    
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ordinayeur;
    private String marque;
    private String processeur;
    private double rom;
    private double ram;
    private double vitesse;

    public ordinateur() {
        this("unknow", "unknow", 0, 0, 0);
    }

    public ordinateur(String marque, String processeur, double rom, double ram, double vitesse) {
        this.marque = marque;
        this.processeur = processeur;
        this.ram = ram;
        this.rom = rom;
        this.vitesse = vitesse;
    }

    public int getId_ordinayeur() {
        return id_ordinayeur;
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

    public void setId_ordinayeur(int id_ordinayeur) {
        this.id_ordinayeur = id_ordinayeur;
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
