package Lab5_1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab5_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int h = 0;
        while (true){
            System.out.print("Enter prism side: ");
            try{
                a = scanner.nextInt();
                if(a <= 0) throw new Exception("The length of prism side is less then 1. Enter correct data ");
            }
            catch (InputMismatchException ex){
                System.out.println("Please type a number");
                scanner.next();
                continue;
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                continue;
            }
            break;
        }

        while (true){
            System.out.print("Enter prism heigth: ");
            try{
                h = scanner.nextInt();
                if(h <= 0) throw new Exception("The prism height is less then 1. Enter correct data ");
            }
            catch (InputMismatchException ex){
                System.out.println("Please type a number");
                scanner.next();
                continue;
            }
            catch (Exception ex){
                System.out.println(ex.getMessage());
                continue;
            }
            break;
        }

            double S = 3 * a * (Math.sqrt(3 * a) + 2 * h);
            System.out.println("The surface area of a regular hexagonal prism is " + S);
    }
}

