import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        while(true) {
            System.out.println("ConversordeMonedas");
            System.out.println("1 - ARS a USD\n"
                    + "2 - BRL a USD\n"
                    + "3 - COP a USD\n"
                    + "4 - Salir");
            System.out.print("Ingrese una Opcion:");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);

            switch(opcion){
                case 1:
                    convertir(0.0011, "ARS");
                    break;
                case 2:
                    convertir(0.18, "BRL");
                    break;
                case 3:
                    convertir(0.00025, "COP");
                    break;
                case 4:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
        }



    }

    static void convertir(double valorUSD, String moneda){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s :", moneda);
        double cantidaddeMoneda = leer.nextDouble();

        double USD = cantidaddeMoneda / valorUSD;

        USD = (double) Math.round(USD * 100d) / 100;


        System.out.println("Tienes $" + USD + "USD");
    }

}