
// version 1.0

package hackathon;

import java.util.Scanner;

public class Hackathon {

    public static void main(String[] args) {
    
        Scanner Teclado = new Scanner(System.in);
        
        int Contador=0;
        int Contador2=0;
        info_usuario Cliente[]=new info_usuario[3];
        info_productos Producto[]=new info_productos[5];
        
        for (Contador2 = 0; Contador2 < 5; Contador2++) {
            
            Producto[Contador2]=new info_productos();
            
            infoproductos(Teclado, Producto[Contador2]);

        }
        for (Contador = 0; Contador < 3; Contador++) {

            Cliente[Contador] = new info_usuario();

            pedirinfousuario(Teclado, Cliente[Contador]);
        
        }
        Teclado.close();
    }
    
    public static void pedirinfousuario(Scanner Teclado,info_usuario Cliente){
        
        boolean salir=true;
        boolean salir2=true;
        String cedula1="";
        int cedula2=0;
        String codigo1="";
        int codigo2=0;
        
        System.out.println("ingrese su nombre: ");
        Cliente.nombre=Teclado.next();
        
        do {

            try{
            System.out.println("ingrese su cedula: ");
            cedula1 = Teclado.next();
            cedula2 = Integer.parseInt(cedula1);

            if(cedula2>0 && cedula2<2000000000){
                Cliente.cedula=cedula2;
            
                salir=false;
            }else{
                System.out.println("ERROR; POR FAVOR INTENTE DE NUEVO.");
                
                salir=true;
            }
            }catch(Exception e){
                System.out.println("ERROR; POR FAVOR INTENTE DE NUEVO \n");
                
                salir=true;
            }
        }while(salir);
        
        do {

            try{
            System.out.println("ingrese su codigo: ");
            codigo1 = Teclado.next();
            codigo2 = Integer.parseInt(codigo1);

            if(codigo2>0 && codigo2<2000000000){
                Cliente.codigo=codigo2;
            
                salir2=false;
            }else{
                System.out.println("ERROR; POR FAVOR INTENTE DE NUEVO.");
                
                salir2=true;
            }
            }catch(Exception e){
                System.out.println("ERROR; POR FAVOR INTENTE DE NUEVO \n");
                
                salir2=true;
            }
        }while(salir2);
    }
    
    public static void infoproductos(Scanner Teclado,info_productos producto){
        
        boolean salir=true;
        String codigo1="";
        int codigo2=0;
        
        System.out.println("ingrese el nombre del producto: ");
        producto.nombrep=Teclado.next();
        
        do {

            try{
            System.out.println("ingrese su codigo: ");
            codigo1 = Teclado.next();
            codigo2 = Integer.parseInt(codigo1);

            if(codigo2>0 && codigo2<2000000000){
                producto.codigop=codigo2;
            
                salir=false;
            }else{
                System.out.println("ERROR; POR FAVOR INTENTE DE NUEVO.");
                
                salir=true;
            }
            }catch(Exception e){
                System.out.println("ERROR; POR FAVOR INTENTE DE NUEVO \n");
                
                salir=true;
            }
        }while(salir);
    }
    
}
