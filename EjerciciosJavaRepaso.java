
package ejerciciosjavarepaso;

import java.util.Scanner;

/**
 *
 * @author elvis
 */
public class EjerciciosJavaRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         String negro = "\033[30m";
         String rojo = "\033[31m";
         String verde = "\033[32m";
         String amarillo = "\033[33m";
         String azul = "\033[34m";
         String magenta = "\033[35m";
         String blanco = "\033[37m";
         String cyan = "\033[36m";
         String reset = "\u001B[0m";
        
        
        // ******   Ejercicio 1  ******
        /*
        1) Una tienda ofrece un descuento del 15% sobre el total de la compra durante el mes de octubre. Dado un mes y un importe, calcular cuál es la cantidad que se debe cobrar al cliente.
        */        
        System.out.println(amarillo+"\n*** Ejercicio 1 ***\u001B[0m");
        Scanner teclado = new Scanner(System.in);
        
        float descuentoOctubre = 15f;
        float precioTotal;
                       
        // ******   ***   Proceso de Ingreso Mes del Año   ***   ******                
        System.out.print("Por favor ingrese un numero que corresponda a un mes del año: ");
        int mes = teclado.nextInt();
        
        // *** Validar Mes ***
        while(mes < 1 || mes > 12){
            // *** Opción Invalida ***
            System.out.println("\nError...! \nEl Mes debe ser un número entre 1 y 12.");                                        System.out.print("\nIngrese un número que corresponda a un mes del año: ");
            mes = teclado.nextInt();        
        }
        // *** Mesanje Mes Correcto ***
        System.out.println(amarillo+"\n*.- El Mes es válido -.*\n\n*** B I E N V E N I D O ***\u001B[0m");
        System.out.print("Por favor ingrese el precio: ");
        float precio = teclado.nextFloat();        
        // *** Validar Mes de Descuento ***
        if(mes == 10){
            System.out.println(amarillo+"\n*** Saludos! Este mes ofrecemos 15% de descuento sobre el importe de sus compras ***\u001B[0m");
            precioTotal = precio - (precio * descuentoOctubre)/100;
            System.out.print("\nCantidad a cobrar al cliente: " + amarillo + precioTotal);
        }else{
            System.out.print("\nCantidad a cobrar al cliente: " + precio);
        }
        System.out.println("\nGracias por su compra! *.- Hasta pronto!\n");
        
        // ******   Ejercicio 2  ******
        /*
        2) Crear un programa que pida al usuario un número y un símbolo, y dibuje un cuadrado usando ese símbolo. El cuadrado tendrá el tamaño que ha indicado el usuario. Por ejemplo, si el usuario introduce 4 como tamaño y * como símbolo, deberá escribirse algo como:
****
****
****
****
        */        
        System.out.println(verde+"*** Ejercicio 2 ***\u001B[0m");
        // *** Proceso ingreso de número ****
        System.out.print("Por favor ingrese un número: ");
        int num = teclado.nextInt();
        // *** Proceso ingreso de símbolo (Puede referirse a "x" carácter; letra, números, símbolos) ****
        System.out.print("Por favor ingrese un símbolo: ");
        char simbolo = teclado.next().charAt(0);
        System.out.println("");
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(verde+" " + simbolo);
            }
            System.out.println("");
        }
        
        // ******   Ejercicio 3  ******
        /*
        3) Se pide representar el algoritmo que nos calcule la suma de los N primeros números naturales. N se leerá por teclado. Ejemplo, si ingresamos 4, hacer: 1+2+3+4 = 10
        */        
        System.out.println(cyan+"\n*** Ejercicio 3 ***\u001B[0m");
        System.out.println("Programa para sumar los N primeros números naturales");
        // *** Declarar variable ***
        int suma = 0;
        // *** Proceso ingreso de número ****
        System.out.print("Por favor ingrese un número: ");
        int n = teclado.nextInt();
                        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " + " + suma);
            suma += i;           
            System.out.println(" El resultado de los " + n + " primeros números naturales da: " + suma);
        }
        System.out.println(cyan+"\nEl resultado total de la SUMA de los " + n + " primeros números naturales da: " + cyan + suma);
        System.out.println("");
        
        // ****** Ejercicio 4 ******
        /*
        4) Crear un programa que visualice la cuenta de los números que son múltiplos de 2 o de 3 que hay entre 1 y 100.
        */
        System.out.println(azul+"\n*** Ejercicio 4 ***\u001B[0m");
        System.out.println("Programa que visualice la cuenta de los números que son múltiplos de 2 o de 3 que hay entre 1 y 100.");
        // *** Declarar variables ***
        int numero = 1;
        int multiplosDeDos = 0;
        int multiplosDeTres = 0;
        // *** Validar que numero sea menor o igual a 100 *** 
        while (numero <= 100){
            // *** Validando que número sea multiplo de 2 ***            
            if(numero %2 == 0){
                System.out.println("Número es multiplo de 2: " + numero);
                multiplosDeDos += 1;            
            }
                // *** Validando que número sea multiplo de 3 ***
                if(numero %3 == 0){
                    System.out.println("Número es multiplo de 3: " + numero);
                    multiplosDeTres += 1;            
                }
        numero += 1;
        }
        
        System.out.println(cyan+"\nNumeros multiplos de 2: " + cyan + multiplosDeDos);
        System.out.println(azul+"Numeros multiplos de 3: " + multiplosDeTres);
        
        // ****** Ejercicio 5 ****** No está completo!!!
        /*
        5) Desarrollar un programa que permita ingresar un número N. Acto seguido, permitir ingresar N números. La computadora muestra cuál fue el mayor y en qué orden apareció. Ejemplo: Se ingresa 5, luego 4 8 6 7 5, la computadora muestra: "El mayor es el 8 en la 2° posición".
        */
        System.out.println(amarillo+"\n*** Ejercicio 5 ***\u001B[0m");
        // *** Declarar variables ***
        boolean maximo = true;
        int numeroMayor = 0;
        int posicion = 0;
        // *** Proceso ingreso de número ****
        System.out.print("Por favor ingrese la cantidad de (N) números que desee verificar: ");
        int cantidad = teclado.nextInt();
        System.out.println("Ingrese los números: ");
        
        for (int i = 1; i <= cantidad; i++) {
            num = teclado.nextInt();
            if(maximo == true){
                numeroMayor = num;
                maximo = false;
            }else{
                if(num > numeroMayor){
                    numeroMayor = num;
                }
            }           
        }        
        System.out.println("El número mayor es el " + amarillo + numeroMayor + "\u001B[0m en la  posición "+ posicion);
        
        // ****** Ejercicio 6 ******
        /*
        6) Desarrollar un programa que permita ingresar un número natural. La computadora muestra el factorial del número. Ejemplo: Se ingresa 5, la computadora muestra: 120.
        */
        System.out.println(magenta+"\n*** Ejercicio 6 ***\u001B[0m");
        // *** Proceso ingreso de número natural ***       
        System.out.print(blanco+"Por favor ingrese un número natural: \u001B[0m");
        int num1 = teclado.nextInt();
        // *** Declarar variable factorial en 1 ***
        int factorial = 1;
        // *** Validación de la estructura a recorrer, se inicializa en (1) ya que al momento de multilplicar si se inicializa en cero(0), logicamente el resultado dará cero(0). ***
        for (int i = 1; i <= num1; i++) {
            // *** Muestra en pantalla el procedimiento u operación para sacar el factorial *** 
            System.out.println(num1 + " * " + i);
            // *** Proceso de sacar el factortial multiplicando el factorial x la cantidad o veces sean hasta llegar al nro ingresado ***
            factorial = factorial * i;
            
        }
        // *** Salida de impresion por pantalla ***
        System.out.println(blanco+"El factorial del " + num1 + " es: " + magenta + factorial);
        
        // ****** Ejercicio 7 ****** Falta mostrar el número mínimo
        /*
        7) Crear un algoritmo (y su correspondiente diagrama de flujo) que lea números enteros hasta teclear 0, y nos muestre el máximo, el mínimo (sin considerar el 0) y la media (promedio) de todos ellos.
        */        
        System.out.println(blanco+"\n*** Ejercicio 7 ***\u001B[0m");
        // *** Declarar variables ***
        boolean max = true;
        boolean min = true;
        double sumatoria = 0;
        double promedio;
        int num2;
        int numMayor = 0;
        int numMenor = 1;
        int contNumeros=0;
        
        // *** Planteamiento del ejercicio ***
        System.out.println(amarillo+"Programa que lee los numeros por pantalla hasta teclear cero(0), nos muestra el maximo y el minimo, sin considerar el cero(0) y la media(promedio) de todos ellos\u001B[0m");
                
        for (;;) {
            System.out.print("\nIngrese un número: ");
            num2 = teclado.nextInt();
            // *** Validando si el nro es mayor ***
            if(max == true){
                numMayor = num2;
                max = false;
            }else{
                if(num2 > numMayor){
                    numMayor = num2;
                }
            }
            // *** Validando si el nro es menor ***
            if(min == true){
                numMenor = num2;
                min = false;
            }else{
                if(num2 < numMenor){
                    numMenor = num2;
                }
            }            
            // *** Realizando la suma de los nros ***
            sumatoria += num2;
            // *** Incremento del contador de las cantidades de Nros a promediar ***
            contNumeros++;
            // *** Si el nro es igual a cero(0) no incrementa el contador (cantidad de nros) y se sale del bucle
            if(num2 == 00){
                contNumeros--;
                break;
            }           
        }
        // *** Calcular el promedio ***
        promedio=sumatoria/contNumeros;
        // *** Impresion por pantalla/consola ***
        System.out.println(blanco+"\nLa suma de todos los números es: " + amarillo + sumatoria);
        System.out.println(blanco+"EL promedio de todos los números es: " + amarillo + promedio);
        System.out.println(blanco+"El número MAYOR es el: " + amarillo + numMayor);
        System.out.println("El número menor es el: " + numMenor);
        
        // ****** Ejercicio 8 ******
        /*
        8) Leer tres números que denoten una fecha (día, mes, año). Comprobar que es una fecha válida. Si no es válida escribir un mensaje de error. Si es válida escribir la fecha cambiando el número del mes por su nombre. Ej. si se introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”. El año debe ser mayor que 0.
        */   
        
    }
    
}
