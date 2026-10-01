public class ClasseCriptografica {
    //xifrat = 2·lletra − clau
    public String Encripta(String missatge, String clau) {

        StringBuilder resultat = new StringBuilder();

        for (int i = 0; i < missatge.length(); i++) {

            char lletra = missatge.charAt(i);

            char clauChar = clau.charAt(i % clau.length()); 

            int diferencia = lletra - clauChar;

            int xifrat = lletra + diferencia; 

            resultat.append((char) xifrat);
        }

        return resultat.toString();
    }
    //original = (xifrat + clau) / 2
    public String Desencripta(String missatgeXifrat, String clau) {

        StringBuilder resultat = new StringBuilder();

        for (int i = 0; i < missatgeXifrat.length(); i++) {

            char xifrat = missatgeXifrat.charAt(i);

            char clauChar = clau.charAt(i % clau.length());

            int original = (xifrat + clauChar) / 2;

            resultat.append((char) original);
        }

        return resultat.toString();
    }
}