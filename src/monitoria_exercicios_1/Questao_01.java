package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_01 {

    public static void main(String[] args) {
        int numero;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        numero = s.nextInt();
        double quadrado;
        quadrado = numero*numero;
        System.out.println("O quadrado deste número é: " + quadrado);
    }

}
