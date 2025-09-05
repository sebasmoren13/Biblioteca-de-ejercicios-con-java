import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println(imc());

    }

   public static void menu() {

        int op = 3;
          switch (op){
              case 1:
                  System.out.println("Ejercicio dado de 2 caras");
                  break;
              case 2:
                  System.out.println("Ejercicio dado de 3 caras");
                  break;
              case 3:
                  System.out.println("Ejercicio peso corporal");
                  break;
              case 4:
                  System.out.println("");
                  break;
              case 5:
                  System.out.println("");
                  break;
              case 6:
                  System.out.println("Salir de los ejercicios");
                  break;

                  default:

    }

   public static void dados2() {

                Random aleatorio = new Random();
        int a,b,sumaD1=0,sumaD2=0;
            for (int i=1;i<=20; i++) {
                System.out.println("Numero aleatorio dado 1");
                a =aleatorio.nextInt((6 - 1) + 1) + 1;
                sumaD1+=a;

                System.out.println("Numero aleatorio dado 2");
                b = aleatorio.nextInt((6 - 1) + 1) +1;
                sumaD2+=b;
            }

            if(sumaD1<sumaD2){
                System.out.println("El dado 1 gana="+sumaD1);

            }
            else if(sumaD1>sumaD2){
                System.out.println("El dado 2 gana="+sumaD2);
        }
                else if(sumaD1==sumaD2){
                    System.out.println("EMPATE="+sumaD2);
            }





     public static void dados3() {

        Random aleatorio = new Random();
        int a,b,c,sumaD1=0,sumaD2=0,sumaD3=0;
        for (int i=1;i<=20; i++) {
            System.out.println("Numero aleatorio dado 1");
            a =aleatorio.nextInt((6 - 1) + 1) + 1;
            sumaD1+=a;
            System.out.println("Dado 1: " + a);

            System.out.println("Numero aleatorio dado 2");
            b = aleatorio.nextInt((6 - 1) + 1) +1;
            sumaD2+=b;
            System.out.println("Dado 2: " + b);

            System.out.println("Numero aleatorio dado 3");
            c = aleatorio.nextInt((6 - 1) + 1) +1;
            sumaD3+=c;
            System.out.println("Dado 3: " + c);
        }

        if (sumaD1 == sumaD2 && sumaD2 == sumaD3) {
            System.out.println("EMPATE TOTAL - Todos los dados sumaron: " + sumaD1);
        }
        else if (sumaD1 == sumaD2) {
            System.out.println("EMPATE entre Dado 1 y Dado 2  : " + sumaD1 +
                    "\nDado 3: " + sumaD3 +
                    (sumaD3 > sumaD1 ? " (GANADOR)" : " (PERDEDOR)"));
        }
        else if (sumaD1 == sumaD3) {
            System.out.println("EMPATE entre Dado 1 y Dado 3  : " + sumaD1 +
                    "\nDado 2: " + sumaD2 +
                    (sumaD2 > sumaD1 ? " (GANADOR)" : " (PERDEDOR)"));
        }
        else if (sumaD2 == sumaD3) {
            System.out.println("EMPATE entre Dado 2 y Dado 3 : " + sumaD2 +
                    "\nDado 1: " + sumaD1 +
                    (sumaD1 > sumaD2 ? " (GANADOR)" : " (PERDEDOR)"));

        }
        else if (sumaD1>sumaD2 &&  sumaD2>sumaD3 ) {
            System.out.println("El ganador fue el Dado 1  : " + sumaD1 +
                    "\nEl de la mitad fue el Dado 2: " + sumaD2 +
                    "\nEl ultimo fue el Dado 3: " + sumaD3 );
        }
        else if (sumaD1>sumaD2 &&  sumaD3>sumaD2 ) {
            System.out.println("El ganador fue el Dado 1  : " + sumaD1 +
                    "\nEl de la mitad fue el Dado 3: " + sumaD3 +
                    "\nEl ultimo fue el Dado 2: " + sumaD2 );
        }
        else if (sumaD2>sumaD1 &&  sumaD1>sumaD3 ) {
            System.out.println("El ganador fue el Dado 2 : " + sumaD2 +
                    "\nEl de la mitad fue el Dado 1: " + sumaD1 +
                    "\nEl ultimo fue el Dado 3: " + sumaD3 );

        }
        else if (sumaD2>sumaD1 &&  sumaD3>sumaD1 ) {
            System.out.println("El ganador fue el Dado 2  : " + sumaD2 +
                    "\nEl de la mitad fue el Dado 3: " + sumaD3 +
                    "\nEl ultimo fue el Dado 1: " + sumaD1 );
        }
        else if (sumaD3>sumaD1 &&  sumaD1>sumaD2 ) {
            System.out.println("El ganador fue el Dado 3  : " + sumaD3 +
                    "\nEl de la mitad fue el Dado 1: " + sumaD1 +
                    "\nEl ultimo fue el Dado 2: " + sumaD2 );
        }
        else if (sumaD3>sumaD2 &&  sumaD2>sumaD1 ) {
            System.out.println("El ganador fue el Dado 3 : " + sumaD3 +
                    "\nEl de la mitad fue el Dado 2: " + sumaD2 +
                    "\nEl ultimo fue el Dado 1: " + sumaD1 );
        }



    }

    public static String imc() {

        Scanner teclado = new Scanner(System.in);
        double n1, n2, operacion;
        String resultado = "";

        System.out.println("Digite su peso corporal");
        n1 = teclado.nextDouble();
        System.out.println("Digite su altura corporal");
        n2 = teclado.nextDouble();
        operacion = (n1 / (n2 * n2));

        System.out.println("Su peso es: " + operacion);

        if (operacion < 18.5) {
            resultado = "SU IMC ES= " + operacion + "\nUsted tiene bajo peso ";

        } else if (operacion >= 18.5 && operacion < 24.9) {
            resultado = "SU IMC ES= " + operacion + "\nUsted tiene peso normal ";

        } else if (operacion > 25 && operacion < 26.9) {
            resultado = "SU IMC ES= " + operacion + "\nUsted tiene sobre peso de grado 1 ";

        } else if (operacion > 27 && operacion < 29.9) {
            resultado = "SU IMC ES= " + operacion + "\nUsted tiene sobre peso de grado 2 ";

        } else if (operacion > 30 && operacion < 34.9) {
            resultado = "SU IMC ES= " + operacion + "\nUsted tiene obesidad de peso tipo 1 ";

        } else if (operacion > 35 && operacion < 39.9) {
            resultado = "SU IMC ES= " + operacion + "\nUsted tiene obesidad de peso tipo 2 ";

        } else if (operacion > 40 && operacion < 49.9) {
            resultado = "SU IMC ES= " + operacion + "\nUsted tiene obesidad de peso tipo 3 (Morbida) ";

        } else if (operacion > 50) {
            resultado = "SU IMC ES= " + operacion + "\nUsted tiene obesidad de peso tipo 4 (Extrema) ";

        }

        return resultado + operacion;

    }
}








