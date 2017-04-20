package service.userService;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.TbActivityattendance;
import pojo.TbEmployee;
import pojo.TbEmployeenotify;
import service.companyAdminService.CompanyAdminService;

import static org.junit.Assert.*;

/**
 * Created by user on 2017/4/20.
 */
public class UserServiceTest {

    private UserService userService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-Dao.xml","spring/applicationContext-Service.xml","spring/applicationContext-transaction.xml"});
        userService= (UserService) applicationContext.getBean("userService");
    }


    @Test
    public void testQueryActivities() throws Exception {
        userService.queryActivities("1");
    }

    @Test
    public void testQueryNotifies() throws Exception {
        userService.queryNotifies("1");
    }

    @Test
    public void testQueryMemos() throws Exception {
        userService.queryMemos("1");
    }

    @Test
    public void testQueryEmployee() throws Exception {
        TbEmployee employee=new TbEmployee();
        employee.setEmployeeid("1");
        employee.setPassword("123");
        userService.queryEmployee(employee);
    }

    @Test
    public void testUpdateNotifyStatus() throws Exception {
        TbEmployeenotify employeenotify=new TbEmployeenotify();
        employeenotify.setEmployeeid("1");
        employeenotify.setNotifyid("201704191009151");
        userService.updateNotifyStatus(employeenotify);
    }

    @Test
    public void testUpdateActivityStatus() throws Exception {
        TbActivityattendance activityattendance=new TbActivityattendance();
        activityattendance.setEmployeeid("1");
        activityattendance.setActivityid("1");
        userService.updateActivityStatus(activityattendance);
    }
}