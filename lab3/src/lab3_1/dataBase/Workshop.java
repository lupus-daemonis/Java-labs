package lab3_1.dataBase;

import java.util.Scanner;

public class Workshop {
    private int workshopNumber;

    Workshop(){
    }

    Workshop(int workshopNumber) {
        this.workshopNumber = workshopNumber;
    }

    public void setWorkshopNumber(int workshopNumber){
        this.workshopNumber = workshopNumber;
    }

    public int getWorkshopNumber(){
        return this.workshopNumber;
    }

    @Override
    public String toString() {
        return "Workshop{" +
                "workshopNumber=" + workshopNumber +
                '}';
    }

    public void scan(Scanner scanner){
        System.out.println("Enter workshop number: ");
        this.workshopNumber = scanner.nextInt();
    }

    public void print(){
        System.out.println(this.toString());
    }

}
