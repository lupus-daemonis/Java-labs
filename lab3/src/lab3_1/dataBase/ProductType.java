package lab3_1.dataBase;

import java.util.Scanner;

public class ProductType {
    private String name;

    ProductType(){
    }

    ProductType(String name) {
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "ProductType{" +
                "name='" + name + '\'' +
                '}';
    }

    public void scan(Scanner scanner){
        System.out.println("Enter product type");
        this.name = scanner.nextLine();
    }

    public void print(){
        System.out.println(this.toString());
    }
}
