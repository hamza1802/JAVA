package main;

import entities.Employe;
import services.SocieteArrayList;

import java.util.List;

public class MainEmploye {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("APPLICATION DE GESTION DES EMPLOYÉS (SOCIÉTÉ TUNISIENNE)");
        System.out.println("==================================================");

        SocieteArrayList societe = new SocieteArrayList();

        // Création de plusieurs employés
        Employe emp1 = new Employe(103, "Ben Ali", "Ahmed", "Informatique", 2);
        Employe emp2 = new Employe(101, "Trabelsi", "Sami", "RH", 1);
        Employe emp3 = new Employe(105, "Gharbi", "Mouna", "Informatique", 1);
        Employe emp4 = new Employe(102, "Bouazizi", "Karim", "Finance", 3);
        Employe emp5 = new Employe(104, "Ayari", "Ines", "Informatique", 2); // Même département et grade que emp1, nom différent

        // 1. Ajout des employés
        System.out.println("\n--- 1. Ajout des employés ---");
        societe.ajouterEmploye(emp1);
        societe.ajouterEmploye(emp2);
        societe.ajouterEmploye(emp3);
        societe.ajouterEmploye(emp4);
        societe.ajouterEmploye(emp5);

        // 2. Affichage
        System.out.println("\n--- 2. Liste des employés enregistrés ---");
        societe.displayEmploye();

        // 3. Recherche par nom
        System.out.println("\n--- 3. Recherche par nom ---");
        System.out.println("Recherche de 'Trabelsi' : " + societe.rechercherEmploye("Trabelsi"));
        System.out.println("Recherche de 'Inconnu'  : " + societe.rechercherEmploye("Inconnu"));

        // 4. Recherche par objet Employe
        System.out.println("\n--- 4. Recherche par objet Employe ---");
        Employe empSearch = new Employe(101, "Trabelsi", "Sami", "RH", 1);
        Employe empNotFound = new Employe(999, "Test", "Test", "RH", 1);
        System.out.println("Recherche de emp1 (id 103, Ben Ali) : " + societe.rechercherEmploye(emp1));
        System.out.println("Recherche de empSearch (id 101, Trabelsi) : " + societe.rechercherEmploye(empSearch));
        System.out.println("Recherche de empNotFound (id 999) : " + societe.rechercherEmploye(empNotFound));

        // 5. Tri naturel par ID (Comparable)
        System.out.println("\n--- 5. Tri naturel par ID (Comparable) ---");
        societe.trierEmployeParId();
        societe.displayEmploye();

        // 6. Tri personnalisé : Département, puis Grade, puis Nom (Comparator)
        System.out.println("\n--- 6. Tri personnalisé par Département, Grade et Nom (Comparator) ---");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        // 7. Recherche avancée par département (IRechercheAvancee)
        System.out.println("\n--- 7. Recherche avancée par département (IRechercheAvancee) ---");
        String deptSearch = "Informatique";
        System.out.println("Employés du département '" + deptSearch + "' :");
        List<Employe> informaticiens = societe.rechercherParDepartement(deptSearch);
        for (Employe e : informaticiens) {
            System.out.println(" -> " + e);
        }

        // 8. Suppression d'un employé
        System.out.println("\n--- 8. Suppression de l'employé emp2 (Trabelsi) ---");
        societe.supprimerEmploye(emp2);
        societe.displayEmploye();
    }
}
