package br.com.alura.conversor.presentation;

import br.com.alura.conversor.domain.Currency;
import br.com.alura.conversor.domain.ExchangeResponse;
import br.com.alura.conversor.infrastructure.ExchangeApiClient;
import br.com.alura.conversor.service.ExchangeService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ExchangeService service = new ExchangeApiClient();

        int option;
        while (true) {
            System.out.println("**************************************************");
            System.out.println("Seja bem vindo ao conversor moedas \n");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileiro");
            System.out.println("4) Real brasileiro => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Sair");
            System.out.println("**************************************************");
            System.out.print("\nDigite sua opção: ");

            option = scan.nextInt();
            if (option == 7){
                System.out.println("Encerrando o programa...");
                break;
            }

            Currency base = null;
            Currency target = null;

            switch (option) {
                case 1 -> {
                    base = Currency.USD;
                    target = Currency.ARS;
                }
                case 2 -> {
                    base = Currency.ARS;
                    target = Currency.USD;
                }
                case 3 -> {
                    base = Currency.USD;
                    target = Currency.BRL;
                }
                case 4 -> {
                    base = Currency.BRL;
                    target = Currency.USD;
                }
                case 5 -> {
                    base = Currency.USD;
                    target = Currency.COP;
                }
                case 6 -> {
                    base = Currency.COP;
                    target = Currency.USD;
                }
            }

            if (base != null) {
                System.out.print("Digite o valor que deseja converter: ");
                double valor = scan.nextDouble();

                ExchangeResponse response = service.getExchange(base, target);
                double resultado = valor * response.getConversion_rate();

                System.out.printf("Valor: %.2f [%s] corresponde ao valor final de => %.2f [%s]%n", valor, base,
                        resultado, target);
            }
        }
    }
}
