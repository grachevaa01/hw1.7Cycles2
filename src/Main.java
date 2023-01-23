public class Main {
    public static void main(String[] args) {
        int start = 5;
        while (start > 0) {
            System.out.println(start);
            start = start - 1;
        }
        do {
            System.out.println(start);
            start = start - 1;
        }
        while (start > 0);

        int total = 15000;
        int month = 0;
        int m = 0;
        while (m < 2_459_000) {
            month++;
            m = m + total;
            System.out.println("Месяц " + month + " сумма накоплений равна " + m + " рублей");
        }

        int v = 0;
        while (v < 10) {
            v++;
            System.out.print(v);
        }
        System.out.println();

        for (int c = 10; c > 1; c--) {
            System.out.print(c);
        }
        System.out.println();

        int population = 12_000_000;
        int birth = 1200 * 17;
        int death = 1200 * 8;
        int growth = birth - death;
        int year = 2022;
        while (year < 2032) {
            year++;
            population = population + growth;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }

        int salary = 15000;
        int totalSecond = 0;
        int i = 0;
        for (; totalSecond < 12_000_000; i++) {
            totalSecond = totalSecond + totalSecond / 100;
            totalSecond = totalSecond + salary;
            if (i % 6 == 0 && i < 108) {
                System.out.println("Месяц " + i + " Итого " + totalSecond);
            }
        }
        System.out.println(totalSecond);


        int friday = 6;
        while (friday < 31) {
            System.out.println("Сегодня пятница, нужно сделать отчет " + friday);
            friday +=7;
        }

        int now = 2023;
        int past = now - 200;
        int future = now +100;
        for (int u = past; u<future; u++){
            if (u % 79 ==0) {
                System.out.println(u);
            }
        }

    }//
}//
