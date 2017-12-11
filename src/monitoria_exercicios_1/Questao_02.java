package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_02 {
    
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Informe quatro números inteiros:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        double diferenca;
        diferenca = (a*b)-(c*d);
        System.out.println("Resultado: " + diferenca);
    }
}
