import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double base, lado;
        int ntriangulos;

        System.out.println("Digits e1 numero de triangulos a ingresar:");
        ntriangulos = sc.nextInt();


        Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[ntriangulos];

        for (int i=0; i<triangulos.length;i++) {

            System.out.println("\nDigite los valores para el triangulo "+(i+1)+":");
            System.out.println("Introduzca la base: ");
            base = sc.nextDouble();
            System.out.println("Introduzca el lado: ");
            lado = sc.nextDouble();

            triangulos[i] = new Triangulo_Isosceles(base,lado);



        }

    }
}
