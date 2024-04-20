import java.util.Scanner;
class Modulo {
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        double n1,n2,r;
        System.out.println("Ingrese un numero:");
        n1=opc.nextDouble();
        System.out.println("Ingrese otro numero:");
        n2=opc.nextDouble();
        r=n1*n2/100;
        System.out.println("El resultado es:"+ r);
    }
}