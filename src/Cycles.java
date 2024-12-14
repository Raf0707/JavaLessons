public class Cycles {
    public static void main(String[] args) {
        // Циклы - конечные и бесконечные
        // for, while, do-while

        // Цикл for
        /*
        for ([инициализация счетчика]; [условие]; [изменение счетчика]) {
            // действия
        }
         */
        /*int a = 0;
        for (int i = 0; i < 10; i++) {
            a++;
            System.out.println("a = " + a);
        }*/

        // do-while
        /*int b = 7;
        do {
            System.out.println(b);
            b--;
        } while (b > 0);*/

        // While

        /*int c = 12;
        while (c > 0) {
            System.out.println(c);
            c--;
        }*/

        // true/false, brake/continue

        // continue - выходит из цикла и переходит в следующую его операцию
        // break - полностью выходит из цикла

        for (int i = 0; i < 20; ++i) {
            if (i == 10) {
                continue;
            }
            if (i == 15) {
                break;
            }
            System.out.println(i);
        }

    }
}
