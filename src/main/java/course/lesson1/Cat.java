package course.lesson1;

public class Cat extends Animal {
    public static int count;

    public Cat() {
        super(200, 0);
        count++;
    }
}
