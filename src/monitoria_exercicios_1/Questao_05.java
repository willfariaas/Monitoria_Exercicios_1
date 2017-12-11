package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_05 {
    
    public static void main(String[] args) {
        int q;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a quantidade de coelhos: ");
        q = s.nextInt();
        double c;
        c = (q * 0.70) / (18 + 10);
        System.out.print("Custo: " + c);
    }
}
