import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1987, "Maxim", "Minsk", "brand-manager");
        Human anya = new Human(-1993, "Anna", null, "methodologistOfEducationalPrograms");
        Human katya = new Human(1994, "Katya", "Kaliningrad", "productManager");
        Human artem = new Human(1995, "Artem", "Moskow", "directorOfBusinessDevelopment");
        Human vlad = new Human(2001, "Vladimir", "Kazan", null);
        System.out.println("Привет! Меня зовут " + maxim.name + ". Я из города " + maxim.getTown() +
                ". Я родился в " + maxim.getYearOfBirth() + " году. Я работаю на должности " + maxim.position + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name + ". Я из города " + anya.getTown() +
                ". Я родилась в " + anya.getYearOfBirth() + " году. Я работаю на должности " + anya.position + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.getTown() +
                ". Я родилась в " + katya.getYearOfBirth() + " году. Я работаю на должности " + katya.position + ".  Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.getTown() +
                ". Я родился в " + artem.getYearOfBirth() + " году. Я работаю на должности " + artem.position + ".  Будем знакомы!");
        System.out.println("Привет! Меня зовут " + vlad.name + ". Я из города " + vlad.getTown() +
                ". Я родился в " + vlad.getYearOfBirth() + " году. Я работаю на должности " + vlad.position + ".  Будем знакомы!");


        Flower rose = new Flower(null, "Голландия", 35.59);
        Flower chrysanthemum = new Flower(null, null, 15);
        chrysanthemum.setLifeSpan(5);
        Flower pion = new Flower(null, "Англия", 69.9);
        pion.setLifeSpan(1);
        Flower gypsophila = new Flower(null, "Турция", 19.5);
        gypsophila.setLifeSpan(10);
        printInfo(rose);
        printInfo(chrysanthemum);
        printInfo(pion);
        printInfo(gypsophila);
        printTotalCost(rose, rose, rose, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, gypsophila);

        Car lada = new Car("Lada", "Grande", 2015, "Россия", "желтый",
                135, 1.7, "механическая", "хэтчбек", "Н258РО257", 4,
                "Summer", null, null);
        Car audi = new Car("Audi", "A8_50_L_TDI_quattro", 2020, "Германия",
                "черный", 168, 3.0, "Автомат", "седан",
                "Р785АВ078", 4, null, null, null);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "зеленый", 187,
                3.0, "Автомат", "седан", null, 4, null, null, null);
        Car kia = new Car("Kia", "Sportage", 2018, "Северная Корея", "красный", 184,
                2.4, "Автомат", "универсал", "О748ВУ041", 4, "winter", null, null);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Северная Корея", "оранжевый",
                175, 1.6, "Автомат", null, "С894РК787",
                4, "summer", null, null);
        System.out.println(lada);
        System.out.println("Можно запрвить: " + lada.refill());
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);


//- Поезд Ласточка, модель B-901, 2011 год выпуска в России, скорость передвижения – 301 км/ч,
// отходит от Белорусского вокзала и следует до станции Минск-Пассажирский. Цена поездки - 3500 рублей, в поезде 11 вагонов
//- Поезд Ленинград, модель D-125, 2019 год выпуска в России, скорость передвижения – 270 км/ч, отходит от
// Ленинградского вокзала и следует до станции Ленинград-Пассажирский. Цена поездки - 1700 рублей, в поезде 8 вагонов.


        Train train1 = new Train("Ласточка", "В-901", 2011, "Россия", null,
                301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        System.out.println("Можно запрвить: " + train1.refill());
        Train train2 = new Train("Ленинград", "D-125", 2019, "Россия", null,
                270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);
        System.out.println(train1);
        System.out.println(train2);

        Bus bus1 = new Bus("Межгород", "Р-157", 2005, "Россия", "Желтый", 84);
        System.out.println("Можно запрвить: " + bus1.refill());
        Bus bus2 = new Bus("Сокол", "Л-654", 2010, "Россия", null, 74);
        Bus bus3 = new Bus("Витязь", "А-541", 2015, "Россия", "белый", 75);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

    }

    public static void printInfo(Flower flower) {
        System.out.println("цвеь: " + flower.getFlowerColor() + ", страна:" + flower.getCountry() + ", cтоимость за штуку:" + flower.getCost() +
                ", срок стояния:" + flower.getLifeSpan());
    }


    public static void printTotalCost(Flower... flowers) {
        double totalCost = 0;
        int miniLafeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < miniLafeSpan) {
                miniLafeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
        totalCost = totalCost * 1.1d;
        System.out.println("totalCost = " + totalCost);
        System.out.println("срок стояния букета: " + miniLafeSpan);
    }
}