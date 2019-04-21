import com.journaldev.spring.pojo.User;
import com.journaldev.spring.service.ClientService;
import com.journaldev.spring.service.IUser;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by Juntao on 2016/9/29.
 */
public class Consumer2 {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-extend-config/dubbo-consumer.xml"});
        context.start();

        IUser iUser = (IUser)context.getBean("iUser"); // ��ȡԶ�̷������
//        for(int i=0;i<1;i++)
//        {
//        	Thread.sleep(100);
            try {
				User u = new User();
				u.setAddress("aaa");
				u.setId(311);
				u.setName("n3");
				iUser.addUser(u);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println(iUser.getUserById(1));
//        }
        

    }
}
