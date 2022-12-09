import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//task 1
        int total = 0;
        int money = 15_000;
        int monthNumber = 1;

        while (total <= 2_459_000) {
            total = total + total / 100 + money;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total + " рублей");
            monthNumber++;
        }

        //task 2
        int number = 1;
        while (number <= 10) {
            System.out.print(number++ + " ");
        }
        System.out.println("");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //task 3
        int population = 12_000_000;
        int fertilityPerYear;
        int mortalityPerYear;
        for (int i = 1; i <= 10; i++) {
            fertilityPerYear = population / 1000 * 17;
            mortalityPerYear = population / 1000 * 8;
            population = population + fertilityPerYear - mortalityPerYear;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        //task 4
        total = 15_000;
        monthNumber = 0;
        while (total < 12_000_000) {
            total = total + total * 7 / 100;
            monthNumber++;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total);
        }
        System.out.println("Всего месяцев потребовалось " + monthNumber);

        //task 5
        total = 15_000;
        monthNumber = 0;
        while (total < 12_000_000) {
            total = total + total * 7 / 100;
            monthNumber++;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total);
            }
        }
        System.out.println("Всего месяцев потребовалось " + monthNumber);

        //task 6
        total = 15_000;
        int years = 9;
        int monthsTotal = years * 12;
        monthNumber = 0;
        while (monthNumber < monthsTotal) {
            total = total + total * 7 / 100;
            monthNumber++;
            if (monthNumber % 6 == 0) {
                System.out.println("Полугодие " + monthNumber / 6 + " сумма " + total);
            }
        }

        //task 7
        int firstFridayOfMonth = 4;
        while (firstFridayOfMonth < 31) {
            System.out.println("Сегодня пятница, " + firstFridayOfMonth + "-е число. Необходимо подготовить отчет.");
            firstFridayOfMonth += 7;
        }

        //task 8
        int cometYear = 79;
        LocalDate current_date = LocalDate.now();
        int currentYear = current_date.getYear();

        for (int i = currentYear - 200; i < currentYear + 100; i++) {
            if (i % cometYear == 0) {
                System.out.println(i);
            }
        }
    }
}
