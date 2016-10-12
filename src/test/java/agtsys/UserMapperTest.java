package agtsys;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.agtsys.damain.User;
import org.agtsys.dao.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMapperTest {
	@Resource
private UserMapper usermapper;
	@Before
	public void setUp() throws Exception {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
	    usermapper = (UserMapper) ac.getBean("userMapper");
	}

	@Test
	public void test() {
		User  user=new User();
		user.setUsercode("admin");
		user.setUserpassword("123456");
		Assert.assertNotNull(usermapper.getUserByUser(user));
		
	}

}
