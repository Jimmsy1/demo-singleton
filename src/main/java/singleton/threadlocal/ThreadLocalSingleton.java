package singleton.threadlocal;

public class ThreadLocalSingleton {

    private ThreadLocalSingleton (){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingleton.get();
    }

    private static ThreadLocal<ThreadLocalSingleton> threadLocalSingleton = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };
}
