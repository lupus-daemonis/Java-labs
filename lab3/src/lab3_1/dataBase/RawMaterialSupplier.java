package lab3_1.dataBase;

import java.util.Scanner;

public class RawMaterialSupplier {
    private String name;
    private String address;
    private String telephone;

    public RawMaterialSupplier(){
    }

    public RawMaterialSupplier(String name, String address, String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getTelephone(){
        return this.telephone;
    }

    public void scan(Scanner scanner){
        System.out.println("Enter supplier name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter supplier address: ");
        this.address = scanner.nextLine();
        System.out.println("Enter supplier telephone: ");
        this.telephone = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "RawMaterialSupplier{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    public void print(){
        System.out.println(this.toString());
    }
}
