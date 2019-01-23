package pattern.creational.singleton;

/**
 * 枚举单例：应对序列化、反序列化、在类加载是加载，通过静态块的方式实例化
 * Created by justin
 */
public enum EnumInstance {
    INSTANCE{
        protected  void printTest(){
            System.out.println("Geely Print Test");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}
