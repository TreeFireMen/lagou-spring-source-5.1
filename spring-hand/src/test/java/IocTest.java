import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-15
 */
public class IocTest {

	@Test
	public  void testIoc() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Object handBean = applicationContext.getBean("handBean");
		System.out.println(handBean);
	}
}
