package lab3_2.dataBase;

public interface Info {
    default void printInfo(){
        System.out.print(" (weight or volume): ");
    };
}

