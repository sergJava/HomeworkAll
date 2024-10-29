public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        byte byteNumber = Byte.MAX_VALUE;
        short shortNumber = Short.MAX_VALUE;
        int integerNumber = Integer.MAX_VALUE;
        long longNumber = 1000L;

        float floatNumber = 0.123456789f;
        double doubleNumber= 0.12345678910111213141516;

        System.out.println("Значение переменной byteNumber c типом byte равно "+ byteNumber);
        System.out.println("Значение переменной shortNumber c типом short равно "+ shortNumber);
        System.out.println("Значение переменной integerNumber c типом integer равно "+ integerNumber);
        System.out.println("Значение переменной longNumber c типом long равно "+ longNumber);

        System.out.println("Значение переменной floatNumber c типом float равно "+ floatNumber);
        System.out.println("Значение переменной doubleNumber c типом double равно "+ doubleNumber);
        System.out.println("______________________________________________");

//        Task 2
        float number1 = 27.12f;
        long number2 = 987678965549L;
        float number3= 2.786f;
        short number4 = 569;
        short number5 = -159;
        short number6 = 27897;
        byte number7 = 67;
//        ______________________________________________

        System.out.println("Task3");
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;

        short sheetsPerStudent = (short) (480 / (class1+class2+class3));
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги.");
        System.out.println("______________________________________________");

        System.out.println("Task 4");
        byte productivityPerMinute = 16/2;
        short productivityIn20Minute = (short) (20 * productivityPerMinute);
        short productivityPerDay = (short) (60*24*productivityPerMinute);
        int productivityIn3Days = 3*productivityPerDay;
        int productivityPerMonth = 30*productivityPerDay;

        System.out.println("За 20 минут машина произвела " + productivityIn20Minute + " штук бутылок.");
        System.out.println("За сутки машина произвела " + productivityPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + productivityIn3Days + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + productivityPerMonth + " штук бутылок.");
        System.out.println("______________________________________________");

        System.out.println("Task 5");
        byte totalCans = 120;
        byte whitePaintPerClassroom = 2;
        byte brownPaintPerRoom = 4;
        byte totalClassrooms = (byte) (totalCans/(whitePaintPerClassroom+brownPaintPerRoom));
        byte totalWhitePaint = (byte) (whitePaintPerClassroom*totalClassrooms);
        byte totalBrownPaint = (byte) (brownPaintPerRoom * totalClassrooms);
        System.out.println("В школе, где " + totalClassrooms + " классов, нужно " + totalWhitePaint +
                " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");
        System.out.println("______________________________________________");

        System.out.println("Task 6");
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;

        short breakfastWeightMg = (short) (5*bananaWeight + 2*milkWeight + 2*iceCreamWeight + 4*eggWeight);
        float breakfastWeightKg = (float) breakfastWeightMg/1000;

        System.out.println("вес завтрака спортсмена составляет " + breakfastWeightMg + " мг, или " +
                breakfastWeightKg + " кг.");
        System.out.println("______________________________________________");

        System.out.println("Task 7");
        byte purposeKg = 7;
        short grPerKg = 1000;
        short purposeMg = (short) (purposeKg*grPerKg);
        short loses250Gr = 250;
        short loses500Gr = 500;
        short losesOnAverage = (short) ((loses250Gr + loses500Gr)/2);
        short numberOfDaysIf250 = (short) (purposeMg / loses250Gr);
        short numberOfDaysIf500 = (short) (purposeMg / loses500Gr);
        float numberOfDaysIfAverage = (float) purposeMg / losesOnAverage;

        System.out.println(numberOfDaysIf250 + " дней уйдет на похудение, если будет терять по " +
                loses250Gr + "гр в день");
        System.out.println(numberOfDaysIf500 + " дней уйдет на похудение, если будет терять по " +
                loses500Gr + "гр в день");
        System.out.println(numberOfDaysIfAverage + " дней уйдет на похудение, если будет терять по " +
                losesOnAverage + "гр в день");
        System.out.println("______________________________________________");

        System.out.println("Task 8");
        int currentSalaryOfMasha = 67760;
        int currentSalaryOfDenis = 83690;
        int currentSalaryOfChristina = 76230;
        byte incrementPercent = 10;
        float increment = 1 + (float) incrementPercent /100;
        int newSalaryOfMasha = (int) (currentSalaryOfMasha*increment);
        int newSalaryOfDenis = (int) (currentSalaryOfDenis*increment);
        int newSalaryOfChristina = (int) (currentSalaryOfChristina*increment);

        int differenceOfMasha = newSalaryOfMasha - currentSalaryOfMasha;
        int differenceOfDenis = newSalaryOfDenis - currentSalaryOfDenis;
        int differenceOfChristina = newSalaryOfChristina- currentSalaryOfChristina;

        System.out.println("Маша теперь получает " +newSalaryOfMasha +" рублей. Годовой доход вырос на " +
                differenceOfMasha +" рублей.");
        System.out.println("Денис теперь получает " +newSalaryOfDenis +" рублей. Годовой доход вырос на " +
                differenceOfDenis +" рублей.");
        System.out.println("Кристина теперь получает " +newSalaryOfChristina +" рублей. Годовой доход вырос на " +
                differenceOfChristina +" рублей.");
    }
}