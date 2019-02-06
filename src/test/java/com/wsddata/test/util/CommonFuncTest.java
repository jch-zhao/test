package com.wsddata.test.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommonFuncTest {
	
	@Test
	public void test() {
		CommonFunc cf= new CommonFunc();
		
		int res = cf.add(1, 2);
		if(res==3){
			assertTrue(true);
		}else{
			fail("期望值为3");
		}
	}

}
