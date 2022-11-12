public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Task1");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //task2
        System.out.println("Task2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //task3
        System.out.println("Task3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        //task4
        System.out.println("Task4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Циклы. Урок2");
        //task1-2 Циклы
        int start = 0;
        int month =0;
        while (start < 2_459_000) {
            System.out.println("Месяц " + month + " сумма накоплений равна " + start + "рублей");
            start = start += 15_000;
            month = month+1;
        }
        //task 2
        int value =1;
        while (value<=10){
            System.out.print(value );
            value++;
        }
        System.out.println();
        int i = 10;
        for (i = 10;i>=1; i--){
            System.out.print (i);
        }
        //task 3
        System.out.println();
        System.out.println("Задание 3");
        int amountOfPeople = 12_000_000;
        int everyYearBorn = 17;
        int everyYearDeath = 8;
        int dif = everyYearBorn-everyYearDeath;
        int year;
        for (year =0;year <=10;year++ ){
            amountOfPeople +=amountOfPeople*dif/1000;
            System.out.println("Год " + year + " численность населения составляет " + amountOfPeople);
        }
        //task2-1
        int sum = 15000;
        int monthNumber = 1;
        while (sum <=12_000_000){
            sum*=1.07;
            System.out.println("Месяц " + monthNumber + " сумма накоплений составляет "+ sum);
            monthNumber++;
        }
        // task 3-1
        int sum1 = 15000;
        int monthNumber1 = 1;
        while (sum1 <=12_000_000){
            sum1*=1.07;
            if (monthNumber1 % 6 ==0){
                System.out.println("Месяц " + monthNumber1 + " Накопления составил " + sum1);
            }
            monthNumber1++;
        }
        //task3-2
        int start1 = 15000;
        for (i =1;i <9*12;i+=6 ){
            start1*=1+0.07*6;
            System.out.println("Месяц " + i +" составляет " + start1);
        }
        int pervayaPyatniza = 3;
        for (int deistvPyatniza = pervayaPyatniza; deistvPyatniza<=31; deistvPyatniza+=7){
            System.out.println("Сегодня пятница " + deistvPyatniza + " Необходимо подготовить отчет");
        }
        //task 3-3
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i1 = beginning; i1 < ending; ++i1 ){
          if (1 % 79 == 0){
         System.out.println(i1);
     }
        }
        //task3-2
        for (int i3 = 1;i3<10;i3++){
            System.out.println("2*"+ i3+"="+2*i3);
        }
        }

    }
