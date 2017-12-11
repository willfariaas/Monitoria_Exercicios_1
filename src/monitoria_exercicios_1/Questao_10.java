package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_10 {
    
    public static void main(String[] args) {
        int IdadeDias;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe a idade (em dias): ");
        IdadeDias = s.nextInt();
        int anos, meses;
        anos = IdadeDias / 365;
        IdadeDias = IdadeDias % 365;
        meses = IdadeDias / 30;
        IdadeDias = IdadeDias % 30;
        System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + IdadeDias + " dia(s)");
    }
}
