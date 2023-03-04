package patterns.factory.factories;

import patterns.factory.Developer;
import patterns.factory.DeveloperFactory;
import patterns.factory.developers.CppDeveloper;

public class CppDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
