import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Demande les informations de base
        int annee = InterractionsUtilisateur.demanderAnnee("Veuillez saisir une année entre 1900 et 2400");
        boolean estBisextile = Operations.bisextile(annee);
        int mois = InterractionsUtilisateur.demanderMois("Veuillez saisir un mois entre 1 et 12");
        int jour = 0;

        // Demande du jour en fonction du mois et de l'année bissextile
        switch (mois) {
            case 1, 3, 5, 7, 8, 10, 12 -> jour = InterractionsUtilisateur.demanderJour("Veuillez choisir un jour entre 1 et 31", 1, 31);
            case 4, 6, 9, 11 -> jour = InterractionsUtilisateur.demanderJour("Veuillez choisir un jour entre 1 et 30", 1, 30);
            case 2 -> {
                if (estBisextile) {
                    jour = InterractionsUtilisateur.demanderJour("Veuillez choisir un jour entre 1 et 29", 1, 29);
                } else {
                    jour = InterractionsUtilisateur.demanderJour("Veuillez choisir un jour entre 1 et 28", 1, 28);
                }
            }
        }

        // Passage au jour suivant
        jour++;

        // Gestion des mois et années en fonction du jour
        if ((mois == 2 && ((estBisextile && jour > 29) || (!estBisextile && jour > 28))) ||
                (jour > 30 && (mois == 4 || mois == 6 || mois == 9 || mois == 11)) ||
                (jour > 31 && (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12))) {

            jour = 1;  // Le jour suivant devient le 1er du mois suivant
            mois++;    // Incrémenter le mois

            if (mois > 12) {
                mois = 1;  // Réinitialiser le mois à janvier
                annee++;   // Passer à l'année suivante
            }
        }

        // Affichage du résultat
        String messageResultat = String.format("Le jour suivant est %d/%d/%d", jour, mois, annee);
        JOptionPane.showMessageDialog(null, messageResultat);
    }
}
