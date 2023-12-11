package lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] vetor = {2,5,1,3,4,9,7,8,10,6};

        System.out.println("Digite um número que queira pesquisar: ");
        int num = leia.nextInt();

        int posicao = pesquisaNumero(vetor, num);

        if(posicao != -1) {
            System.out.println("O número " + num + "está localizado na posição: " + posicao);
        } else {
            System.out.println("Não foi encontrado!");
        }
    }

    private static int pesquisaNumero(int[] vetor, int num) {
        for(int i = 0; i < vetor.length; i++) {
           if(vetor[i] == num) {
               return i;
           }
        }
        return -1;
    }
}
