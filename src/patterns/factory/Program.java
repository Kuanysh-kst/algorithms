package patterns.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("c++");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equals("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equals("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + "not correct specialty");
        }
    }
}
