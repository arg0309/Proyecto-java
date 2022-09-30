import java.util.Scanner;

public class Promedio {
    
    public static void main(String[] args){
        double nota1, nota2, nota3, prom;

        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese la primer nota: ");
        nota1 = dato.nextDouble();

        System.out.print("Ingrese la primer nota: ");
        nota2 = dato.nextDouble();

        System.out.print("Ingrese la primer nota: ");
        nota3 = dato.nextDouble();

        prom = (nota1 + nota2 +nota3) /3;

        System.out.print("La nota promedio es: "+prom);

    }
}
