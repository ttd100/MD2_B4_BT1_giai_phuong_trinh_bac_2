import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("nhập a: ");
        double a = scanner.nextDouble();
        while (a==0){
            System.out.println("nhập lại a");
            a= scanner.nextDouble();
        }
        System.out.printf("nhập b: ");
        double b = scanner.nextDouble();
        System.out.printf("nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println("delta = "+quadraticEquation.getDelta());
        if (quadraticEquation.getDelta()<0){
            System.out.println("phương trình vô nghiệm");
        } else if (quadraticEquation.getDelta()==0) {
            System.out.printf("phương trình có nghiệm kép x1=x2="+quadraticEquation.nghiemKep());
        } else if (quadraticEquation.getDelta()>0) {
            System.out.printf("phương trình có nghiệm x1="+quadraticEquation.getRoot1()+"; x2="+quadraticEquation.getRoot2());
        }
    }
}