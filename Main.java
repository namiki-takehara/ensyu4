import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int i = 0;
            while(i < 2) {
                System.out.print("weight(cm)=");
                double height = scanner.nextDouble() / 100;
                System.out.print("height(kg)=");
                double weight = scanner.nextDouble();
                System.out.println("BMI=" + weight / height / height);
                i = i + 1;
            }
    }
}