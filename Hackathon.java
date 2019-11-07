// version 2.0
package hackathon;

import java.util.Scanner;

public class Hackathon {

    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);

        String CP="";
        int CP1=0;
        String CC="";
        int CC1=0;
        int Contador = 0;
        info_usuario Cliente[] = new info_usuario[20000];
        info_productos Producto[] = new info_productos[20000];

        int Opcion = 0;
        boolean OpcionMenu = true;
        boolean Siga = true;
        boolean Salir=true;

        do {
            System.out.println("*******************************");
            System.out.println("**      CUEROS Colombia      **");
            System.out.println("**                           **");
            System.out.println("**    ¿Que desea realizar?   **");
            System.out.println("**                           **");
            System.out.println("**  1-> ingrezar un cliente  **");
            System.out.println("**  2-> ingrezar un producto **");
            System.out.println("*******************************");
            System.out.println("ingrese la opcion deseada: ");

            do {

                try {
                    OpcionMenu = false;
                    Opcion = Teclado.nextInt();
                } catch (Exception e) {
                    OpcionMenu = true;
                    System.out.print("error, ingrese bien la opciones dadas \n");
                }

            } while (OpcionMenu);

            switch (Opcion) {
                case 1:
                    do{
                        try{                         
                            System.out.println(" ¿cuantos usuarios desea ingresar? ");
                            CC = Teclado.next();
                            CC1=Integer.parseInt(CC);
                            Salir=false;
                        }catch(Exception e){
                            System.out.println("ERROR, INGRESE UNA CANTIDAD ENTERA VALIDA");
                            Salir=true;
                        }
                    }while(Salir);
                    
                    for (Contador = 0; Contador < CC1 ; Contador++) {

                        Cliente[Contador] = new info_usuario();

                        pedirinfousuario(Teclado, Cliente[Contador]);

                    }
                    break;
                case 2:
                    do{
                        try{
                            System.out.println(" ¿cuantos productos desea ingresar? ");
                            CP=Teclado.next();
                            CP1=Integer.parseInt(CP);
                            Salir=false;
                        }catch(Exception e){
                            System.out.println("ERROR, INGRESE UNA CANTIDAD ENTERA VALIDA");
                            Salir=true;
                        }
                    }while(Salir);
                    for (Contador = 0; Contador < CP1; Contador++) {

                        Producto[Contador] = new info_productos();

                        infoproductos(Teclado, Producto[Contador]);

                    }
                    break;

            }
            

            do {
                System.out.println("\n");
                System.out.println("*****************************");
                System.out.println("** 3 -> seguir             **");
                System.out.println("** 4 -> salir e imprimir   **");
                System.out.println("*****************************");

                try {
                    OpcionMenu = false;
                    Opcion = Teclado.nextInt();
                } catch (Exception e) {
                    OpcionMenu = true;
                    System.out.print("error, ingrese bien la opciones dadas \n");
                }

            } while (OpcionMenu);

            switch (Opcion) {
                case 3:
                    Siga = true;
                    break;
                case 4:
                    for (Contador = 0; Contador < CC1; Contador++) {
                        Imprmir_Informacion(Contador, Cliente[Contador], Producto[Contador]);
                    }
                    Siga = false;
                    break;
                default:
                    Siga = false;
                    break;
            }

        } while (Siga);

        Teclado.close();
    }

    public static void pedirinfousuario(Scanner Teclado, info_usuario Cliente) {

        boolean salir = true;
        boolean salir2 = true;
        String cedula1 = "";
        int cedula2 = 0;
        String codigo1 = "";
        int codigo2 = 0;

        System.out.println("ingrese su nombre: ");
        Cliente.nombre = Teclado.next();

        do {

            try {
                System.out.println("ingrese su cedula: ");
                cedula1 = Teclado.next();
                cedula2 = Integer.parseInt(cedula1);

                if (cedula2 > 0 && cedula2 < 2000000000) {
                    Cliente.cedula = cedula2;

                    salir = false;
                } else {
                    System.out.println("ERROR; POR FAVOR INTENTE DE NUEVO.");

                    salir = true;
                }
            } catch (Exception e) {
                System.out.println("ERROR; POR FAVOR INTENTE DE NUEVO \n");

                salir = true;
            }
        } while (salir);

        do {

            try {
                System.out.println("ingrese su codigo: ");
                codigo1 = Teclado.next();
                codigo2 = Integer.parseInt(codigo1);

                if (codigo2 > 0 && codigo2 < 2000000000) {
                    Cliente.codigo = codigo2;

                    salir2 = false;
                } else {
                    System.out.println("ERROR; POR FAVOR INTENTE DE NUEVO.");

                    salir2 = true;
                }
            } catch (Exception e) {
                System.out.println("ERROR; POR FAVOR INTENTE DE NUEVO \n");

                salir2 = true;
            }
        } while (salir2);
    }

    public static void infoproductos(Scanner Teclado, info_productos producto) {

        boolean salir = true;
        String codigo1 = "";
        int codigo2 = 0;

        System.out.println("ingrese el nombre del producto: ");
        producto.nombrep = Teclado.next();

        do {

            try {
                System.out.println("ingrese su codigo: ");
                codigo1 = Teclado.next();
                codigo2 = Integer.parseInt(codigo1);

                if (codigo2 > 0 && codigo2 < 2000000000) {
                    producto.codigop = codigo2;

                    salir = false;
                } else {
                    System.out.println("ERROR; POR FAVOR INTENTE DE NUEVO.");

                    salir = true;
                }
            } catch (Exception e) {
                System.out.println("ERROR; POR FAVOR INTENTE DE NUEVO \n");

                salir = true;
            }
        } while (salir);
    }

    public static void Imprmir_Informacion(int Contador, info_usuario Cliente, info_productos Producto) {
        
        System.out.println("***********************************************************************************************");
        System.out.println("  el nombre del cliente " + (Contador + 1) + " es: " + Cliente.nombre + "                    ");
        System.out.println("  la cedula del cliente " + (Contador + 1) + " es : " + Cliente.cedula + "                    ");
        System.out.println("  la el codigo del cliente " + (Contador + 1) + " es: " + Cliente.codigo + "                 ");
        System.out.println("  el nombre del producto que el cliente " + (Contador + 1) + " es: " + Producto.nombrep + "  ");
        System.out.println("  el codigo del producto que el cliente " + (Contador + 1) + " es: " + Producto.codigop + "  ");
        System.out.println("***********************************************************************************************");
        
    }

}
