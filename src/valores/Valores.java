package valores;

import java.util.Scanner;

/**
 *
 * @author Lucas Friedrich
 */
public class Valores {
    public static void main(String[] args) {
    double saldoMedio, valorCredito = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o valor do saldo medio do cliente: ");
        saldoMedio = ler.nextDouble();
        
        if(saldoMedio<=200){
          valorCredito = 0;
        }else
            if(saldoMedio>200 && saldoMedio <=400){
                valorCredito = saldoMedio * 0.20;
        }else
            if(saldoMedio>400 && saldoMedio <=600){
                valorCredito = saldoMedio * 0.30; 
        }else
            if(saldoMedio>600){
                valorCredito = saldoMedio * 0.40;
        }
        System.out.println("Seu saldo é de R$  " +saldoMedio+ 
                "\nVocê tera direito de receber R$ " +valorCredito + " de credito");
    }
}
