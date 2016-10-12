package agtsys;

import mockit.Injectable;
import mockit.Tested;
import mockit.Verifications;

import org.agtsys.damain.User;
import org.agtsys.dao.UserMapper;
import org.agtsys.service.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {
@Tested
UserServiceImpl userservice;
@Injectable
UserMapper usermapper;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		userservice.getUserByUser(new User());
		new Verifications() {
			{
				usermapper.getUserByUser(withInstanceOf(User.class));	
			    times=1;
			}		
		};
	}
}
