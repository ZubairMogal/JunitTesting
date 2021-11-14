package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivideTesting {

	@Test
	void test() {
		JunitTesting t = new JunitTesting();
		double result=t.divide(5,1);
		assertEquals(5, result);
	}

}
