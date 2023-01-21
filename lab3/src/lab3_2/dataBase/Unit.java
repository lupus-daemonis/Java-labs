package lab3_2.dataBase;

import java.util.Scanner;

public class Unit implements Info{
    private String typeOfUnit;

    public Unit(){
    }

    public Unit(String typeOfUnit) {
        this.typeOfUnit = typeOfUnit;
    }

    public void setTypeOfUnit(String typeOfUnit){
        this.typeOfUnit = typeOfUnit;
    }

    public String getTypeOfUnit(){
        return this.typeOfUnit;
    }

    @Override
    public String toString() {
        return "\nunit of measurement: " + typeOfUnit;
    }

    public void scan(Scanner scanner){
        System.out.println("Enter type of unit");
        printInfo();
        this.typeOfUnit = scanner.nextLine();
    }

    public void print(){
        System.out.println(this.toString());
    }
}
