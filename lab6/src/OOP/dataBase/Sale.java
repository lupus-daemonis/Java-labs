package OOP.dataBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Sale {
    private Product product;
    private Buyer buyer;
    private int amountOfProduct;
    private Date dateOfSale;

    public Sale(){
        Product product = new Product();
        this.product = product;
        Buyer buyer = new Buyer();
        this.buyer = buyer;
    }

    Sale(Product product, Buyer buyer, int amountOfProduct, Date dateOfSale){
        this.product = product;
        this.buyer = buyer;
        this.amountOfProduct = amountOfProduct;
        this.dateOfSale = dateOfSale;
    }

    public void setProduct(Product product){
        this.product = product;
    }
    public void setBuyer(Buyer buyer){
        this.buyer = buyer;
    }
    public void setAmountOfProduct(int amountOfProduct){
        this.amountOfProduct = amountOfProduct;
    }
    public void setDateOfSale(Date dateOfSale){
        this.dateOfSale = dateOfSale;
    }

    public Product getProduct(){
        return this.product;
    }
    public Buyer getBuyer(){
        return this.buyer;
    }
    public int getAmountOfProduct(){
        return this.amountOfProduct;
    }
    public Date getDateOfSale(){
        return this.dateOfSale;
    }

    @Override
    public String toString() {
        return "amount of product: " + amountOfProduct +
                "date of sale: " + dateOfSale +
                "\nproduct=" + product +
                "\n buyer=" + buyer +
                '}';
    }

    public void scan(Scanner scanner){
        this.product.scan(scanner);
        this.buyer.scan(scanner);
        System.out.println("Enter amount of product");
        this.amountOfProduct = scanner.nextInt();
        while(true){
        try{
            System.out.println("Enter date of sale (yyyy-MM-dd): ");
            scanner.nextLine();
            dateOfSale = new SimpleDateFormat("yyyy-MM-dd").parse(scanner.nextLine());
        }
        catch (ParseException ex) {
            System.out.println("Invalid date");
            continue;
        }
        break;
        }
    }

    public void print(){
        System.out.println("Sale: ");
        System.out.println(this.toString());
    }
}
