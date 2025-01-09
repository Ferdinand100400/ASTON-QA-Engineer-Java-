package Lesson_5_1;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog[] dogs = new Dog[3];
        Cat[] cats = new Cat[4];
        DishFood dishEat = new DishFood(30);

        dogs[0] = new Dog("Bobik");
        dogs[1] = new Dog("Shurik");
        dogs[2] = new Dog("Bars");

        cats[0] = new Cat("Simon");
        cats[1] = new Cat("Maks");
        cats[2] = new Cat("Alisa");
        cats[3] = new Cat("Tigr");

        dogs[0].run(150);
        dogs[0].run(600);
        dogs[1].swim(5);
        dogs[1].swim(100);
        cats[0].run(200);
        cats[0].run(550);
        cats[1].swim(50);
        cats[1].swim(20);

        System.out.println("Кол-во созданных животных: " + animal.getCount());
        System.out.println("Кол-во созданных котов: " + cats[0].getCount());
        System.out.println("Кол-во созданных собак: " + dogs[0].getCount());
        System.out.println(" ");


        dishEat.deleteFood(cats[0].eat(10, dishEat.getCountFood()));
        dishEat.deleteFood(cats[1].eat(5, dishEat.getCountFood()));
        dishEat.deleteFood(cats[2].eat(20, dishEat.getCountFood()));
        dishEat.deleteFood(cats[3].eat(14, dishEat.getCountFood()));
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName() + " " + cats[i].isSatiety());
        }

        System.out.println("Осталось еды: " + dishEat.getCountFood());
        System.out.println(" ");
        dishEat.addFood(19);
        System.out.println("Стало еды: "+ dishEat.getCountFood());
        System.out.println(" ");
        dishEat.deleteFood(cats[2].eat(20, dishEat.getCountFood()));
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName() + " " + cats[i].isSatiety());
        }


    }
}
