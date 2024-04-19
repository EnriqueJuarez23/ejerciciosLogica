import java.util.Scanner;
class Division {
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in);
        int a,b,r;
        System.out.println("Ingrese un numero:");
        a=opc.nextInt();
        System.out.println("Ingrese otro numero:");
        b=opc.nextInt();
        r=a/b;
        System.out.println("El resultado es:"+ r);
    }
}