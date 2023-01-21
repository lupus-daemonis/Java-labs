package lab3_2.dataBase;

import java.util.Scanner;

public class Buyer extends Person implements PrintFIO{
    private String name;
    private String address;

    public Buyer(){
    }

    public Buyer(String manager, String name, String address) {
        super(manager);
        this.name = name;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void printInfo() {
        super.print();
        System.out.println(this);
    }

    public void scan(Scanner scanner){
        System.out.println("Enter company name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter address: ");
        this.address = scanner.nextLine();
        System.out.println("Manager of " + name);
        super.scan(scanner);
    }

    @Override
    public String toString() {
        return "name: " + name +
                "\naddress: " + address +
                "\nmanager of " + name + ": ";
    }

    public void print(){
        System.out.println("\nBuyer: ");
        System.out.println(this.toString());
        super.print();
    }
}
