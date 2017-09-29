package JUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitTesting test=new jUnitTesting();
		int result=test.addNumbers(100,12);
		assertEquals(112,result);
;
	}

}
