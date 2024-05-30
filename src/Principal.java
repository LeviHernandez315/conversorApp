import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        //Declaración de varialbes con los codigos a convertir
        String codigoOrigen = "";
        String codigoDestino = "";

        //Declaracion de variables que contendran el valor de numero a convertir y el valor por el que se multiplicara
        double valorConvertir;
        double valorEquivalente;

        //Variable que consumira la API den conversor de Mondedas
        Busqueda busqueda = new Busqueda();
        //variable de la clase donde esta la función para convertir la moneda
        Conversor convertir = new Conversor();

        //inicializacion de la variable opcion para las opciones
        int opcion = 0;

        //declaracion de varialbes Scanner para solicitar al usuario la opcion del menu y el numero a convertir
        Scanner tecladoOpcion = new Scanner(System.in);
        Scanner tecladoMoneda = new Scanner(System.in);

        //Menu de las opciones para que el usuario pueda elegir
        String menu = """
                1) Dolar =>> Peso argentino
                2) Peso argentino =>> Dolar
                3) Dolar =>> Real brasileño
                4) Real brasileño =>> Dolar
                5) Dolar =>> Peso colombiano
                6) Peso colombiano =>> Dolar \n
                **** Cambio de moneda Honduras *****\n
                7) Lempira =>> Dolar
                8) Dolar =>> Lempira
                9) Lempira =>> Peso argentino
                10) Peso argentino =>> Lempira
                11) Lempira =>> Real brasileño
                12) Real brasileño =>> Lempira
                13) Lempira =>> Peso colombiano
                14) Peso colombiano =>> Lempira
                15) Salir
                """;

        //El ciclo que se estara repitiendo hasta que el usuario eliga la opcion salir
        while(opcion != 15){
            System.out.println("**********************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]\n");
            System.out.println(menu);
            System.out.println("Elija una opción valida:");
            System.out.println("**********************************************************\n");

            //majeno de errores para que el usuario solo seleccione un número y no otro caracter
            try {
                opcion = tecladoOpcion.nextInt();
            } catch (Exception e) {
                System.out.println("No se puede ingresas valores que no sean numericos");
                tecladoOpcion.next();
                opcion = 0;
            }

            //los distintos casos que corresponden a las opciones a elegir
            switch (opcion){
                case 1:
                    codigoOrigen = "USD";
                    codigoDestino = "ARS";
                    break;
                case 2:
                    codigoOrigen = "ARS";
                    codigoDestino = "USD";
                    break;
                case 3:
                    codigoOrigen = "USD";
                    codigoDestino = "BRL";
                    break;
                case 4:
                    codigoOrigen = "BRL";
                    codigoDestino = "USD";
                    break;
                case 5:
                    codigoOrigen = "USD";
                    codigoDestino = "COP";
                    break;
                case 6:
                    codigoOrigen = "COP";
                    codigoDestino = "USD";
                    break;
                case 7:
                    codigoOrigen = "HNL";
                    codigoDestino = "USD";
                    break;
                case 8:
                    codigoOrigen = "USD";
                    codigoDestino = "HNL";
                    break;
                case 9:
                    codigoOrigen = "HNL";
                    codigoDestino = "ARS";
                    break;
                case 10:
                    codigoOrigen = "ARS";
                    codigoDestino = "HNL";
                    break;
                case 11:
                    codigoOrigen = "HNL";
                    codigoDestino = "BRL";
                    break;
                case 12:
                    codigoOrigen = "BRL";
                    codigoDestino = "HNL";
                    break;
                case 13:
                    codigoOrigen = "HNL";
                    codigoDestino = "COP";
                    break;
                case 14:
                    codigoOrigen = "COP";
                    codigoDestino = "HNL";
                    break;
                case 15:
                    System.out.println("Gracias por usar nuestro sistema");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println("Por favor intente de nuevo");
                    opcion = 0;
                    break;
            }

            //codigo para convertir segun la opcion que se eligio
            if(opcion != 15 && opcion != 0){
                Moneda moneda = busqueda.buscarMoneda(codigoOrigen);

                //un ciclo para repetir la opción del valor de la moneda a convertir
                boolean valorNumeroValido = true;
                while(valorNumeroValido){
                    System.out.println("Ingrese el valor que desea convertir");

                    //manejo de errores para el double que se solicita y que no sea otro caracter
                    try {
                        valorConvertir = tecladoMoneda.nextDouble();
                        valorEquivalente = moneda.conversion_rates().get(codigoDestino);

                        double monedaConvertida = convertir.convertirMondeda(valorConvertir, valorEquivalente);
                        System.out.println("El valor "+valorConvertir+" ["+codigoOrigen+"] Corresponde al valor final de >>>>>>> "+monedaConvertida +" ["+codigoDestino+"]\n");

                        valorNumeroValido = false;

                    } catch (Exception e) {
                        System.out.println("Entrada no valida.");
                        System.out.println("Por favor ingrese un numero");
                        tecladoMoneda.next();
                    }
                }
            }
        }
    }
}
