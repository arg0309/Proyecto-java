import java.util.Scanner;

public class Porcentaje {

        public static void main(String[] args){
            double vlr, dto, vt;

         /*  precio = 120000;
            dto = 17;

            vdto = (120000 * 17) /100;

            System.out.print("El valor del descuento es: " +vdto);*/


            Scanner dato=new Scanner(System.in);
            System.out.print("Ingrese el preio: ");
            vlr = dato.nextDouble();
    
            System.out.print("Ingrese el descuento: ");
            dto = dato.nextDouble();
    
    
            vt = vlr - (vlr * dto) /100;
    
            System.out.println("El total a pagar es: "+vlr);
        
            System.out.println("El descuento es: "+dto+"%");
            System.out.println("El total a pagar menos el descuento es: " +vt);

    
        }
}
