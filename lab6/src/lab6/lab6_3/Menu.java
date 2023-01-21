package lab6.lab6_3;

import lab6.lab6_3.MyCollection;
import OOP.dataBase.*;
import java.util.Scanner;

import lab6.lab6_3.MyException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws ParseException, MyException, IOException {
        Scanner scanner = new Scanner(System.in);

        int action = -1;
        Index index = new Index(-1);
        String fileName;

        MyCollection<Production> myCollection = new MyCollection<>();
        do {
            System.out.println( "1. Add element to collection\n" +
                    "2. Update collection element data by index\n" +
                    "3. Remove collection element by index\n" +
                    "4. Display all objects on the screen\n" +
                    "5. Save collection to file\n" +
                    "6. Load collection from file\n" +
                    "0. Exit");

            action = scannerAction(action);
            switch (action) {
                case 0:
                    System.out.println("Program completion");
                    break;
                case 1:
                    System.out.println("Enter element to add");
                    Production production = new Production();
                    production.scan(scanner);
                    myCollection.addElement(production);
                    action = -1;
                    break;
                case 2:
                    try{
                        index.scannerIndex(myCollection.getCount());
                        Production productionReplace = new Production();
                        productionReplace.scan(scanner);
                        myCollection.replaceElementByIndex(index.getIndex(), productionReplace);
                        index.setIndex(-1);
                    } catch(MyException ex){
                        System.out.println(ex.getMessage());
                    }
                    action = -1;
                    break;
                case 3:
                    try{
                        index.scannerIndex(myCollection.getCount());
                        myCollection.deleteElementByIndex(index.getIndex());
                        index.setIndex(-1);
                    } catch(MyException ex){
                        System.out.println(ex.getMessage());
                    }
                    action = -1;
                    break;
                case 4:
                    if(myCollection.getCount() == 0) {
                        System.out.println("There are no elements in the collection\n");
                        action = -1;
                        break;
                    }
                    System.out.println("All objects of the collection");
                    myCollection.printAll();
                    action = -1;
                    break;
                case 5:
                    if(myCollection.getCount() == 0) {
                        System.out.println("There are no elements in the collection\n");
                        action = -1;
                        break;
                    }
                    System.out.println("Saving collection to file");
                    fileName = scanner.nextLine();
                    myCollection.saveToFile(fileName);
                    action = -1;
                    break;
                case 6:
                    System.out.println("Loading collection from file");
                    try {
                        fileName = scanner.nextLine();
                        myCollection.getIntoFile(fileName);
                    }
                    catch (FileNotFoundException e){
                        System.out.println("File not found");
                    }
                    action = -1;
                    break;
            }
        } while (action!=0);
    }


    public static int scannerAction(int action) {
        Scanner scanner = new Scanner(System.in);
        while (action <0 || action > 6){
            try{
                System.out.println("Enter menu item: ");
                if(!scanner.hasNextInt()) throw new InputMismatchException("Error!");
                action = scanner.nextInt();
            } catch (InputMismatchException e){
                scanner.nextLine();
                System.err.println(e.getMessage() + "\nPlease enter a number");
            }
        }
        return action;
    }
}

