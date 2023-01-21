package lab6.lab6_1;
import OOP.dataBase.*;
import java.text.ParseException;

public class MyCollection {

    private int count = 0;
    private Production[] productions = new Production[100];

    public MyCollection() {
    }

    public MyCollection(int count, Production[] productions) {
        this.count = count;
        this.productions = productions;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Production[] getProduction() {
        return productions;
    }

    public void setProduction(Production[] productions) { this.productions = productions; }

    public void addElement(Production production) { productions[count++] = production; }

    public void replaceElementByIndex(int index, Production production) throws ParseException {
        productions[index] = production;
    }

    public void deleteElementByIndex(int index) {
        for (int i = index; i < count-1; i++) {
            productions[i] = productions[i+1];
        }
        count--;
    }

    public void printAll(){
        for (int i = 0; i < count; i++) {
            System.out.println(i);
            System.out.println(productions[i]);
            System.out.println();
        }
    }
}

