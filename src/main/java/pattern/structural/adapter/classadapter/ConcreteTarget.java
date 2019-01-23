package pattern.structural.adapter.classadapter;

/**
 * Created by justin
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {

        System.out.println("concreteTarget目标方法"
        );
    }

}
