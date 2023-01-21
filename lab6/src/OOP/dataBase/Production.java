package OOP.dataBase;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;

public class Production {
    private Product product;
    private int amount;
    private Workshop workshop;
    private Date productionDate;

    public Production(){
        Product product = new Product();
        this.product = product;
        Workshop workshop = new Workshop();
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
        return "Production{" +
                "product=" + product +
                ", amount=" + amount +
                ", workshop=" + workshop +
                ", productionDate=" + productionDate +
                '}';
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
                System.out.println("Enter production date (yyyy-MM-dd): ");
                scanner.nextLine();
                productionDate = new SimpleDateFormat("yyyy-MM-dd").parse(scanner.nextLine());
            } catch (ParseException ex) {
                System.out.println("Invalid date");
                continue;
            }
            break;
        }
    }

    public void print(){
        System.out.println(this.toString());
    }

    public String fileWrite() {
        return  product.fileWrite()+
                amount + "\n" +
                workshop.fileWrite() +
                productionDate + "\n";
    }

    public void fileRead(String[] params) throws ParseException {
        this.product.fileRead(params[0], params[1], params[2], params[4]);
        this.amount = Integer.parseInt(params[4]);
        this.workshop.fileRead(params[5]);
        System.out.println(params[6]);
        try {
            this.productionDate = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH).parse(params[6]);
        }
        catch (ParseException e){
            Date date = new Date(110, 00, 01);
            this.productionDate = date;
        }
    }
}
