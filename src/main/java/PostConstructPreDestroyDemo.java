import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PostConstructPreDestroyDemo {

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct of " + getClass().getName());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("@PreDestroy of " + getClass().getName());
    }
}
