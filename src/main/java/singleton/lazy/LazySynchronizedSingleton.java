package singleton.lazy;

public class LazySynchronizedSingleton {

    private static LazySynchronizedSingleton lazy = null;

    private LazySynchronizedSingleton(){}

    public synchronized static LazySynchronizedSingleton getInstance(){
        if(lazy == null) {
            lazy = new LazySynchronizedSingleton();
            return lazy;
        }
        return lazy;
    }
}
