package Lab4_1;
import java.util.Scanner;
import java.lang.String;
import java.util.Random;
import java.util.Arrays;

public class Lab4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String str = scanner.nextLine();

        //Task1(str);         //вызов функций для заданий (нужное раскомментить)
        //Task2(str);
        //Task3(str);

        scanner.close();
    }

    public static void Task1(String str){
        String signs = ".!?";                   //признаки конца предложения
        String glas = "aeiouyаеёиоуыэюя";       //гласные буквы
        int[] arr = new int[10];
        int i = 0;
        int j = 0;
        int kolGlas = 0;
        int kolSoglas = 0;
        boolean check = false;
        str = str + ".";                       //на случай, если в конце последнего предложения нет знака препинания
        while (i < str.length()) {             //проверяем все символы до конца строки
            if (Character.isAlphabetic(str.codePointAt(i))) {   //если символ - буква
                if (glas.indexOf(str.charAt(i)) >= 0) {         //проверяем гласная или согласная
                    kolGlas++;
                }
                else kolSoglas++;
            }
            if (signs.indexOf(str.charAt(i)) >= 0 && !check) {  //если символ - знак конца строки
                if (kolGlas > kolSoglas)                        //подводим итог каких букв больше
                    arr[j] = 0;
                else if (kolGlas < kolSoglas)
                    arr[j] = 1;
                else arr[j] = 2;
                j++;
                kolGlas = 0;                                   //обнуляем количество букв для следующего предложения
                kolSoglas = 0;
                check = true;                                  //на случай, если подряд несколько знаков препинания
            }
            else check = false;
            i++;
        }
        for (i = 0; i < j; i++){
            if (arr[i] == 0)
                System.out.print("В " + (i + 1) + " предложении больше гласных\n");
            else if (arr[i] == 1)
                System.out.print("В " + (i + 1) + " предложении больше согласных\n");
            else
                System.out.print("В " + (i + 1) + " одинаковое количество гласных и согласных\n");
        }
    }

    public static void Task2(String str){
        int j = 0;
        int rand = 0;
        String[] parts = new String[str.length()/3];            //выделяем память под фрагменты
        for(int i = 0; i < str.length() - 2; i = i + 3) {
            parts[j++] = str.substring(i, i + 3);               //разделяем на фрагменты по 3 символа
        }
        System.out.print("Деление на фрагменты: ");
        for (int i = 0; i < j; i++) {
            System.out.print("\n" + parts[i]);
        }
        Random r = new Random();
        for (int i = 0; i < j; i++) {
            StringBuilder sb = new StringBuilder(parts[i]);
            rand = r.nextInt(26) + 'a';                    //генерируем рандомный символ
            while (rand == parts[i].charAt(0) || rand == parts[i].charAt(1) || rand == parts[i].charAt(2)) {  //если такой символ уже есть во фрагменте
                rand = r.nextInt(26) + 'a';                                                            //генерируем новый
            }
            sb.setCharAt(1, (char)rand);            //меняем средний символ
            parts[i] = sb.toString();
        }
        System.out.print("\nЗамена символа и сортировка: ");
        for (int i = 0; i < j; i++) {
            System.out.print("\n" + parts[i]);
        }
        System.out.print("\nФрагменты по алфавиту: ");
        for (int i = 0; i < j; i++) {
            char[] part = parts[i].toCharArray();
            Arrays.sort(part);                              //сортируем символы фрагмента по алфавиту
            if (parts[i].equals(String.valueOf(part))){     //сравниваем с фрагментов до сортировки
                System.out.print("\n" + parts[i]);          //если они равны - выводим
            }
        }
    }

    public static void Task3(String str){
        str = str.trim();                                     //удаляем пробелы в начале строки
        while(str.contains("  ")) {                           //пока существует двойной пробел
            str = str.replace("  ", " ");     //меняем его на одинарный
        }
        System.out.println(str);
    }

}

