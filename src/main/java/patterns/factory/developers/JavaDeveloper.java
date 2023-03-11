package patterns.factory.developers;

import patterns.factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");

    }
}
