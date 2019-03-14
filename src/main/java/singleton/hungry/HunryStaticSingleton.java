package singleton.hungry;

public class HunryStaticSingleton {

    private HunryStaticSingleton (){}

    private static final HunryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HunryStaticSingleton();
    }

    public HunryStaticSingleton getInstance(){
        return hungrySingleton;
    }

}
