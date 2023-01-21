package Lab5_2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double u = 0;
        double x = 0;
        double res = 0;
        while (true) {
            try {
                System.out.print("Enter a and b:\n");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                if (a > b) throw new Exception("Error: b is less than a");
            }
            catch (InputMismatchException ex){
                System.out.println("Please type a number");
                scanner.next();
                continue;
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
                continue;
            }
            break;
        }

        while (true) {
            try {
                System.out.print("Enter parameter u: ");
                u = scanner.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Please type a number");
                scanner.next();
                continue;
            }
            break;
        }

        while (true) {
            try {
                System.out.print("Enter parameter x: ");
                x = scanner.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Please type a number");
                scanner.next();
                continue;
            }
            break;
        }

        if (x < a) {
            try {
                res = Math.log(x + u / (5 * x));
                System.out.println("Function 1");
                if (x == 0) throw new Exception("Error: division by zero in function 1");
                if (x + u / (5 * x) < 0) throw new Exception("Error: integrand less than zero in function 1");
                System.out.println("Execution result: " + res);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        else if (x > b){
            try {
                res = Math.log(-u*x + 5);
                System.out.println("Function 3");
                if (-u*x + 5 < 0) throw new Exception("Error: integrand less than zero in function 3");
                System.out.println("Execution result: " + res);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        else{
            try {
                res = Math.pow(Math.E,-x)/(x - 10*u);
                System.out.println("Function 2");
                if (x - 10 * u == 0) throw new Exception("Error: division by zero 2");
                System.out.println("Execution result: " + res);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
