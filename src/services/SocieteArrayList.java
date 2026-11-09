package services;

import entities.Employe;
import interfaces.IGestion;
import interfaces.IRechercheAvancee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private ArrayList<Employe> employes;

    public SocieteArrayList() {
        this.employes = new ArrayList<>();
    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(ArrayList<Employe> employes) {
        this.employes = employes;
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        if (employe != null) {
            employes.add(employe);
        }
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        if (nom == null) {
            return false;
        }
        for (Employe e : employes) {
            if (e.getNom() != null && e.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        if (employes.isEmpty()) {
            System.out.println("Aucun employé enregistré dans la société.");
            return;
        }
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        // Tri naturel (Comparable<Employe>)
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        // Tri personnalisé : département, puis grade, puis nom
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                // 1. Comparaison par nom de département
                int compDept = 0;
                if (e1.getNomDepartement() != null && e2.getNomDepartement() != null) {
                    compDept = e1.getNomDepartement().compareToIgnoreCase(e2.getNomDepartement());
                } else if (e1.getNomDepartement() != null) {
                    compDept = 1;
                } else if (e2.getNomDepartement() != null) {
                    compDept = -1;
                }
                if (compDept != 0) {
                    return compDept;
                }

                // 2. Comparaison par grade
                int compGrade = Integer.compare(e1.getGrade(), e2.getGrade());
                if (compGrade != 0) {
                    return compGrade;
                }

                // 3. Comparaison par nom
                if (e1.getNom() != null && e2.getNom() != null) {
                    return e1.getNom().compareToIgnoreCase(e2.getNom());
                }
                return 0;
            }
        });
    }

    public void trierEmployeParNomDepartementEtGrade() {
        trierEmployeParNomDépartementEtGrade();
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();
        if (nomDepartement == null) {
            return resultat;
        }
        for (Employe e : employes) {
            if (e.getNomDepartement() != null && e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                resultat.add(e);
            }
        }
        return resultat;
    }
}
