package singleton.lazy;

import singleton.registered.EnumSingleton;
import singleton.threadlocal.ThreadLocalSingleton;

public class ExectorThread implements Runnable {


    public void run() {
        //LazySingleton lazySingleton = LazySingleton.getInstance();
        //LazySynchronizedSingleton lazySingleton = LazySynchronizedSingleton.getInstance();
        //LazyDoubleCheckSingleton lazySingleton = LazyDoubleCheckSingleton.getInstance();
        //LazyInnerClassSingleton lazySingleton = LazyInnerClassSingleton.getInstance();

        //EnumSingleton singleton = EnumSingleton.getInstance();
        //singleton.setDate(LazySingleton.getInstance());

        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        ThreadLocalSingleton singleton1 = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread() + "====" + singleton);
        System.out.println(Thread.currentThread() + "====" + singleton1);

    }
}
