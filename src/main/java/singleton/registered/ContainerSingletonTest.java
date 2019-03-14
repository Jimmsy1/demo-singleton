package singleton.registered;

public class ContainerSingletonTest {

    public static void main(String[] args) {
        ContainerSingleton s = (ContainerSingleton)ContainerSingleton.getBean("singleton.registered.ContainerSingleton" );
        System.out.println(s);
    }
}
