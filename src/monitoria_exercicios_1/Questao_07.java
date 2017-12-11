package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_07 {

    public static void main(String[] args) {
        int numero, horas;
        double valor;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número do funcionário: ");
        numero = s.nextInt();
        System.out.print("Digite o número de horas trabalhadas: ");
        horas = s.nextInt();
        System.out.print("Digite o valor que recebe por hora: ");
        valor = s.nextDouble();
        double salario;
        salario = valor * horas;
        System.out.println("Número do funcionário: " + numero + "\nSalário: R$ " + salario);
    }
}
