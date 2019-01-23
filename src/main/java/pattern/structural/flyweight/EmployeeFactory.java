package pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式 运用共享技术有效支持大量细粒度对象 eg:容器单例
 * 减少对象的创建，降低系统内存中对象的数量，降低系统的内存，提高效率
 * Created by justin
 */
public class EmployeeFactory {
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<String,Employee>();

    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        if(manager == null){

            manager = new Manager(department);
            System.out.print("创建部门经理:"+department);
            String reportContent = department+"部门汇报:此次报告的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告:"+reportContent);
            EMPLOYEE_MAP.put(department,manager);

        }
        return manager;
    }

}
