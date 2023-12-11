package lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leia.nextInt();
            }
        }
        leia.close();

        System.out.println("Elementos da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();


        System.out.println("Elementos da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }
        System.out.println();


        int somaDiagPrinc = 0;
        for (int i = 0; i < 3; i++) {
        	somaDiagPrinc += matriz[i][i];
        }

        int somaDiagSec = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagSec  += matriz[i][2 - i];
        }

        System.out.println("Soma da Diagonal Principal: " + somaDiagPrinc);
        System.out.println("Soma da Diagonal Secundária: " + somaDiagSec);

	}

}
