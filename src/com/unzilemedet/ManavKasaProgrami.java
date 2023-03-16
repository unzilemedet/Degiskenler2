package com.unzilemedet;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo, toplamTutar;

        System.out.print("Armut Kaç Kilo ? :");
         armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
       elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKilo = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muzKilo = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKilo = input.nextDouble();

        toplamTutar = (armutKilo * 2.14) + (elmaKilo * 3.67) + (domatesKilo * 1.11) + (muzKilo * 0.95) + (patlicanKilo * 5.00);

        System.out.println("Toplam Tutar : " + String.format("%.2f", toplamTutar) + " TL");

    }
}