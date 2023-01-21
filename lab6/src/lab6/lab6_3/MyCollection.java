package lab6.lab6_3;
import OOP.dataBase.*;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;

public class MyCollection<T extends Production> extends lab6.lab6_2.MyCollection<T> {

    public void saveToFile(String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName, true);
        for (int i = 0; i < super.getCount(); i++) {
            fileWriter.write(getElementByIndex(i).fileWrite());
            fileWriter.write("->");
            fileWriter.flush();
        }
        System.out.println("Data was successfully written to the file");
        fileWriter.close();
    }

    @SuppressWarnings("unchecked")
    public void getIntoFile(String fileName) throws IOException, ParseException {
        String fileString = "";
        FileReader fileReader = new FileReader(fileName);
        char[] buf = new char[256];
        int c;

        while((c = fileReader.read(buf))>0){
            if(c < 256){
                buf = Arrays.copyOf(buf, c);
            }
            fileString += new String(buf);
        }
        String[] strs = fileString.split("->");

        for (int i = 0; i < strs.length; i++) {
            T element = (T) new Production();
            element.fileRead(strs[i].split("\n"));
            addElement((T)element);
        }
        System.out.println("Data was successfully read from file");
        fileReader.close();
    }
}

