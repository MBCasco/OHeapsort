package com.company;

import java.util.Scanner;

public class lectorTeclado {


    public Scanner sc;

    public lectorTeclado() {
        sc = new Scanner(System.in);
    }
    int leerEntero(String mensaje, String reintento) {
        int val = 0;
        boolean primerainteracion = true;
        do {
            if(primerainteracion) {
                System.out.print(mensaje);
                primerainteracion = false;
            }else {
                sc.next();
                System.out.println(reintento);
            }
        }while (!sc.hasNextInt());
        val = sc.nextInt();
        return val;
    }

}
