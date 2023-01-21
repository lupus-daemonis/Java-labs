package lab6.lab6_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class  Index  {
    int index;

    public Index(int index) {
        this.index = index;
    }

    public int scannerIndex(int count) throws MyException {
        Scanner scanner = new Scanner(System.in);
        index = -1;
        if(count == 0) {
            throw new MyException("There are no elements in the collection");
        } else {
            while (true){
                try{
                    System.out.println("Enter index: ");
                    index = scanner.nextInt();
                    if(index <0 || index >= count) throw new MyException("There is no element with this index");
                }
                catch (InputMismatchException e){
                    System.err.println(e.getMessage() + "\nPlease enter number");
                    scanner.nextLine();
                    continue;
                }
                catch (Exception ex){
                    System.out.println(ex.getMessage());
                    continue;
                }
                break;
            }
        }
        return index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
