package pattern.creational.abstractfactory;

/**
 * Created by justin
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
