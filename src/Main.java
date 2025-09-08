import java.util.*;
public class Main {
    public static void main(String[] args) {


        menu();


    }

    public static void menu() {
        Scanner menu = new Scanner(System.in);
        int op;

        System.out.println("Escribir el ejercicio que quieres ver");
        System.out.println("1. Ejercicio dado de 2 caras");
        System.out.println("2. Ejercicio dado de 3 caras");
        System.out.println("3. Ejercicio peso corporal");
        System.out.println("4. Ejercicio promedio de notas");
        System.out.println("5. Ejercicio final");
        System.out.println("6. Cerrar");

        op = menu.nextInt();

        switch (op) {
            case 1:
                System.out.println("Ejercicio dado de 2 caras");

                dados2();

                break;
            case 2:
                System.out.println("Ejercicio dado de 3 caras");

                dados3();

                break;
            case 3:
                System.out.println("Ejercicio peso corporal");

                System.out.println(imc());

                break;
            case 4:
                System.out.println("Ejercicio del promedio de notas ");

                System.out.println(notas());

                break;
            case 5:
                System.out.println("Ejercicio final de clase");

                prueba();

                break;
            case 6:
                System.out.println("Salir de los ejercicios");

                fin();

                break;

            default:

        }
    }

    public static void dados2() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int a, b, sumaD1 = 0, sumaD2 = 0, confirmacion;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Numero aleatorio dado 1");
            a = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumaD1 += a;

