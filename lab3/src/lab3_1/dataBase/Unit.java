package lab3_1.dataBase;

import java.util.Scanner;

public class Unit {
    private String typeOfUnit;

    Unit(){
    }

    Unit(String typeOfUnit) {
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
        return "Unit{" +
                "typeOfUnit='" + typeOfUnit + '\'' +
                '}';
    }

    public void scan(Scanner scanner){
        System.out.println("Enter type of unit");
        this.typeOfUnit = scanner.nextLine();
    }

    public void print(){
        System.out.println(this.toString());
    }
}
