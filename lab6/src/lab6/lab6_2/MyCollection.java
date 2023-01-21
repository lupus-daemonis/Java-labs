package lab6.lab6_2;
import OOP.dataBase.*;
import java.util.Collection;
import java.text.ParseException;

public class MyCollection<T> {
    private int count = 0;
    private int size = 2;

    public int getSize(){
        return size;
    }

    @SuppressWarnings("unchecked")
    private T[] collections = (T[]) new Object[size];

    public MyCollection() {
    }

    public MyCollection(int count, T[] collections) {
        this.count = count;
        this.collections = collections;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public T getElementByIndex(int index) {
        return collections[index];
    }

    public T[] getCollections() {
        return collections;
    }

    public void setCollections(T[] collections) {
        this.collections = collections;
    }

    public void addElement(T element) {
        if (count >= size) {
            size = count*2;
            @SuppressWarnings("unchecked")
            T[] collections = (T[]) new Object[size];
            for (int i = 0; i < count; i++) {
                collections[i] = this.collections[i];
            }
            this.collections = collections;
        }
        collections[count++] = element;
    }

    public void replaceElementByIndex(int index, T element) {
        collections[index] = element;
    }

    public void deleteElementByIndex(int index) {
        for (int i = index; i < count-1; i++) {
            collections[i] = collections[i+1];
        }
        count--;
    }

    public void printAll(){
        for (int i = 0; i < count; i++) {
            System.out.println(i);
            System.out.println(collections[i]);
            System.out.println();
        }
    }
}

