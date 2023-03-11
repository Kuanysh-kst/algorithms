package patterns.factory.developers;

import patterns.factory.Developer;

public class CppDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("C++ developer writes Java code...");
    }
}
