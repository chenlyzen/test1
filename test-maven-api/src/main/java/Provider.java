import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by Juntao on 2016/9/29.
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-extend-config/dubbo-provider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
}
