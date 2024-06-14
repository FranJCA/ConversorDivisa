
import exchangerate.interact;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws  IOException, InterruptedException {

        System.out.println("bienvenio al programa de Divisa");

        //scaner 1
        String base= "control";
        //scaner 2
        String targ = "control";
        //Scanner 3
        int divisa = 1 ;

        //------------Inicializacion de variables de interaccion---------
        interact corazon = new interact();

        Scanner lectura = new Scanner(System.in);

        int i = 0;

        do{
            System.out.println("------------------------------------------------------------------");
            try {

                System.out.println("""
0.Historial
1.Dolar (USD) a Peso argentino (ARS)
2.Peso argentino (ARS) a Dolar (USD)
3.Dolar (USD) a Real Brasileno (BRL)
4.Real Brasileno(BRL) a Dolar (USD)
5.Dolar (USD) a Peso Colombiano (COP)
6.Peso Colombiano (COP) a Dolar (USD)
7.Dolar (USD) a Peso Chileno (CLP)
8.Peso Chileno(CLP) a Dolar (USD)
9. Personalizado
10.Salir
""");
                System.out.println("ingresa una opcion:");
                i = lectura.nextInt();
                System.out.println("------------------------------------------------------------------");
                switch(i) {
                    case 0:
                        System.out.println("Historial");
                        System.out.println(corazon.his());
                        break;

                    case 1:
                        base= "USD";  targ = "ARS";
                        System.out.println("Ingresa el monto que deseas convertir");
                        divisa = lectura.nextInt();
                        corazon.ejecutor(base,targ,divisa);
                        break;
                    case 2:
                        base= "ARS";  targ = "USD";
                        System.out.println("Ingresa el monto que deseas convertir");
                        divisa = lectura.nextInt();
                        corazon.ejecutor(base,targ,divisa);
                        break;
                    case 3:
                        base= "USD";  targ = "BRL";
                        System.out.println("Ingresa el monto que deseas convertir");
                        divisa = lectura.nextInt();
                        corazon.ejecutor(base,targ,divisa);
                        break;
                    case 4:
                        base= "BRL";  targ = "USD";
                        System.out.println("Ingresa el monto que deseas convertir");
                        divisa = lectura.nextInt();
                        corazon.ejecutor(base,targ,divisa);
                        break;
                    case 5:
                        base= "USD";  targ = "COP";
                        System.out.println("Ingresa el monto que deseas convertir");
                        divisa = lectura.nextInt();
                        corazon.ejecutor(base,targ,divisa);
                        break;
                    case 6:
                        base= "COP";  targ = "USD";
                        System.out.println("Ingresa el monto que deseas convertir");
                        divisa = lectura.nextInt();
                        corazon.ejecutor(base,targ,divisa);
                        break;
                    case 7:
                        base= "USD";  targ = "CLP";
                        System.out.println("Ingresa el monto que deseas convertir");
                        divisa = lectura.nextInt();
                        corazon.ejecutor(base,targ,divisa);
                        break;
                    case 8:
                        base= "USD";  targ = "CLP";
                        System.out.println("Ingresa el monto que deseas convertir");
                        divisa = lectura.nextInt();
                        corazon.ejecutor(base,targ,divisa);
                        break;
                    case 9:
                        System.out.println("""
                            Ingresa tu moneda, debes tener el codigo o saldra un error inevitable
                            Ejemplos:
                         Codigo  Nombre de la moneda          Pais
                            ARS	Argentine Peso              	Argentina
                            LYD	Libyan Dinar            	    Libya
                            SSP	South Sudanese Pound	        South Sudan
                            SYP	Syrian Pound	                Syria
                            VES	Venezuelan Bolívar Soberano	    Venezuela
                            YER	Yemeni Rial	                    Yemen
                            ZWL	Zimbabwean Dollar	            Zimbabwe
                            """);
                        System.out.println("Ingresa el Valor base");
                        base= lectura.next().toUpperCase();
                        System.out.println("Ingresa el valor Objetivo");
                        targ= lectura.next().toUpperCase();

                        System.out.println("Ingresa el monto que deseas convertir");
                        divisa = lectura.nextInt();
                        corazon.ejecutor(base,targ,divisa);
                        break;
                    case 10:
                        System.out.println("Gracias por venir :) ...");
                        break;

                    default:
                        System.out.println("Elija una opcion valida");
                }


            } catch (Exception e) {
                System.out.println("Por favor seguir los parametros del programa para que funcione bien");
                break;
            }

        }while(i!=10);
        System.out.println("Programa Finalizado");


    }
}