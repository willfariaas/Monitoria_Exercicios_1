package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_09 {

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o 1º número: ");
        a = s.nextInt();
        System.out.print("Digite o 2º número: ");
        b = s.nextInt();
        System.out.print("Digite o 3º número: ");
        c = s.nextInt();
        System.out.print("Digite o 4º número: ");
        d = s.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " + " + c + " = " + (a + c));
        System.out.println(a + " * " + c + " = " + (a * c));
        System.out.println(a + " + " + d + " = " + (a + d));
        System.out.println(a + " * " + d + " = " + (a * d));
        System.out.println(b + " + " + c + " = " + (b + c));
        System.out.println(b + " * " + c + " = " + (b * c));
        System.out.println(b + " + " + d + " = " + (b + d));
        System.out.println(b + " * " + d + " = " + (b * d));
        System.out.println(c + " + " + d + " = " + (c + d));
        System.out.println(c + " * " + d + " = " + (c * d));
    }
}
