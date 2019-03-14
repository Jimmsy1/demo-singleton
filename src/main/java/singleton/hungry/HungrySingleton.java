package singleton.hungry;

public class HungrySingleton {

    private HungrySingleton(){}

    //加final关键字，防止被反射破坏
    private static final HungrySingleton hugry = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return hugry;
    }

}
