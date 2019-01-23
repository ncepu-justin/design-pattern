package pattern.creational.abstractfactory;


/**
 * 抽象工厂 eg:{@link java.sql.Connection} :Statement createStatement(),PreparedStatement prepareStatement
 * Created by justin
 */
public interface CourseFactory {

    Video getVideo();
    Article getArticle();

}
