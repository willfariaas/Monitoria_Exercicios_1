package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_12 {

    public static void main(String[] args) {
        int laranjas;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a quantidade de laranjas: ");
        laranjas = s.nextInt();
        double duzias, valorTotal;
        duzias = laranjas / 12;
        valorTotal = (8.35 / 12) * laranjas;
        System.out.println("Dúzias: " + duzias);
        System.out.println("Valor total: " + valorTotal);
    }
}
