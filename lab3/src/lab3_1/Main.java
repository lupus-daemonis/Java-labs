package lab3_1;

import lab3_1.dataBase.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sale s = new Sale();
        s.scan(scanner);
        s.print();
    }
}
