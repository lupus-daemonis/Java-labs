package lab3_2.dataBase;

import java.util.Scanner;

public enum ProductType{
    CAKE(5),
    CUPCAKE(10),
    CANDY(50),
    CHOCOLATE(100),
    MARSHMALLOW(120);

    private int shelf_life;

    ProductType(){
    }

    ProductType(int shelf_life) {
        this.shelf_life = shelf_life;
    }

    public void setShelf_life(int shelf_life){
        this.shelf_life = shelf_life;
    }

    public int getshelf_life(){
        return this.shelf_life;
    }

    public static ProductType[] getBakingProducts() {
        return new ProductType[]{CAKE, CUPCAKE};
    }

    public ProductType scan(Scanner scanner){
        Boolean b = false;
        ProductType res = CAKE;
        do {
            System.out.println("Enter product type: ");
            ProductType[] values = ProductType.values();
            for (ProductType productType : values) {
                System.out.println(productType.ordinal() + " " + productType.name());
            }
            String s = scanner.nextLine();

            switch (s) {
                case "CAKE":
                case "cake":
                case "0" :
                    res = CAKE;
                    break;
                case "CUPCAKE":
                case "cupcake":
                case "1" :
                    res = CUPCAKE;
                    break;
                case "CANDY":
                case "candy":
                case "2" :
                    res = CANDY;
                    break;
                case "CHOCOLATE":
                case "chocolate":
                case "3" :
                    res = CHOCOLATE;
                    break;
                case "MARSHMALLOW":
                case "marshmallow":
                case "4" :
                    res = MARSHMALLOW;
                    break;
                default:
                    b = true;
            }
        }while (b);
        return res;
    }

    public void print(){
        System.out.println("\nProduct type: " + name().toLowerCase());
    }
}
