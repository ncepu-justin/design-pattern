package pattern.structural.proxy.db;

/**
 *spring 分库
 * Created by justin
 */
public class DataSourceContextHolder {

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    public static void setDBType(String dbType){

        CONTEXT_HOLDER.set(dbType);
    }
    public static String getDBType(){

        return (String)CONTEXT_HOLDER.get();
    }
    public static void clearDBType(){

        CONTEXT_HOLDER.remove();
    }


}
