package lab3;

/**
 *
 * @author alexa
 */
public class PersonTest {

    public static void main(String[] args) {
        PersonTwo quote = new PersonTwo("The way to get started is to quit talking and being doing.", "Walt Disney");
        System.out.println(quote);
        System.out.println();//I need blank line between quotations
        PersonTwo quote2 = new PersonTwo("Just a text", "John Doe");
        System.out.println(quote2);
    }
}
