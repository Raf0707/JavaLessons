import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Объявление переменных
        // тип_данных название_переменной = значение переменной;

        //Примитивные типы данных

        // Целые числа
        byte b = 127; // -128 ; 127 -> 1b
        short sh = 32000; // -32768 до 32767 -> 2b
        int in = 2356735; // -2 147 483 648 до 2 147 483 647 -> 4b
        long lo = 1263812637812368368L; // -> 8b
         // –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807

        // Дроби
        double doub = 3.14159265; //±4.9*10^-324 до ±1.7976931348623157*10^308 -> 8b
        float flt = 3.14159265F; // -3.4*10^38 до 3.4*10^38 -> 4b

        // Логический тип
        boolean fls = false;
        boolean truuuue = true;

        // Символы
        char sim = 'c'; // от 0 до 65535 -> 2b
        char ch = 1235; // Таблица ASCII

        //Классовые типы (не являются примитивами)
        // Строки
        String str = "Моя строка";
        String bigStr =
                """
                qtwyetqwueyteu
                qwyeiqyeuiqeyiq
                qwyeuiqyeiqwyeu'
                wueioueioqueioiueo
                qweuowueoiqweuiqoeuio
                
                Это большая строка
                
                
                """;

        // Стандартный вывод на экран
        System.out.println(in);

        // Рандом
        double rand = Math.random();
        System.out.println(rand);

        Random random = new Random();
        int randInt = random.nextInt(12, 240000);
        System.out.println(randInt);
    }

}

// Однострочный комментарий

/*

Многострочный
комментарий

 */



/*
Домашнее задание:
1. Выучить типы данных
2. Уметь задавать переменные всех типов
3. Уметь выводить переменные
*/

