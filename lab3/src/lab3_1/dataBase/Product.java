package lab3_1.dataBase;

import java.util.Scanner;

public class Product {
    private String title;
    private ProductType productType;
    private Unit unit;
    double priceForUnit;

    public Product() {
        ProductType productType = new ProductType();
        this.productType = productType;
        Unit unit = new Unit();
        this.unit = unit;
    }

    public Product(String title, ProductType productType, Unit unit, double priceForUnit){
        this.title = title;
        this.productType = productType;
        this.unit = unit;
        this.priceForUnit = priceForUnit;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setProductType(ProductType productType){
        this.productType = productType;
    }
    public void setUnit(Unit unit){
        this.unit = unit;
    }
    public void setPriceForUnit(double priceForUnit){
        this.priceForUnit = priceForUnit;
    }

    public String getTitle(){
        return this.title;
    }
    public ProductType getProductType(){
        return this.productType;
    }
    public Unit getUnit(){
        return this.unit;
    }
    public double getPriceForUnit(){
        return this.priceForUnit;
    }

    public void scan(Scanner scanner) {
        System.out.println("Enter product title: ");
        this.title = scanner.nextLine();
        this.productType.scan(scanner);
        this.unit.scan(scanner);
        int price;
        do{
            System.out.println("Enter price for unit: ");
            price = scanner.nextInt();
        }while (price<=0);
        this.priceForUnit = price;
        scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", productType=" + productType +
                ", unit=" + unit +
                ", priceForUnit=" + priceForUnit +
                '}';
    }

    public void print(){
        System.out.println(this.toString());
    }

}
