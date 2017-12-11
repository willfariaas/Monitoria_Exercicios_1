package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_06 {
    
    public static void main(String[] args) {
        double v, j;
        int t;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o valor da compra: ");
        v = s.nextDouble();
        System.out.print("Informe a taxa de juros: ");
        j = s.nextDouble();
        System.out.print("Informe o tempo: ");
        t = s.nextInt();
        double p;
        p = v + (v*(j/100)*t);
        System.out.println("Valor da prestação: " + p);
    }
}
