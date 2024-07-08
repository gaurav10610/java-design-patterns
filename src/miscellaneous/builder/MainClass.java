package miscellaneous.builder;

/**
 * Builder pattern to compose instances of complex classes
 * </p>
 * Benefits of using the Builder Pattern:
 *  Readability: Construction of objects is more readable, especially with many optional fields.
 *  Flexibility: Allows you to set fields in any order.
 *  Immutability: You can make the Person class immutable by making the fields final and only
 *  setting them in the constructor.
 *
 */
public class MainClass {
    public static void main(String[] args) {

        Person person = Person.builder().name("Gaurav").personId(123).build();
        System.out.printf("person: %s", person);
    }
}