            System.out.println("Numero aleatorio dado 2");
            b = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumaD2 += b;
        }

        if (sumaD1 < sumaD2) {
            System.out.println("El dado 1 gana=" + sumaD1);

        } else if (sumaD1 > sumaD2) {
            System.out.println("El dado 2 gana=" + sumaD2);
        } else if (sumaD1 == sumaD2) {
            System.out.println("EMPATE=" + sumaD2);
        }

        System.out.println("\n¿Ahora que quieres hacer ?");
        System.out.println("1. Volver al menu");
        System.out.println("2. Salir del codigo");
        System.out.println("Escribe una de las dos opciones");

        confirmacion = teclado.nextInt();

        if (confirmacion == 1) {
            System.out.println("Volver al menu principal");
            menu();
        } else if (confirmacion == 2) {
            System.out.println("Salir del codigo");
            fin();
        } else if (confirmacion != 1 && confirmacion != 2) {
            System.out.println("Los valores no coinciden, volver a escribir ");
            prueba();
        }


    }


    public static void dados3() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int a, b, c, sumaD1 = 0, sumaD2 = 0, sumaD3 = 0, confirmacion;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Numero aleatorio dado 1");
            a = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumaD1 += a;
            System.out.println("Dado 1: " + a);

            System.out.println("Numero aleatorio dado 2");
            b = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumaD2 += b;
            System.out.println("Dado 2: " + b);

            System.out.println("Numero aleatorio dado 3");
            c = aleatorio.nextInt((6 - 1) + 1) + 1;
            sumaD3 += c;
            System.out.println("Dado 3: " + c);
        }

        if (sumaD1 == sumaD2 && sumaD2 == sumaD3) {
            System.out.println("EMPATE TOTAL - Todos los dados sumaron: " + sumaD1);
        } else if (sumaD1 == sumaD2) {
            System.out.println("EMPATE entre Dado 1 y Dado 2  : " + sumaD1 +
                    "\nDado 3: " + sumaD3 +
                    (sumaD3 > sumaD1 ? " (GANADOR)" : " (PERDEDOR)"));
        } else if (sumaD1 == sumaD3) {
            System.out.println("EMPATE entre Dado 1 y Dado 3  : " + sumaD1 +
                    "\nDado 2: " + sumaD2 +
                    (sumaD2 > sumaD1 ? " (GANADOR)" : " (PERDEDOR)"));
        } else if (sumaD2 == sumaD3) {
            System.out.println("EMPATE entre Dado 2 y Dado 3 : " + sumaD2 +
                    "\nDado 1: " + sumaD1 +
                    (sumaD1 > sumaD2 ? " (GANADOR)" : " (PERDEDOR)"));

        } else if (sumaD1 > sumaD2 && sumaD2 > sumaD3) {
            System.out.println("El ganador fue el Dado 1  : " + sumaD1 +
                    "\nEl de la mitad fue el Dado 2: " + sumaD2 +
                    "\nEl ultimo fue el Dado 3: " + sumaD3);
        } else if (sumaD1 > sumaD2 && sumaD3 > sumaD2) {
            System.out.println("El ganador fue el Dado 1  : " + sumaD1 +
                    "\nEl de la mitad fue el Dado 3: " + sumaD3 +
                    "\nEl ultimo fue el Dado 2: " + sumaD2);
        } else if (sumaD2 > sumaD1 && sumaD1 > sumaD3) {
            System.out.println("El ganador fue el Dado 2 : " + sumaD2 +
                    "\nEl de la mitad fue el Dado 1: " + sumaD1 +
                    "\nEl ultimo fue el Dado 3: " + sumaD3);

        } else if (sumaD2 > sumaD1 && sumaD3 > sumaD1) {
            System.out.println("El ganador fue el Dado 2  : " + sumaD2 +
                    "\nEl de la mitad fue el Dado 3: " + sumaD3 +
                    "\nEl ultimo fue el Dado 1: " + sumaD1);
        } else if (sumaD3 > sumaD1 && sumaD1 > sumaD2) {
            System.out.println("El ganador fue el Dado 3  : " + sumaD3 +
                    "\nEl de la mitad fue el Dado 1: " + sumaD1 +
                    "\nEl ultimo fue el Dado 2: " + sumaD2);
        } else if (sumaD3 > sumaD2 && sumaD2 > sumaD1) {
            System.out.println("El ganador fue el Dado 3 : " + sumaD3 +
                    "\nEl de la mitad fue el Dado 2: " + sumaD2 +
                    "\nEl ultimo fue el Dado 1: " + sumaD1);
        }

        System.out.println("\n¿Ahora que quieres hacer ?");
        System.out.println("1. Volver al menu");
        System.out.println("2. Salir del codigo");
        System.out.println("Escribe una de las dos opciones");

        confirmacion = teclado.nextInt();

        if (confirmacion == 1) {
            System.out.println("Volver al menu principal");
            menu();
        } else if (confirmacion == 2) {
            System.out.println("Salir del codigo");
            fin();
        } else if (confirmacion != 1 && confirmacion != 2) {
            System.out.println("Los valores no coinciden, volver a escribir ");
            prueba();
        }


    }

    public static String imc() {

        Scanner teclado = new Scanner(System.in);
        double n1, n2, operacion, confirmacion;
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
        System.out.println(resultado);


        System.out.println("\n¿Ahora que quieres hacer ?");
        System.out.println("1. Volver al menu");
        System.out.println("2. Salir del codigo");
        System.out.println("Escribe una de las dos opciones");

        confirmacion = teclado.nextDouble();

        if (confirmacion == 1) {
            System.out.println("Volver al menu principal");
            menu();
        } else if (confirmacion == 2) {
            System.out.println("Salir del codigo");
            fin();
        } else if (confirmacion != 1 && confirmacion != 2) {
            System.out.println("Los valores no coinciden, volver a escribir ");
            prueba();


        }
        return null;


}

    public static String notas() {

        Scanner notas = new Scanner(System.in);
        int op, confirmacion;
        double n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, operacion;
        String resultado = "";


        System.out.println("Cuantas notas tienes para calcular el promedio (Min 1- Max 10)");

        op = notas.nextInt();




        switch (op) {
            case 1:

                System.out.println("Digite las notas desde (0 - 5.0)");
                System.out.println("Digite la unica nota ");
                n1 = notas.nextDouble();
                operacion = n1;

                System.out.println("Su promedio de nota es : " + operacion);

                if (operacion < 0.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Muy Deficiente ";

                } else if (operacion >= 1.0 && operacion < 1.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Deficiente ";

                } else if (operacion >= 2.0 && operacion < 2.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Insuficiente ";

                } else if (operacion >= 3.0 && operacion < 3.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Aceptable ";

                } else if (operacion >= 3.5 && operacion < 3.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Bueno ";

                } else if (operacion >= 4.0 && operacion < 4.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Exelente  ";

                } else if (operacion >= 4.5 && operacion <= 5.0) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Excelente Superior ";

                } else if (operacion > 5.0) {
                    resultado = "ERROR " + operacion + "\nValor por encima del rango solicitado";

                }


                break;
            case 2:

                System.out.println("Digite la primera nota ");
                n1 = notas.nextDouble();
                System.out.println("Digite la segunda nota ");
                n2 = notas.nextDouble();

                operacion = (n1 + n2) / 2;

                System.out.println("Su promedio de nota es : " + operacion);

                if (operacion < 0.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Muy Deficiente ";

                } else if (operacion >= 1.0 && operacion < 1.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Deficiente ";

                } else if (operacion >= 2.0 && operacion < 2.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Insuficiente ";

                } else if (operacion >= 3.0 && operacion < 3.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Aceptable ";

                } else if (operacion >= 3.5 && operacion < 3.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Bueno ";

                } else if (operacion >= 4.0 && operacion < 4.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Exelente  ";

                } else if (operacion >= 4.5 && operacion <= 5.0) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Excelente Superior ";

                } else if (operacion > 5.0) {
                    resultado = "ERROR " + operacion + "\nValor por encima del rango solicitado";

                }

                break;
            case 3:
                System.out.println("Digite la primera nota ");
                n1 = notas.nextDouble();
                System.out.println("Digite la segunda nota ");
                n2 = notas.nextDouble();
                System.out.println("Digite la tercera nota ");
                n3 = notas.nextDouble();

                operacion = (n1 + n2 + n3) / 3;

                System.out.println("Su promedio de nota es : " + operacion);

                if (operacion < 0.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Muy Deficiente ";

                } else if (operacion >= 1.0 && operacion < 1.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Deficiente ";

                } else if (operacion >= 2.0 && operacion < 2.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Insuficiente ";

                } else if (operacion >= 3.0 && operacion < 3.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Aceptable ";

                } else if (operacion >= 3.5 && operacion < 3.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Bueno ";

                } else if (operacion >= 4.0 && operacion < 4.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Exelente  ";

                } else if (operacion >= 4.5 && operacion <= 5.0) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Excelente Superior ";

                } else if (operacion > 5.0) {
                    resultado = "ERROR " + operacion + "\nValor por encima del rango solicitado";

                }
                break;
            case 4:
                System.out.println("Digite la primera nota ");
                n1 = notas.nextDouble();
                System.out.println("Digite la segunda nota ");
                n2 = notas.nextDouble();
                System.out.println("Digite la tercera nota ");
                n3 = notas.nextDouble();
                System.out.println("Digite la cuarta nota ");
                n4 = notas.nextDouble();


                operacion = (n1 + n2 + n3 + n4) / 4;

                System.out.println("Su promedio de nota es : " + operacion);

                if (operacion < 0.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Muy Deficiente ";

                } else if (operacion >= 1.0 && operacion < 1.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Deficiente ";

                } else if (operacion >= 2.0 && operacion < 2.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Insuficiente ";

                } else if (operacion >= 3.0 && operacion < 3.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Aceptable ";

                } else if (operacion >= 3.5 && operacion < 3.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Bueno ";

                } else if (operacion >= 4.0 && operacion < 4.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Exelente  ";

                } else if (operacion >= 4.5 && operacion <= 5.0) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Excelente Superior ";

                } else if (operacion > 5.0) {
                    resultado = "ERROR " + operacion + "\nValor por encima del rango solicitado";

                }

                break;
            case 5:

                System.out.println("Digite la primera nota ");
                n1 = notas.nextDouble();
                System.out.println("Digite la segunda nota ");
                n2 = notas.nextDouble();
                System.out.println("Digite la tercera nota ");
                n3 = notas.nextDouble();
                System.out.println("Digite la cuarta nota ");
                n4 = notas.nextDouble();
                System.out.println("Digite la quinta nota ");
                n5 = notas.nextDouble();


                operacion = (n1 + n2 + n3 + n4 + n5) / 5;

                System.out.println("Su promedio de nota es : " + operacion);

                if (operacion < 0.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Muy Deficiente ";

                } else if (operacion >= 1.0 && operacion < 1.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Deficiente ";

                } else if (operacion >= 2.0 && operacion < 2.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Insuficiente ";

                } else if (operacion >= 3.0 && operacion < 3.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Aceptable ";

                } else if (operacion >= 3.5 && operacion < 3.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Bueno ";

                } else if (operacion >= 4.0 && operacion < 4.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Exelente  ";

                } else if (operacion >= 4.5 && operacion <= 5.0) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Excelente Superior ";

                } else if (operacion > 5.0) {
                    resultado = "ERROR " + operacion + "\nValor por encima del rango solicitado";

                }


                break;
            case 6:
                System.out.println("Digite la primera nota ");
                n1 = notas.nextDouble();
                System.out.println("Digite la segunda nota ");
                n2 = notas.nextDouble();
                System.out.println("Digite la tercera nota ");
                n3 = notas.nextDouble();
                System.out.println("Digite la cuarta nota ");
                n4 = notas.nextDouble();
                System.out.println("Digite la quinta nota ");
                n5 = notas.nextDouble();
                System.out.println("Digite la quinta nota ");
                n6 = notas.nextDouble();


                operacion = (n1 + n2 + n3 + n4 + n5 + n6) / 6;

                System.out.println("Su promedio de nota es : " + operacion);

                if (operacion < 0.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Muy Deficiente ";

                } else if (operacion >= 1.0 && operacion < 1.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Deficiente ";

                } else if (operacion >= 2.0 && operacion < 2.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Insuficiente ";

                } else if (operacion >= 3.0 && operacion < 3.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Aceptable ";

                } else if (operacion >= 3.5 && operacion < 3.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Bueno ";

                } else if (operacion >= 4.0 && operacion < 4.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Exelente  ";

                } else if (operacion >= 4.5 && operacion <= 5.0) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Excelente Superior ";

                } else if (operacion > 5.0) {
                    resultado = "ERROR " + operacion + "\nValor por encima del rango solicitado";

                }

                break;

            case 7:
                System.out.println("Digite la primera nota ");
                n1 = notas.nextDouble();
                System.out.println("Digite la segunda nota ");
                n2 = notas.nextDouble();
                System.out.println("Digite la tercera nota ");
                n3 = notas.nextDouble();
                System.out.println("Digite la cuarta nota ");
                n4 = notas.nextDouble();
                System.out.println("Digite la quinta nota ");
                n5 = notas.nextDouble();
                System.out.println("Digite la sexta nota ");
                n6 = notas.nextDouble();
                System.out.println("Digite la septima nota ");
                n7 = notas.nextDouble();


                operacion = (n1 + n2 + n3 + n4 + n5 + n6 + n7) / 7;

                System.out.println("Su promedio de nota es : " + operacion);


                if (operacion < 0.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Muy Deficiente ";

                } else if (operacion >= 1.0 && operacion < 1.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Deficiente ";

                } else if (operacion >= 2.0 && operacion < 2.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Insuficiente ";

                } else if (operacion >= 3.0 && operacion < 3.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Aceptable ";

                } else if (operacion >= 3.5 && operacion < 3.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Bueno ";

                } else if (operacion >= 4.0 && operacion < 4.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Exelente  ";

                } else if (operacion >= 4.5 && operacion <= 5.0) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Excelente Superior ";

                } else if (operacion > 5.0) {
                    resultado = "ERROR " + operacion + "\nValor por encima del rango solicitado";

                }

                break;

            case 8:
                System.out.println("Digite la primera nota ");
                n1 = notas.nextDouble();
                System.out.println("Digite la segunda nota ");
                n2 = notas.nextDouble();
                System.out.println("Digite la tercera nota ");
                n3 = notas.nextDouble();
                System.out.println("Digite la cuarta nota ");
                n4 = notas.nextDouble();
                System.out.println("Digite la quinta nota ");
                n5 = notas.nextDouble();
                System.out.println("Digite la sexta nota ");
                n6 = notas.nextDouble();
                System.out.println("Digite la septima nota ");
                n7 = notas.nextDouble();
                System.out.println("Digite la octava nota ");
                n8 = notas.nextDouble();


                operacion = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8) / 8;

                System.out.println("Su promedio de nota es : " + operacion);


                if (operacion < 0.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Muy Deficiente ";

                } else if (operacion >= 1.0 && operacion < 1.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Deficiente ";

                } else if (operacion >= 2.0 && operacion < 2.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Insuficiente ";

                } else if (operacion >= 3.0 && operacion < 3.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Aceptable ";

                } else if (operacion >= 3.5 && operacion < 3.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Bueno ";

                } else if (operacion >= 4.0 && operacion < 4.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Exelente  ";

                } else if (operacion >= 4.5 && operacion <= 5.0) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Excelente Superior ";

                } else if (operacion > 5.0) {
                    resultado = "ERROR " + operacion + "\nValor por encima del rango solicitado";

                }
                break;

            case 9:

                System.out.println("Digite la primera nota ");
                n1 = notas.nextDouble();
                System.out.println("Digite la segunda nota ");
                n2 = notas.nextDouble();
                System.out.println("Digite la tercera nota ");
                n3 = notas.nextDouble();
                System.out.println("Digite la cuarta nota ");
                n4 = notas.nextDouble();
                System.out.println("Digite la quinta nota ");
                n5 = notas.nextDouble();
                System.out.println("Digite la sexta nota ");
                n6 = notas.nextDouble();
                System.out.println("Digite la septima nota ");
                n7 = notas.nextDouble();
                System.out.println("Digite la octava nota ");
                n8 = notas.nextDouble();
                System.out.println("Digite la novena nota ");
                n9 = notas.nextDouble();


                operacion = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9) / 9;

                System.out.println("Su promedio de nota es : " + operacion);

                if (operacion < 0.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Muy Deficiente ";

                } else if (operacion >= 1.0 && operacion < 1.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Deficiente ";

                } else if (operacion >= 2.0 && operacion < 2.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Insuficiente ";

                } else if (operacion >= 3.0 && operacion < 3.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Aceptable ";

                } else if (operacion >= 3.5 && operacion < 3.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Bueno ";

                } else if (operacion >= 4.0 && operacion < 4.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Exelente  ";

                } else if (operacion >= 4.5 && operacion <= 5.0) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Excelente Superior ";

                } else if (operacion > 5.0) {
                    resultado = "ERROR " + operacion + "\nValor por encima del rango solicitado";

                }

                break;

            case 10:

                System.out.println("Digite la primera nota ");
                n1 = notas.nextDouble();
                System.out.println("Digite la segunda nota ");
                n2 = notas.nextDouble();
                System.out.println("Digite la tercera nota ");
                n3 = notas.nextDouble();
                System.out.println("Digite la cuarta nota ");
                n4 = notas.nextDouble();
                System.out.println("Digite la quinta nota ");
                n5 = notas.nextDouble();
                System.out.println("Digite la sexta nota ");
                n6 = notas.nextDouble();
                System.out.println("Digite la septima nota ");
                n7 = notas.nextDouble();
                System.out.println("Digite la octava nota ");
                n8 = notas.nextDouble();
                System.out.println("Digite la novena nota ");
                n9 = notas.nextDouble();
                System.out.println("Digite la decima nota ");
                n10 = notas.nextDouble();


                operacion = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / 10;

                System.out.println("Su promedio de nota es : " + operacion);

                if (operacion < 0.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Muy Deficiente ";

                } else if (operacion >= 1.0 && operacion < 1.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Deficiente ";

                } else if (operacion >= 2.0 && operacion < 2.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Insuficiente ";

                } else if (operacion >= 3.0 && operacion < 3.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Aceptable ";

                } else if (operacion >= 3.5 && operacion < 3.9) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Bueno ";

                } else if (operacion >= 4.0 && operacion < 4.4) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Exelente  ";

                } else if (operacion >= 4.5 && operacion <= 5.0) {
                    resultado = "SU PROMEDIO ES= " + operacion + "\nPromedio Excelente Superior ";

                } else if (operacion > 5.0) {
                    resultado = "ERROR " + operacion + "\nValor por encima del rango solicitado";

                }
                break;
            default:
        }


            System.out.println(resultado);


                System.out.println("\n¿Ahora que quieres hacer ?");
                System.out.println("1. Volver al menu");
                System.out.println("2. Salir del codigo");
                System.out.println("Escribe una de las dos opciones");

                confirmacion = notas.nextInt();

                if (confirmacion == 1) {
                    System.out.println("Volver al menu principal");
                    menu();
                } else if (confirmacion == 2) {
                    System.out.println("Salir del codigo");
                    fin();
                } else if (confirmacion != 1 && confirmacion != 2) {
                    System.out.println("Los valores no coinciden, volver a escribir ");
                    prueba();


                }
                return null;



    }

    public static void prueba(){
        Scanner prueba= new Scanner(System.in);
        double confirmacion;


        System.out.println("¿Ahora que quieres hacer ?");
        System.out.println("1. Volver al menu");
        System.out.println("2. Salir del codigo");
        System.out.println("Escribe una de las dos opciones");

        confirmacion = prueba.nextDouble();

        if (confirmacion ==1){
            System.out.println("Volver al menu principal");
            menu();
        }
        else if (confirmacion ==2){
            System.out.println("Salir del codigo");
            fin();
        }

        else if (confirmacion !=1 && confirmacion !=2){
            System.out.println("Los valores no coinciden, volver a escribir ");
            prueba();
        }




    }

    public static void fin() {

        System.out.println("Gracias por utilizar mi codigo :) ");
    }

}










