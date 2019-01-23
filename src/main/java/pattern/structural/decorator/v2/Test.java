package pattern.structural.decorator.v2;

/**
 * 装饰者模式：在不改变原有对象的基础上，将功能添加到对象上
 * 把被装饰的类作为装饰类的构造函数的参数对象传入 eg: {@link java.io.BufferedReader}{@link java.io.BufferedInputStream}
 * Created by justin
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();

        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc()+" 销售价格:"+aBattercake.cost());

    }
}
