import java.util.Scanner;
public class Main{
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a and b: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		if (a > b)
			System.out.println("Error: b is less than a");
		else{
			System.out.print("Enter parameter u: ");
			double u = scanner.nextDouble();
			System.out.print("Enter point x: ");
			double x = scanner.nextDouble();
			double res = 0;
			
			if (x < a){
				if (x == 0){
					System.out.print("Error: division by zero in function 1");
					System.exit(0);
				}
				else if (x + u/(5*x) < 0){
					System.out.print("Error: integrand less than zero in function 1");
					System.exit(0);
				}
				else{
				    System.out.println("Function 1");
					res = Math.log(x + u/(5*x));
				}
			}
			else if (x > b){
				if (-u*x + 5 < 0){
					System.out.print("Error: integrand less than zero in function 3");
					System.exit(0);
				}
				else{ 
				    System.out.println("Function 3");
					res = Math.log(-u*x + 5);
				}
			}
			else{
				if (x - 10*u == 0){
					System.out.print("Error: integrand less than zero in function 2");
					System.exit(0);
				}
				else{ 
				    System.out.println("Function 2");
					res = (res = Math.pow(Math.E,-x)/(x - 10*u));
				}
			}
            System.out.println("Execution result: " + res);
		}
    }
}

