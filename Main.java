import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите номер задачи (1-7):");
        int taskNumber = scanner.nextInt();

        switch (taskNumber) {
            case 1:
                System.out.println("Введите число:");
                int num1 = scanner.nextInt();
                checkNumber(num1);
                break;
            case 2:
                System.out.println("Введите число:");
                int num2 = scanner.nextInt();
                checkParity(num2);
                break;
            case 3:
                System.out.println("Введите год:");
                int year = scanner.nextInt();
                System.out.println("Год високосный: " + isLeapYear(year));
                break;
            case 4:
                System.out.println("Введите баллы студента:");
                int score = scanner.nextInt();
                System.out.println("Оценка: " + grade(score));
                break;
            case 5:
                System.out.println("Введите месяц:");
                scanner.nextLine(); // Чтобы пропустить перевод строки после nextInt()
                String month = scanner.nextLine();
                System.out.println("Время года: " + season(month));
                break;
            case 6:
                System.out.println("Введите длины сторон треугольника:");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                System.out.println("Тип треугольника: " + triangleType(a, b, c));
                break;
            case 7:
                System.out.println("Введите число:");
                int num7 = scanner.nextInt();
                System.out.println(multiple(num7));
                break;
            default:
                System.out.println("Неправильный номер задачи");
        }
        scanner.close();
    }

    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("Число положительное");
        } else if (num < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static void checkParity(int num) {
        if (num % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static String grade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static String season(String month) {
        if (month.equals("December") || month.equals("January") || month.equals("February")) {
            return "Зима";
        } else if (month.equals("March") || month.equals("April") || month.equals("May")) {
            return "Весна";
        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
            return "Лето";
        } else if (month.equals("September") || month.equals("October") || month.equals("November")) {
            return "Осень";
        } else {
            return "Неизвестный месяц";
        }
    }

    public static String triangleType(double a, double b, double c) {
        if (a == b && b == c) {
            return "Равносторонний";
        } else if (a == b || b == c || a == c) {
            return "Равнобедренный";
        } else {
            return "Разносторонний";
        }
    }

    public static String multiple(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "Число кратно и 3, и 5";
        } else if (num % 3 == 0) {
            return "Число кратно 3";
        } else if (num % 5 == 0) {
            return "Число кратно 5";
        } else {
            return "Число не кратно ни 3, ни 5";
        }
    }
}

