package   Propi;
public class ClasseCriptografica {

    // Desplaçament fix: evita valors negatius sense perdre informació
    private static final int OFFSET = 1000;

    public static String Encripta(String missatge, String clau) {//Xifrat = 2·lletra − clau + 1000
        StringBuilder resultat = new StringBuilder();

        for (int i = 0; i < missatge.length(); i++) {
            char lletra = missatge.charAt(i);
            char clauChar = clau.charAt(i % clau.length());

            int diferencia = lletra - clauChar;
            int xifrat = lletra + diferencia + OFFSET;

            resultat.append((char) xifrat);
        }
        return resultat.toString();
    }

    public static String Desencripta(String missatgeXifrat, String clau) { // lletra = (xifrat − 1000 + clau) / 2
        StringBuilder resultat = new StringBuilder();

        for (int i = 0; i < missatgeXifrat.length(); i++) {
            char xifrat = missatgeXifrat.charAt(i);
            char clauChar = clau.charAt(i % clau.length());

            int original = (xifrat - OFFSET + clauChar) / 2;

            resultat.append((char) original);
        }
        return resultat.toString();
    }
}