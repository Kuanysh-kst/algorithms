package course.lesson2;

import course.lesson2.entity.Cat;
import course.lesson2.entity.Entity;
import course.lesson2.entity.Man;
import course.lesson2.entity.Robot;
import course.lesson2.obstacle.ToDo;
import course.lesson2.obstacle.Track;
import course.lesson2.obstacle.Wall;

public class Main {


    public static void main(String[] args) {
        Entity[] entities = {new Cat(100, 3), new Man(300, 2), new Robot(4999, 399)};
        ToDo[] toDos = {new Wall(2), new Track(299), new Wall(22)};

        for (Entity entity : entities) {
            for (ToDo toDo : toDos) {
                if (toDo.isDo(entity)) {
                    System.out.println(entity.getClass().getSimpleName() + " смог проити");
                } else {
                    System.out.println(entity.getClass().getSimpleName() + " не смог проити");
                    break;
                }
            }
        }
    }
}
