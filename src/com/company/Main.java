package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variable booleana para imprimir el resultado final.
        boolean capicua=false;
        int numero;
        //Pedimos el número y lo asignamos a la variable
        System.out.println("Introduzca un número entre 0 y 9.999:\n");
        Scanner sc=new Scanner(System.in);
        numero=sc.nextInt();
        //Comprobamos que el número introducido esta en el rango que hemos definido, y si no lo está, volvemos a pedir un número por consola
        while(numero<0||numero>9999) {
            System.out.println("Introduzca un número entre 0 y 9.999:\n");
            numero = sc.nextInt();
        }

        //Separamos el número en sus componentes.
        int unidades=numero%10;
        numero=numero/10;
        int decenas=numero%10;
        numero=numero/10;
        int centenas=numero%10;
        numero=numero/10;
        int millares=numero;


        //Comprobamos cada componente de mayor grado por si es cero, y en función de eso, comprobamos si las cifras del numero son iguales desde los extremos.
        if (millares!=0){
            if((unidades==millares)&&(decenas==centenas)){
                capicua=true;
            }
        }else{
            if(centenas!=0){
                if(unidades==centenas){
                    capicua=true;
                }
            }else{
                if(decenas!=0){
                    if(unidades==decenas){
                        capicua=true;
                    }
                }else{
                    //He añadido esto porque no tenia muy claro si un numero de una sola cifra se considera capicua o no.
                    System.out.println("El número es de una sola cifra.");
                }
            }
        }

        //Comprobamos la variable capicua para mostrar el resultado adecuado.
        if(capicua){
            System.out.println("El número introducido es capicua.");
        }else{
            System.out.println("El número introducido no es capicua.");
        }
        //Cerramos el scanner.
        sc.close();
    }
}
