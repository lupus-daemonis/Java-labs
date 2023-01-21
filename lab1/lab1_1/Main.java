import java.util.Scanner;
public class Main{
    public static void main(String[] args){
		System.out.print("Enter prism side: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.print("Enter prism heigth: ");
		int h = scanner.nextInt();
		if (a <= 0 || h <= 0)
			System.out.println("Error");
		else{
			double S = 3 * a * (Math.sqrt(3 * a) + 2 * h);
			System.out.println("The surface area of a regular hexagonal prism is " + S);
		}
    }
}