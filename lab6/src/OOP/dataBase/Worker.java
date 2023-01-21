package OOP.dataBase;

import java.util.Scanner;

public class Worker {
    private String name;
    private String jobTitle;
    private Workshop workshop;

    public Worker(){
        Workshop workshop = new Workshop();
        this.workshop = workshop;
    }

    public Worker(String name, String jobTitle, Workshop workshop) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.workshop = workshop;
    }

    public void setWorkerName(String name){
        this.name = name;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public void setWorkshop(Workshop workshop){this.workshop = workshop; }

    public String getWorkerName(){
        return this.name;
    }
    public String getJobTitle(){
        return this.jobTitle;
    }
    public Workshop getWorkshop(){ return this.workshop;}

    public void scan(Scanner scanner){
        System.out.println("Enter worker name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter jon title: ");
        this.jobTitle = scanner.nextLine();
        this.workshop.scan(scanner);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", workshop=" + workshop +
                '}';
    }

    public void print(){
        System.out.println(this.toString());
    }
}
