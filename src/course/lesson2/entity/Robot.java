package course.lesson2.entity;

public class Robot implements Entity {

    private final int runLength;
    private final int jumpHeight;

    public Robot(int runLength, int jumpHeight) {
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
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
