import java.util.Scanner;
public class RestaRecursiva {
public static void main(String[] args) {
    Scanner opc = new Scanner(System.in);
    System.out.println("Ingresa un numero:");
    int n1=opc.nextInt();
    System.out.println("Ingresa otro numero:");
    int n2=opc.nextInt();
    int resultado=RestaRecursiva(n1, n2);
    System.out.println("El resultado de "+n1+ "-" +n2+ "=" + resultado);
}
public static int RestaRecursiva(int a, int b){
    if (b==0){
    return a;
    }else {
    return RestaRecursiva(a-1,b-1);
    }
}
}