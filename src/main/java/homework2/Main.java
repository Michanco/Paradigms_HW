package homework2;
//        Условие
//        На вход подается число n.
//        ● Задача
//        Написать скрипт в любой парадигме, который выводит на экран таблицу умножения всех чисел от 1 до n.
//        Обоснуйте выбор парадигм.
//        ● Пример вывода:
//        1 * 1 = 1
//        1 * 2 = 2
//        1 * 3 = 3
//        1 * 4 = 4
//        1 * 5 = 5
//        1 * 6 = 6
//        ..
//        1 * 9 = 9

// процедурная структурная императивная парадигма
// возможность изменения реализации вывода
// возможность реализации юнит тестов
// возможность реализации принципа инкапсуляции
public class Main {
    public static void main(String[] args) {
        printTable(9);
    }

    static void printCell(int a, int b, int c){
        System.out.printf(" %s * %s = %s ", a, b, c);
    }
    static void printTable(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=n ; j++) {
                int res = i * j;
                printCell(j, i, res);
            }
            System.out.println();
        }
    }

}
