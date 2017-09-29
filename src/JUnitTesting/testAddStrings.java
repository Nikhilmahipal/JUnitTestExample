package JUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitTesting test=new jUnitTesting();
		String result=test.addString("hfg","hjh");
		assertEquals("hfghjh",result);
	}

}
