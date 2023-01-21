package lab3_2.dataBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Production {
    private Product product;
    private int amount;
    private Workshop workshop;
    private Date productionDate;

    public Production(){
        Product product = new Product();
        this.product = product;
        Workshop workshop = Workshop.BAKING;
        this.workshop = workshop;
    }

    public Production(Product product, int amount, Workshop workshop, Date productionDate) {
        this.product = product;
        this.amount = amount;
        this.workshop = workshop;
        this.productionDate = productionDate;
    }

    public void setProduct(Product product){
        this.product = product;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public void setWorkshop(Workshop workshop){
        this.workshop = workshop;
    }
    public void setProductionDate(Date productionDate){
        this.productionDate = productionDate;
    }

    public Product getProduct(){
        return this.product;
    }
    public int getAmount(){
        return this.amount;
    }
    public Workshop getWorkshop(){
        return this.workshop;
    }
    public Date getProductionDate(){
        return this.productionDate;
    }

    @Override
    public String toString() {
        return  product +
                "\namount: " + amount +
                workshop +
                "\nproduction date: " + productionDate;
    }

    public void scan(Scanner scanner){
        this.product.scan(scanner);
        int amount;
        do {
            System.out.println("Enter amount: ");
            amount = scanner.nextInt();
        }while (amount <= 0);
        this.amount = amount;
        this.workshop.scan(scanner);
        while (true) {
            try {
                System.out.println("Enter production date (yyyy-MM-dd HH:mm:ss): ");
                scanner.nextLine();
                productionDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(scanner.nextLine());
            } catch (ParseException ex) {
                System.out.println("Invalid date");
                continue;
            }
            break;
        }
    }

    public void print(){
        System.out.println("\nProduction: ");
        System.out.println(this.toString());
    }
}
