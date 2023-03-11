package patterns.factory.factories;

import patterns.factory.Developer;
import patterns.factory.developers.JavaDeveloper;
import patterns.factory.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
