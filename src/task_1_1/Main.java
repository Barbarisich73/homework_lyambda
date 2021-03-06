package task_1_1;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);
/*Операция завершится ошибкой: деление на 0
Ошибка закключается в том, что при выполнении операции отнимания у нас получается 0 (b == 0),
который в следущей операции деления является делителем (а/b), а на 0 делить нельзя.
Решение:
1. Можно обработать исключение и создать сообщение о том, что на 0 делить нельзя, но эта ошибка выводится сама.
2. Я использовал тернанрый оператор, проверяющий, является ли делитель нулем, если нет, то производит операцию,
если да, то возвращает 0.
3. Можно провести проверку на то,является ли делитель 0 в теле лямбда выражения с использованием условного
оператора if, например:
BinaryOperator<Integer> devide;
    {
        devide = (x, y) -> {
            if (y != 0) {
                return x / y;
            } else {
                return 0;
            }
        };
    }
 */
        calc.println.accept(c);
    }
}
