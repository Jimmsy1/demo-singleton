package singleton.registered;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;

import java.util.HashMap;
import java.util.Map;

public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String , Object> map = new HashMap<String, Object>();

    public static Object getBean(String className){

        synchronized (map) {
            try {
                if (!map.containsKey(className)) {    //检查map中key
                    Object obj = Class.forName(className).newInstance();//反射构建对象
                    map.put(className, obj);
                    return obj;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            return map.get(className);
        }

    }
}
