package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        //rellenando datos del heapsort
        Random lr = new Random();
        lectorTeclado lt = new lectorTeclado();

        System.out.println(" ");
        System.out.println("BIENVENIDO :D ");
        System.out.println("ESTE ES EL HEAPSORT:");
        System.out.println(" ");
        System.out.println("Numero de elementos en el arreglo: ");
        int n = lt.leerEntero("", "DEBE SER UN ENTERO");
        int larray[] = new int[n];

        System.out.println(" ");

        // El heapsort se rellena automaticamente con numeros al azar
        for (int i = 0; i < n; i++) {
            larray[i] = lr.nextInt(100);
            System.out.println("Num " + i + " = " + larray[i]);
        }


        long starTime = System.nanoTime();
        heapSort(larray);
        long endTime = System.nanoTime();
        long deltaTime = endTime - starTime;


        System.out.println("\nNUMEROS ORDENADOS->> ");
        for (int i = 0; i < n; i++) {
            System.out.print(larray[i] + " ");
            System.out.println();
        }

        System.out.println("El tiempo en nano segundos de heapsort para " + n + " elementos es de = " + deltaTime);


    }



        public static void heapSort(int[] v) {
        final int N = v.length;
        for (int nodo = N / 2; nodo >= 0; nodo--) heap(v, nodo, N - 1);
        for (int nodo = N - 1; nodo >= 0; nodo--) {
            int temp = v[0];
            v[0] = v[nodo];
            v[nodo] = temp;
            heap(v, 0, nodo - 1);
        }
        }

        // método de cambiar el elemento más grande en el heap
        public static void heap(int[] v, int nodo, int fin) {
            int izquierda = 2 * nodo;
            int derecha = 2 * nodo + 1;
            int mayor = nodo ;
            int N = fin;
            if (izquierda <= N && v[izquierda] > v[nodo])
                mayor = izquierda;
            if (derecha <= N && v[derecha] > v[mayor])
                mayor = derecha;

            if (mayor != nodo) {
                swap(v, nodo, mayor);
                heap(v, mayor, fin);
            }

        }
        // método que cambia dos números en el array
        public static void swap(int v[], int i, int j) {
            int tmp = v[i];
            v[i] = v[j];
            v[j] = tmp;

        }

}

