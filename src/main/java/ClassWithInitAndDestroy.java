public class ClassWithInitAndDestroy {

    public void init() {
        System.out.println("init of " + getClass().getName());
    }

    public void destroy() {
        System.out.println("destroy of " + getClass().getName());
    }
}
