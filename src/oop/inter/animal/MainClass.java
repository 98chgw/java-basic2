package oop.inter.animal;

public class MainClass {
    public static void main(String[] args) {
        Duck duck = new Duck();
        BullDog bullDog = new BullDog();
        Violent shark = new Shark();
        BadAnimal bear = new Bear();


        ((Animal)bear).feed("과일");

        Animal[] animals = {duck, bullDog, (Animal) shark, (Animal) bear};

    }
}
