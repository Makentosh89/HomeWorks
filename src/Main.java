import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        ДЗ 1.4
        Задача А. Сумма, произведение и среднее арифметическое
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = a + b + c;
        int e = a * b * c;
        float f = (a + b + c)/3;
        System.out.println("Сумма : " + a + "+" + b + "+" + c + "=" + d);
        System.out.println("Произведение :" + a + "*" + b + "*" + c + "=" + e);
        System.out.println("Среднее арифметическое значение :" + (a + "+" + b + "+" + c) + "/" + 3 + "=" + f);


        /*
        Задача B. Градусы
        Дана температура в градусах Цельсия. Вычислить соответствующую температуру в градусах Фаренгейта

         */
        System.out.println("Введите градус по форенгейту :");
        double fg =scanner.nextDouble();
        double fahrenheit =Math.abs(f - 32) * 5 / 9;

        System.out.println("температура по цельсию : " + fahrenheit);//

        System.out.println("Введите температуру по цельсию :");
        double cl =scanner.nextDouble();
        double celc = Math.abs(c * 9 / 5) + 32;
        System.out.println("градус по форенгейту : " + celc);

        /*
        Задача C. Вычисления
        Ввести с клавиатуры трехзначное число и вывести через запятую его цифры
         */
        System.out.println("Введите трехзначное число :");
        int num=scanner.nextInt();

        int k = num / 100;
        int l = num % 100 / 10;
        int m = num % 10;
        System.out.println(k + "," + l + "," + m);

        /*
        ДЗ 1.4
        Задача А. Треугольник?
        Даны три меры угла в градусах, требуется определить – могут ли эти три угла являться углами одного треугольника
        Формат входных данных
        Строка содержит три целых числа A, B, C (числа от 0 до 180)
        Формат выходных данных
        Вывести «ДА» - если могут являться сторонами треугольника, «НЕТ» - в противном случае
        Пример:
        Подсказка: сумма углов треугольника 180°
         */
        System.out.println("Введите 3 градуса угла треугольника :");

        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int sum = a + b + c;//

        if (sum != 180) {
            System.out.println("нет не могут");
        } else if (a1 + b1 == 180 && c1 == 0 || b1 + c1 == 180 && a1 == 0 || a1 + c1 == 180 && b1 == 0) {
            System.out.println("нет не могут");
        } else System.out.println("Да");

        /*
           Задача B  Проверка кратности числа
           Дано число N и число A, нужно написать программу, которая будет выводить нам делится ли N на A без остатка
           формат входных данных
           целые числа N и A.
           формат выходных данных
           Да» или «Нет» в зависимости от того делится ли без остатка
         */
        
        System.out.println("Введите число");
        int num1 = scanner.nextInt();
        System.out.println("Введите число");
        int num2 = scanner.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("Да ");
        } else System.out.println("Нет");


    }
}
