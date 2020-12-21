package chapter2;

public class Video4_FunctionAsData {
    protected static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    protected static class DataLoader {
        public final NoArgFunction<Person> loadPerson;

        public DataLoader(Boolean isDevelopment) {
            this.loadPerson = isDevelopment ? this::loadPersonFake : this::loadPersonReal;
        }

        private Person loadPersonReal() {
            System.out.println("Loading Person..");
            return new Person("Real Person", 20);
        }

        private Person loadPersonFake() {
            System.out.println("Returning Fake person object....");
            return new Person("Fake Person", 300);
        }
    }

    public static void main(String[] args) {
        final boolean IS_DEVELOPMENT = false;

        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply());
    }
}
