package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_04 {
    
    public static void main(String[] args) {
        double valorGasto, percentual;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o valor gasto: ");
        valorGasto = s.nextDouble();
        System.out.print("Digite o percentual de serviço: ");
        percentual = s.nextDouble();
        double valorTotal;
        valorTotal = valorGasto+((valorGasto*percentual)/100);
        System.out.println("Valor total a ser pago: " + valorTotal);
    }
}
