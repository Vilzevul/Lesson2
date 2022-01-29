package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Задача №1");
        byte a = 3;
        int b = 15;
        short c = 89;
        long d = 256L;
        float f = 14.4f;
        double g = 144.44;
        boolean h = 5 > 4;
        boolean i = 4 < 2;
        char e = 35;
        System.out.println("byte = " + a);
        System.out.println("int = " + b);
        System.out.println("Short = " + c);
        System.out.println("long = " + d + "L");
        System.out.println("float = " + f + "f");
        System.out.println("double = " + g);
        System.out.println("boolean означает, что 5 > 4 - " + h);
        System.out.println("boolean означает, что 4 < 2 - " + i);
        System.out.println("char означает - " + e);


        System.out.println("Задача №2");

        float firstFighterWeight = 78.2f;
        float secondFighterWeight = 82.7f;
        var overWeight = firstFighterWeight + secondFighterWeight;
        System.out.println("Общий вес бойцов - " + overWeight + " кг");

        var differenceWeight = secondFighterWeight - firstFighterWeight;
        System.out.println("Разница в весе между бойцами " + differenceWeight + " кг");

        System.out.println("Задача №3");

        var bananas = 5;
        var oneBananaWeight = 80;
        var bananasWeight = bananas * oneBananaWeight;
        System.out.println("Общий вес бананов - " + bananasWeight+ " гр");

        var milk = 200;
        var oneHundredMilkMl = 105;
        var milkWeight = milk / 100 * oneHundredMilkMl;
        System.out.println("Вес молока в граммах - " + milkWeight);

        var icecream = 2;
        var icecreamWeight = 100;
        var icecreamOverWeight = icecream * icecreamWeight;
        System.out.println("Вес мороженного будет - " + icecreamOverWeight + " гр");

        var egg = 4;
        var eggWeight = 70;
        var overEggs = egg * eggWeight;
        System.out.println("Общий вес яиц составит - " + overEggs + " г");

        var breackfast = bananasWeight + milkWeight + icecreamOverWeight + overEggs;
        System.out.println("Завтрак будет весить - " + breackfast + "гр");

        float kgramm = 1_000f;
        float kilogrammBreackfast = breackfast / kgramm;
        System.out.println("Вес завтрака составит - " + kilogrammBreackfast + "кг");

        System.out.println("Задание №4");

        int needKg = 7;
        int needKgG = needKg * 1000;
        System.out.println("Необходимый вес в граммах - " + needKgG);

        int massaMin = 250;
        int minDay = needKgG / massaMin;
        System.out.println(minDay + " дней потребуется спортсмену для похудения при потере 250 граммов в день ");

        int massaMax = 500;
        int maxDay = needKgG / massaMax;
        System.out.println(maxDay + " дней потребуется спортсмену для похудения при потере 500 граммов в день");

        int summaDay = minDay + maxDay;
        int middleDay = summaDay /2;
        System.out.println("Среднее значение дней - " + middleDay);

        System.out.println("Задача №5");

        int mashaPay = 67_760;
        int denisPay = 83_690;
        int kristinaPay = 76_230;

        int yearMasha = mashaPay * 12;
        int yearDenis = denisPay * 12;
        int yearkristina = kristinaPay * 12;
        System.out.println("Годовая зарплата Маши составляет " + yearMasha);
        System.out.println("Годовая зарплата Дениса составляет " + yearDenis);
        System.out.println("Годовая зарплата Кристины составляет " + yearkristina);

        var percent = 10;

        var percentPayMasha = yearMasha / 100 *  percent;
        var percentPayDenis = yearDenis / 100 * percent;
        var percentPayKristina = yearkristina / 100 * percent;
        System.out.println("Прибавка к зарплате Маши составила " +percentPayMasha + " рублей в год");
        System.out.println("Прибавка к зарплате Дениса составила " + percentPayDenis + " рублей в год");
        System.out.println("Прибавка к зарплате Кристины составила " + percentPayKristina + " рублей в год");

        var mashasPayNow = yearMasha + percentPayMasha;
        var denisPayNow = yearDenis + percentPayDenis;
        var kristinaPayNow = yearkristina + percentPayKristina;
        System.out.println("Теперь Маша получает - " + mashasPayNow + " рублей в год");
        System.out.println("Теперь Денис получает - " + denisPayNow + " рублей в год");
        System.out.println("Теперь Кристина получает - " + kristinaPayNow + " рублей в год");

        System.out.println("Маша теперь получает " + mashasPayNow + " рублей в год. " + " Годовой доход вырос на " + percentPayMasha + " рублей");
        System.out.println("Денис теперь получает " + denisPayNow + " рублей в год. " + " Годовой доход вырос на " + percentPayDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristinaPayNow + " рублей в год. " + " Годовой доход вырос на " + percentPayKristina + " рублей");
    }
}
