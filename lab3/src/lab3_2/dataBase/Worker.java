package lab3_2.dataBase;

import java.io.PrintStream;
import java.util.Scanner;

public class Worker extends Person implements PrintFIO{

    private String jobTitle;
    private Workshop workshop;

    public Worker(){
        Workshop workshop = Workshop.BAKING;
        this.workshop = workshop;
    }

    public Worker(String fio, String jobTitle, Workshop workshop) {
        super(fio);
        this.jobTitle = jobTitle;
        this.workshop = workshop;
    }

    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public void setWorkshop(Workshop workshop){this.workshop = workshop; }

    public String getJobTitle(){
        return this.jobTitle;
    }
    public Workshop getWorkshop(){ return this.workshop;}


    public void scan(Scanner scanner){
        super.scan(scanner);
        System.out.println("Enter job title: ");
        this.jobTitle = scanner.nextLine();
        this.workshop.scan(scanner);
    }

    @Override
    public String toString() {
        return  ("\n" + jobTitle + " of the " + workshop + " workshop").toLowerCase();
    }

    public void printInfo() {
        System.out.println("Worker: ");
        super.print();
        System.out.println(this.toString());
    }
}
