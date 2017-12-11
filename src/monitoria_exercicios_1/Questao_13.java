package monitoria_exercicios_1;

import java.util.Scanner;

public class Questao_13 {

    public static void main(String[] args) {
        double valor_fabrica, porc_distribuidor, impostos, valor_consumidor;
        System.out.print("Informe o valor do carro para o fabricante: ");
        Scanner s = new Scanner(System.in);
        valor_fabrica = s.nextDouble();
        porc_distribuidor = (valor_fabrica * 0.28);
        impostos = (valor_fabrica * 0.45);
        valor_consumidor = (valor_fabrica + porc_distribuidor + impostos);
        System.out.print("O valor final do carro a ser pago pelo consumidor é: " + valor_consumidor);
    }
}
