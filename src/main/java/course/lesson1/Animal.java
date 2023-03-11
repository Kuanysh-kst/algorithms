package course.lesson1;

public class Animal {
    protected int runLimit;
    protected int swimLimit;

    public static int count;

    public Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(getClass().getSimpleName() + " пробежал " + distance + " м");
        } else {
            System.out.println(getClass().getSimpleName() + " не может пробежать " + distance + " м");
        }
    }

    public void swim(int distance) {
        if (distance == 0) {
            System.out.println(getClass().getSimpleName() + " не умеет плавать");
        } else if (distance <= swimLimit) {
            System.out.println(getClass().getSimpleName() + " проплыл " + distance + " м");
        } else {
            System.out.println(getClass().getSimpleName() + " не может проплыть " + distance + " м");
        }
    }
}
