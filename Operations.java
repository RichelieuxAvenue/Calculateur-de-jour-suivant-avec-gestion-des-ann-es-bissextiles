public class Operations {
    public static boolean bisextile(int annee){
        return annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0);
    }
}
