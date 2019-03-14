package singleton.lazy;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class LazyTest {

    public static void main(String[] args) {
       /* LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy);*/

     /* try {
           Thread t1 = new Thread(new ExectorThread());
           Thread t2 = new Thread(new ExectorThread());
           t1.start();
           t2.start();
       }catch (Exception e){
           e.printStackTrace();
       }*/

      /*LazyInnerClassSingleton lazyInnerClassSingleton = LazyInnerClassSingleton.getInstance();
      System.out.println(lazyInnerClassSingleton);*/

        /*try {

            LazyInnerClassSingleton lazy = LazyInnerClassSingleton.getInstance();
            System.out.println(lazy);

            Class clazz = LazyInnerClassSingleton.class;
            Constructor c1 = clazz.getDeclaredConstructor();
            c1.setAccessible(true);
            LazyInnerClassSingleton lazyInnerClassSingleton = (LazyInnerClassSingleton) c1.newInstance();
            System.out.println(lazyInnerClassSingleton);

            System.out.println(lazy == lazyInnerClassSingleton);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }*/


        try {

            //序列化时单例类需要实现Serializable接口
            LazyInnerClassSingleton instance1 = null;

            LazyInnerClassSingleton instance2 = LazyInnerClassSingleton.getInstance();
            //instance2.setData(new
            // Object());

            FileOutputStream fos = new FileOutputStream("LazyInnerClassSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("LazyInnerClassSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance1 = (LazyInnerClassSingleton) ois.readObject();
            ois.close();

            System.out.println(instance1);
            System.out.println(instance2);

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
