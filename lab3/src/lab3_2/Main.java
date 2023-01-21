package lab3_2;

import lab3_2.dataBase.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product w = new Product();
        w.scan(scanner);
        w.print();
    }
}
