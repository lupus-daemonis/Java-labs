package OOP.dataBase;

import java.util.Scanner;

public class Buyer {
    private String name;
    private String address;
    private String manager;

    public Buyer(){
    }

    public Buyer(String name, String address, String manager) {
        this.name = name;
        this.address = address;
        this.manager = manager;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setManager(String manager){
        this.manager = manager;
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getManager(){
        return this.manager;
    }

    public void scan(Scanner scanner){
        System.out.println("Enter buyer's name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter address: ");
        this.address = scanner.nextLine();
        System.out.println("Enter manager name: ");
        this.manager = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", manager='" + manager + '\'' +
                '}';
    }

    public void print(){
        System.out.println(this.toString());
    }
}
