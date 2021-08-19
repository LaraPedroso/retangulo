package entities;


import java.util.Locale;
import java.util.Scanner;

import renti.Retan;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retan retra = new Retan();

        System.out.println("Enter rectangle width");
        retra.width = sc.nextDouble();

        System.out.println("Enter rectangle Height");
        retra.height = sc.nextDouble();

        System.out.println();
        System.out.println(retra);

        sc.close();
		
	}

}
