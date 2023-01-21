package lab3_2.dataBase;

import java.util.Scanner;

public class RawMaterial {
    private String typeOfRawMaterial;
    private Unit unit;
    private double priceForUnit;

    public RawMaterial(){
        Unit unit = new Unit();
        this.unit = unit;
    }

    public RawMaterial(String typeOfRawMaterial, Unit unit, double priceForUnit) {
        this.typeOfRawMaterial = typeOfRawMaterial;
        this.unit = unit;
        this.priceForUnit = priceForUnit;
    }

    public void setTypeOfRawMaterial(String typeOfRawMaterial) {
        this.typeOfRawMaterial = typeOfRawMaterial;
    }
    public void setUnit(Unit unit){
        this.unit = unit;
    }
    public void setPriceForUnit(double priceForUnit){
        this.priceForUnit = priceForUnit;
    }

    @Override
    public String toString() {
        return "\nType of raw material: " + typeOfRawMaterial+
                unit +
                "\nprice for unit: " + priceForUnit;
    }

    public String getTypeOfRawMaterial(){
        return this.typeOfRawMaterial;
    }
    public Unit getUnit(){
        return this.unit;
    }
    public double getPriceForUnit(){
        return this.priceForUnit;
    }

    public void scan(Scanner scanner){
        System.out.println("Enter type of raw material: ");
        this.typeOfRawMaterial = scanner.nextLine();
        this.unit.scan(scanner);
        System.out.println("Enter price for unit");
        this.priceForUnit = scanner.nextDouble();
    }

    public void print(){
        System.out.println("Raw material: ");
        System.out.println(this.toString());
    }
}
