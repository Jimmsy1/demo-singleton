package singleton.lazy;

import java.io.Serializable;

public class LazyInnerClassSingleton implements Serializable {

    private LazyInnerClassSingleton(){
        if(LazyHelp.LAZY_INNER_CLASS_SINGLETON != null){
            throw new RuntimeException("不允许通过反射机制创建单例");
        }
    }

    public static LazyInnerClassSingleton getInstance(){
        return LazyHelp.LAZY_INNER_CLASS_SINGLETON;
    }

    /**
     * 静态内部类
     */
    private static class LazyHelp{
        private static final LazyInnerClassSingleton LAZY_INNER_CLASS_SINGLETON = new LazyInnerClassSingleton();
    }


    private Object readResolve(){
        return LazyHelp.LAZY_INNER_CLASS_SINGLETON;
    }
}
