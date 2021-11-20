package com.ff;

import com.ff.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CutknifeApplicationTests {

	@Autowired
	private IUserService iUserService;

	@Test
	void cutknife() {

		iUserService.addUserCutknife(222,4);
	}

}
