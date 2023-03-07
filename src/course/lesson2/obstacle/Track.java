package course.lesson2.obstacle;

import course.lesson2.entity.Entity;

public class Track implements ToDo {

    private final int length;

    public Track(int length) {
        this.length = length;
    }


    @Override
    public boolean isDo(Entity entity) {
        return entity.runLength() >= this.length;
    }
}
