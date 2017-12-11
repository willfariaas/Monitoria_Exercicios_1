package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_11 {

    public static void main(String[] args) {
        int veiculosEstacionados;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a quantidade de veículos estacionados no momento: ");
        veiculosEstacionados = s.nextInt();
        double v;
        v = (42 - veiculosEstacionados) * 1.75;
        System.out.println(v);
    }
}
