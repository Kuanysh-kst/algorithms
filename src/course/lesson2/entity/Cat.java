package course.lesson2.entity;

public class Cat implements Entity {

    private final int runLength;
    private final int jumpHeight;

    public Cat(int runLength, int jumHeigth) {
        this.runLength = runLength;
        this.jumpHeight = jumHeigth;
    }

    @Override
    public int runLength() {
        return runLength;
    }

    @Override
    public int jumpHeight() {
        return jumpHeight;
    }
}
