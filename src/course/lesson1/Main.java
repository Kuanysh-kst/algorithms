package course.lesson1;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Tiger(), new Cat(), new Dog(), new Tiger()};
        for (Animal animal : animals) {

            animal.run(150);
            animal.swim(5);
        }
        System.out.println("Всего создано: " + Animal.count + " животных, из них:");
        System.out.println(" - " + Cat.count + " котов");
        System.out.println(" - " + Tiger.count + " тигров");
        System.out.println(" - " + Dog.count + " собак");
    }
}


