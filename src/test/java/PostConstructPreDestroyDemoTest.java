import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(PostConstructPreDestroyDemo.class)
public class PostConstructPreDestroyDemoTest {

    @Autowired
    private PostConstructPreDestroyDemo instance;

    @Test
    public void testNotNull() {
        System.out.println("starting testNotNull()");

        Assertions.assertNotNull(instance);

        System.out.println("finishing testNotNull()");
    }

}
