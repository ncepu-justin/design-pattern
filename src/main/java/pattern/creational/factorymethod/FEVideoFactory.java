package pattern.creational.factorymethod;

/**
 * Created by justin
 */
public class FEVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
