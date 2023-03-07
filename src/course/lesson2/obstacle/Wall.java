package course.lesson2.obstacle;

import course.lesson2.entity.Entity;

public class Wall implements ToDo {

    private final int length;

    public Wall(int length) {
        this.length = length;
    }

    @Override
    public boolean isDo(Entity entity) {
        return entity.jumpHeight() >= this.length;
    }
}
