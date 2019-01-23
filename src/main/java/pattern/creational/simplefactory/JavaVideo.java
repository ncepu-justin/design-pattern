package pattern.creational.simplefactory;

/**
 * Created by justin
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
