package Lab4_2;
import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        text = Task(text);
        System.out.println(text);
        scanner.close();
    }

    public static String Task(String text){
        int num = 0;
        int i = 0;
        text = text + ' ';
        while (i < text.length()-1) {
            if (text.charAt(i) == text.charAt(i + 1))
                num++;
            else if (num > 0) {
                String part = text.substring(i - num, i + 1);
                text = text.replace(part, text.charAt(i) + String.valueOf(num + 1));
                i = i - num + 1;
                num = 0;
            }
            i++;
        }
        return text;
    }
}