package lab3_1.dataBase;

import java.util.Scanner;

public class UsedRawMaterial {
    private Product product;
    private RawMaterial rawMaterial;
    private int amount;

    UsedRawMaterial(){
        Product product = new Product();
        this.product = product;
        RawMaterial rawMaterial = new RawMaterial();
        this.rawMaterial = rawMaterial;
    }

    @Override
    public String toString() {
        return "UsedRawMaterial{" +
                "product=" + product +
                ", rawMaterial=" + rawMaterial +
                ", amount=" + amount +
                '}';
    }

    UsedRawMaterial(Product product, RawMaterial rawMaterial, int amount){
        this.product = product;
        this.rawMaterial = rawMaterial;
        this.amount = amount;
    }

    public void setProduct(Product product){this.product = product;}
    public void setRawMaterial(RawMaterial rawMaterial){this.rawMaterial = rawMaterial;}
    public void setAmount(int amount){
        this.amount = amount;
    }

    public Product getProduct() { return this.product; }
    public RawMaterial getRawMaterial() { return this.rawMaterial; }
    public int getAmount(){
        return this.amount;
    }

    public void scan(Scanner scanner){
        this.product.scan(scanner);
        this.rawMaterial.scan(scanner);
        System.out.println("Enter amount of raw material: ");
        this.amount = scanner.nextInt();
    }

    public void print(){
        System.out.println(this.toString());
    }
}
