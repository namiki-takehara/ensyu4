import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("weight(cm)=");
            double height = scanner.nextDouble() / 100;
            System.out.print("height(kg)=");
            double weight = scanner.nextDouble();
            System.out.println("BMI=" + weight / height / height);
    }
}