import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OldAlternativeMain {

    public static void main(String... args) {
        try (final var context = new ClassPathXmlApplicationContext("my-config.xml")) {
            context.getBean(ClassWithInitAndDestroy.class);
            System.out.println("in the main method");
        }
    }
}
