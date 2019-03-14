package singleton.lazy;

import java.io.Serializable;

/**
 * 单例类被序列化破坏时，类需要实现Serializable接口
 */
public class SerializableSingleton implements Serializable {

    private SerializableSingleton(){}

    private static final SerializableSingleton ser = new SerializableSingleton();

    public static SerializableSingleton getInstance(){
        return ser;
    }

    //返回类型必须是Object
    //反序列化时，从磁盘中获取，内存重新分配地址，检查构造方法，重新newInstance，再次检查是否存在readResolve方法，存在则直接返回
    private Object readResolve(){
        return ser;
    }
}
