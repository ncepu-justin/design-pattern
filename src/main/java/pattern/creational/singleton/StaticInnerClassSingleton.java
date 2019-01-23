package pattern.creational.singleton;

/**
 * 静态内部类
 * Created by justin
 */
public class StaticInnerClassSingleton {

    private static class InnerClass{

        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){

        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton(){
        if(InnerClass.staticInnerClassSingleton != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }


}
