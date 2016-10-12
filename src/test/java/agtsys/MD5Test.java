package agtsys;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.agtsys.util.DefaultImageCaptchca;
import org.agtsys.util.DefaultPatchcaService;
import org.agtsys.util.MD5;
import org.junit.Before;
import org.junit.Test;

public class MD5Test {
   private DefaultImageCaptchca dic;
   
	@Before
	public void setUp() throws Exception {
		dic=new DefaultImageCaptchca();
		DefaultPatchcaService dps=new DefaultPatchcaService();
		dps.setWidth(60);
		dps.setHeight(30);
		dic.setDps(dps);
	}

	@Test
	public void test() {
		OutputStream os;
		String s=null;
		try {
			os=new FileOutputStream(new File("captchca.png"));
			s = dic.generate(os);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
		
		
//		String s=MD5.GetMD5Code("123");
//		assertEquals("202cb962ac59075b964b07152d234b70", s);
	}

}
