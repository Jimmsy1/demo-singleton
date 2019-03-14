package singleton.registered;

import singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

public class EnumSingletonTest {

    public static void main(String[] args) {

        /*EnumSingleton singleton = EnumSingleton.getInstance();
        singleton.setDate(LazyInnerClassSingleton.getInstance());

        EnumSingleton singleton1 = EnumSingleton.getInstance();
        singleton1.setDate(LazyInnerClassSingleton.getInstance());

        System.out.println(singleton.getDate());
        System.out.println(singleton1.getDate());
        System.out.println(singleton.getDate() == singleton1.getDate());*/

        try {
            Class clazz = EnumSingleton.class;
            //反射构建枚举时，需要传参
            Constructor c1 = clazz.getDeclaredConstructor(String.class , int.class);
            c1.setAccessible(true);
            //反射构建枚举构造方法时，需要传参
            EnumSingleton s = (EnumSingleton) c1.newInstance("1",11);
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
