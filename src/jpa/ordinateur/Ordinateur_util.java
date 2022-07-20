package jpa.ordinateur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Ordinateur_util {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public Ordinateur_util(){
    try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Gestion_Park");
            entityManager = entityManagerFactory.createEntityManager();
        } catch(Exception ex) {
            System.out.println("La creation de EntityManager a echoue "+ ex);
        }
    }

    public void closeEntityManager() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
    
public void ajouter_to_Ordinateur(String marque, String processeur, double rom, double ram, double vitesse) {
        EntityTransaction trans = entityManager.getTransaction();
        trans.begin();
        System.out.println("jpa.ordinateur.Ordinateur_util.ajouter_to_Ordinateur()");
        Ordinateur ordi=new Ordinateur(marque, processeur, rom, ram, vitesse);
        entityManager.persist(ordi);
        trans.commit();

    }
}
