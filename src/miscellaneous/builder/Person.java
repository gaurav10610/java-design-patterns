package miscellaneous.builder;

public class Person {
    private String name;
    private Integer personId;

    private Person(String name, Integer personId) {
        this.name = name;
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + personId + "]";
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String name;
        private Integer personId;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder personId(Integer personId) {
            this.personId = personId;
            return this;
        }

        public Person build() {
            return new Person(name, personId);
        }
    }
}
