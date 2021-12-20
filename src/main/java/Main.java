import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String... args) {
        try (final var context = new AnnotationConfigApplicationContext(ClassWithPostConstructAndPreDestroy.class)) {
            System.out.println("in the main method");
        }
    }

}
