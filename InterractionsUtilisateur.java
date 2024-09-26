import javax.swing.JOptionPane;
public class InterractionsUtilisateur {

    public static int demanderAnnee(String prompt){
        int annee = 0;
        boolean valeurValide = false;
        while (!valeurValide){
            try {
                annee = Integer.parseInt(JOptionPane.showInputDialog(null, prompt));
                if (annee>2400 || annee<1900){
                    throw new Exception("");
                }
                else {
                    valeurValide = true;
                    break;
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "🛑Erreur veuillez saisir une année entre 1900 et 2400: ");
            }
        }
        return annee;
    }

    public static int demanderMois(String prompt){
        int mois = 0;
        boolean valeurValide = false;
        while (!valeurValide){
            try {
                mois = Integer.parseInt(JOptionPane.showInputDialog(null, prompt));
                if (mois>12 || mois<1){
                    throw new Exception("");
                }
                else {
                    valeurValide = true;
                    break;
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "🛑Erreur veuillez saisir un mois entre 1 et 12: ");
            }
        }
        return mois;
    }

    public static int demanderJour(String prompt, int debut, int fin){
        int jour = 0;
        boolean valeurValide = false;
        while (!valeurValide){
            try {
                jour = Integer.parseInt(JOptionPane.showInputDialog(null, prompt));
                if (jour>fin || jour<debut){
                    throw new Exception("");
                }
                else {
                    valeurValide = true;
                    break;
                }
            }
            catch (Exception e){
                String mesage = String.format("🛑Veuillez choisir un jour entre %d et %d🛑", debut, fin);
                JOptionPane.showMessageDialog(null, mesage);
            }
        }
        return jour;
    }
}
