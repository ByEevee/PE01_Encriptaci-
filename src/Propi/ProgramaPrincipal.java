package Propi;

import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean programaContinua = true;

        while (programaContinua) {
            System.out.print("Introdueix la clau per xifrar: ");
            String clau = entrada.nextLine();

            System.out.print("Introdueix el missatge: ");
            String missatge = entrada.nextLine();

            String xifrat = ClasseCriptografica.Encripta(missatge, clau);
            System.out.println("Missatge original: " + missatge);
            System.out.println("Missatge xifrat: " + xifrat);

            System.out.print("Introdueix la clau per desencriptar: ");
            String clauDesencripta = entrada.nextLine();

            String desxifrat = ClasseCriptografica.Desencripta(xifrat, clauDesencripta);
            System.out.println("Missatge recuperat: " + desxifrat);

            System.out.print("Vols continuar? (s/n): ");
            String resposta = entrada.nextLine();

            if (!resposta.equalsIgnoreCase("s")) {
                programaContinua = false;
            }
        }

        entrada.close();
    }
}