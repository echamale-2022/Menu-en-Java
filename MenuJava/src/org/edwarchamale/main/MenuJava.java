package org.edwarchamale.main;
/**
 *
 * @author Edwar
 */
public class MenuJava {
    public static void main(String[] args) {
    int num1 = 31;
    int num2 = 2;
    int num3 = 2;
    int num4 = -1;
    int opc = 1;
    int resultado;
        switch(opc){
            case 1: // numero par o impar
                resultado = num1 % 2;
                    if(resultado == 0){
                        System.out.println("El numero es par");
                    } else{
                        System.out.println("El numero es impar");
                    }
            break;
            case 2: // numero menor o mayor
                if (num2 == num3){
                    System.out.println(num2 + " son iguales "+ num3);
                } else if(num2 > num3){
                    System.out.println(num2 + " mayor que " + num3);
                } else{
                    System.out.println(num3 + " mayor que " + num2);
                }
            break;
            case 3: // numero positivo o negativo
                if(num4 == 0){
                    System.out.println("El numero es neutro");
                } else if(num4 >= 1){
                    System.out.println("El numero es positivo");
                } else{
                    System.out.println("El numero es negativo");
                }
            break;
            default:
                System.out.println("No es ninguna opcion");
        }
    }
    
}
