package pattern.creational.factorymethod;

/**
 * Created by justin
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
