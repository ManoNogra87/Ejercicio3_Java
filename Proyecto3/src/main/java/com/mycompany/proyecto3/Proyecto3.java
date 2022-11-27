package com.mycompany.proyecto3;
import java.util.Scanner;

public class Proyecto3 {
    //menu del proyecto general
    public static void main(String[] args) {
        //variable
        int opcion;
        //solicitud de dato
        System.out.println("Por favor seleccione uno numero entre el 1,2 y 3 "
                + "de acuerdo al ejercicio que desea ejecutar");
        //inicializando el lector
        Scanner captura = new Scanner(System.in);
        //capturando valor        
        opcion = captura.nextInt();
        
        //llamado a la clase correspondiente al ejercicio
        if (opcion == 1) {
            Ejercicio1();
        } 
        
        if (opcion == 2){
            Ejercicio2();
        }
        
        if (opcion == 3){
            Ejercicio3();
        }        
    }

    /* En un hospital nacen bebés niños y niñas
    se desea hacer un programa para saber cuántos son niños y cuántas son niñas.
    El programa finaliza cuando se terminen los nacimientos.*/
    private static void Ejercicio1() {
        //variables para almacenar conteo
        int nino = 0;
        int nina = 0;
        int genero = 3;
       
        //se crea un ciclo while para poder admitir varios datos de manera rapida
        while (genero != 0) { 
            //solicitar  dato del bebe recien nacido
             System.out.println("Ingrese por favor el genero del bebe recien nacido. "
                + "1 para niño o 2 para niña");
            //inicializando el lector
            Scanner captura = new Scanner(System.in);
            //captura de dato
            genero = captura.nextInt(); 
            //con un ciclo swith para validar si nacio un niño o niña
            if (genero == 1){
                nino++;
            }
            if (genero == 2){
                nina++;
            }
        }
        
        System.out.println("La cantidad de niños es de: "+nino);
        System.out.println("La cantidad de niñas es de: "+nina);              
    }

    /*Un trabajador necesita saber cuanto gana,
    suponiendo que se le paga por horas, gana se acuerdo a las horas trabajadas.
    */
    private static void Ejercicio2() {
        //variable de salario_ neto
        double salario_neto = 0.00;
        //inicializamos los capturadores de informacion
        Scanner horas = new Scanner(System.in);
        Scanner valor = new Scanner(System.in);
        
        //solicitar valor de la hora del trabajador
        System.out.println("Por favor ingresar la cantidad de horas trabajadas");
        Integer can =  horas.nextInt();
        System.out.println("Por favor ingresar el valor de la Hora");
        double pesos =  valor.nextDouble();
        
        if (can > 0){
            salario_neto = (can * pesos);
        }
        
        if (salario_neto == 0.00){
            System.out.println("El trabajado no recibira salario porque sus horas"
                    + "trabajadas fuero "+can+" y el valor de su hora fue de "+pesos+"");
        } else if (salario_neto > 0.00 ){
            System.out.println("El salario neto del trabajador es de: "+salario_neto+"");
        }    
    }

    /*Primero se lee un numero, que es introducido por teclado 
    y se hacen comparaciones para verificar si es negativo, mayor a 100 o en el intervalo 0-100.
    Finalmente se despliega por pantalla la condición de dicho numero.*/
    private static void Ejercicio3() {
        System.out.println("Ingrese su numero");
        //inicializando captura de dato
        Scanner numero = new Scanner(System.in);
        //capturando dato
        int valor = numero.nextInt();
        //realizar comparacion del valor
        if (valor < 0){
            System.out.println("El numero ingresado es negativo");
        }
        if (valor > 100){
            System.out.println("El numero ingresado es mayor a 100");  
        }
        if (valor >= 0 && valor <= 100){
             System.out.println("El numero se encuentra en el intervalo de 0 a 100");
        }
    }
}
