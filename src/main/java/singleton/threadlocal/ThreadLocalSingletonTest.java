package singleton.threadlocal;

import singleton.lazy.ExectorThread;

public class ThreadLocalSingletonTest {

    public static void main(String[] args) {

        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        try
        {
            Thread t1 = new Thread(new ExectorThread());
            Thread t2 = new Thread(new ExectorThread());

            t1.start();
            t2.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
