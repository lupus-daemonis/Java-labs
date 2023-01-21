package lab3_2.dataBase;

import java.util.Scanner;

public enum Workshop {
    BAKING(1),
    CONFECTIONERY(2),
    REVISION(3),
    FINISHING(4),
    PACKING(5);

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

    public static Workshop[] getCookingWorkshops() {
        return new Workshop[]{BAKING, CONFECTIONERY};
    }

    public Workshop scan(Scanner scanner){
        Boolean b = false;
        Workshop res = BAKING;
        do {
            System.out.println("Enter workshop: ");
            Workshop[] values = Workshop.values();
            for (Workshop workshop : values) {
                System.out.println(workshop.ordinal() + " " + workshop.name());
            }
            String s = scanner.nextLine();

            switch (s) {
                case "BAKING":
                case "baking":
                case "0" :
                    res = BAKING;
                    break;
                case "CONFECTIONERY":
                case "confectionery":
                case "1" :
                    res = CONFECTIONERY;
                    break;
                case "REVISION":
                case "revision":
                case "2" :
                    res = REVISION;
                    break;
                case "FINISHING":
                case "finishing":
                case "3" :
                    res = FINISHING;
                    break;
                case "PACKING":
                case "packing":
                case "4" :
                    res = PACKING;
                    break;
                default:
                    b = true;
            }
        }while (b);
        return res;
    }

    public void print(){
        System.out.println("Workshop: " + name().toLowerCase());
    }

}
