package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_08 {

    public static void main(String[] args) {
        double nota1, nota2, nota3;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe a 1º nota: ");
        nota1 = s.nextDouble();
        System.out.print("Informe a 2º nota: ");
        nota2 = s.nextDouble();
        System.out.print("Informe a 3º nota: ");
        nota3 = s.nextDouble();
        double m;
        m = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
        System.out.println("Média: " + m);
    }
}
