package lab3_1.dataBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RawMaterialSupply{
    private RawMaterialSupplier supplier;
    private RawMaterial rawMaterial;
    private Date dateOfSupply;
    private int amountOfRawMaterial;

    public RawMaterialSupply(){
        RawMaterialSupplier supplier = new RawMaterialSupplier();
        this.supplier = supplier;
        RawMaterial rawMaterial = new RawMaterial();
        this.rawMaterial = rawMaterial;
    }

    public RawMaterialSupply(RawMaterialSupplier supplier, RawMaterial rawMaterial, Date dateOfSupply, int amountOfRawMaterial) {
        this.supplier = supplier;
        this.rawMaterial = rawMaterial;
        this.dateOfSupply = dateOfSupply;
        this.amountOfRawMaterial = amountOfRawMaterial;
    }

    public void setSupplier(RawMaterialSupplier supplier){
        this.supplier = supplier;
    }
    public void setRawMaterial(RawMaterial rawMaterial){
        this.rawMaterial = rawMaterial;
    }
    public void setDateOfSupply(Date dateOfSupply) {
        this.dateOfSupply = dateOfSupply;
    }
    public void setAmountOfRawMaterial(int amountOfRawMaterial){
        this.amountOfRawMaterial = amountOfRawMaterial;
    }

    public RawMaterialSupplier getSupplier(){
        return this.supplier;
    }
    public RawMaterial getRawMaterial(){
        return this.rawMaterial;
    }
    public Date getDateOfSupply(){
        return this.dateOfSupply;
    }
    public int getAmountOfRawMaterial(){
        return this.amountOfRawMaterial;
    }

    @Override
    public String toString() {
        return "RawMaterialSupply{" +
                "supplier=" + supplier +
                ", rawMaterial=" + rawMaterial +
                ", dateOfSupply=" + dateOfSupply +
                ", amountOfRawMaterial=" + amountOfRawMaterial +
                '}';
    }

    public void scan(Scanner scanner){
        this.supplier.scan(scanner);
        this.rawMaterial.scan(scanner);
        try{
            System.out.println("Enter date of supply (yyyy-MM-dd): ");
            dateOfSupply = new SimpleDateFormat("yyyy-MM-dd").parse(scanner.nextLine());
        }
        catch (ParseException ex){
            System.out.println("Invalid date");
        }
        System.out.println("Enter amount of raw material");
        this.amountOfRawMaterial = scanner.nextInt();
    }

    public void print(){
        System.out.println(this.toString());
    }
}
