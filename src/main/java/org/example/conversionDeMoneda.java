package org.example;

import java.util.Scanner;

public class conversionDeMoneda {

    public static void conversion(String monedaBase, String moneda_target, consultaDeMoneda consulta, Scanner scanner){
        double cantidad;
        double monedadConvertida;

        Monedas monedas = consulta.buscarMonedas(monedaBase, moneda_target);
        System.out.println("la tasa de conversion para hoy es de: \n1"+monedaBase+ "="+monedas.conversion_rate()+" "+ moneda_target);
        System.out.println("ingrese la contidad de "+monedaBase);
        cantidad = Double.parseDouble(scanner.nextLine());
        monedadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+" Equivalen a "+monedadConvertida+" "+ monedas.target_code());
    }
    public static void conversionDeMonedaDiferente(consultaDeMoneda consulta, Scanner scanner){
        System.out.println("ingrese el codigo de la moneda base: ");
        String monedaBase = scanner.nextLine().toUpperCase();
        System.out.println("ingrese el codigo de la moneda resultante:");
        String monedaResultante = scanner.nextLine().toUpperCase();
        conversion(monedaBase, monedaResultante, consulta, scanner);
    }
}
