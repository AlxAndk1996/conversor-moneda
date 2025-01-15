package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        consultaDeMoneda consulta = new consultaDeMoneda();

        int opcionElegida = 0;
        while (opcionElegida != 8){
            System.out.print("\n\n****************************************\n");
            System.out.println("*******---CONVERSOR DE MONEDA---********");
            System.out.println("ingrese el tipo de conversion a realizar\n");
            System.out.print("1.Dolar a Peso Argentino\n");
            System.out.print("2.Peso Argentino a Dolar\n");
            System.out.print("3.Dolar a Real Brasileño\n");
            System.out.print("4.Real Brasileño a Dolar\n");
            System.out.print("5.Dolar a Peso Colombiano\n");
            System.out.print("6.Peso Colombiano a Dolar\n");
            System.out.print("7.realizar otro tipo de conversion\n");
            System.out.print("8.SALIR\n\n");

            opcionElegida = scanner.nextInt();
            scanner.nextLine();

            switch (opcionElegida){
                case 1:
                    conversionDeMoneda.conversion("USD", "ARS", consulta, scanner);
                    break;

                case 2:
                    conversionDeMoneda.conversion("ARS", "USD", consulta, scanner);
                    break;

                case 3:
                    conversionDeMoneda.conversion("USD", "BRL", consulta, scanner);
                    break;

                case 4:
                    conversionDeMoneda.conversion("BRL", "USD", consulta, scanner);
                    break;

                case 5:
                    conversionDeMoneda.conversion("USD", "COP", consulta, scanner);
                    break;

                case 6:
                    conversionDeMoneda.conversion("USD", "COP", consulta, scanner);
                    break;

                case 7:
                    conversionDeMoneda.conversionDeMonedaDiferente(consulta, scanner);
                    break;

                case 8:
                    System.out.println("TERMINANDO PROCESO");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}