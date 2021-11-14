package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class countAlpha {

	@Test
public	void test() {
		JunitTesting t=new JunitTesting();
		int result=t.count("zubairahmed");
		assertEquals(2,result);
		
	}

}
