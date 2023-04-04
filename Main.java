public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        /*
        Код не работал по причине того, что b = 0. При этом b является знаменателем,
        а на нуль делить нельзя.
        Для решения данной проблемы, надо обрабатывать случай, когда знаменатель равен нулю
         */

        calc.println.accept(c);
    }
}