package pattern.creational.factorymethod;

/**
 * Created by justin
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
