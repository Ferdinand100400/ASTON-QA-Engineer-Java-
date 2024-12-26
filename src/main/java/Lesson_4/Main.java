package Lesson_4;

public class Main {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Дмитрий Васин", "тестировщик",
                "Vas@yandex.ru", "89245643234", 50_000, 30);
        persArray[1] = new Person("Алексей Смирнов", "разработчик",
                "Cm@yandex.ru", "84795345234", 100_000, 25);
        persArray[2] = new Person("Михаил Ермаков", "разработчик",
                "Erm@yandex.ru", "89261339758", 120_000, 55);
        persArray[3] = new Person("Анастасия Прилежная", "аналитик",
                "Ivan@yandex.ru", "89243295834", 150_000, 42);
        persArray[4] = new Person("Никита Бобков", "тестировщик",
                "Bob@yandex.ru", "85876439234", 90_000, 33);

    }
}
