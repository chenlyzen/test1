import com.journaldev.spring.service.ClientService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by Juntao on 2016/9/29.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-extend-config/dubbo-consumer.xml"});
        context.start();

        ClientService demoService = (ClientService)context.getBean("demoService"); // ��ȡԶ�̷������
        for(int i=0;i<1000;i++)
        {
        	Thread.sleep(100);
        	String hello = demoService.sayHello("world"); // ִ��Զ�̷���

            System.out.println( i+hello ); // ��ʾ���ý��
            System.out.println( i+demoService.like("mini") ); // ��ʾ���ý��
        }
        

    }
}
