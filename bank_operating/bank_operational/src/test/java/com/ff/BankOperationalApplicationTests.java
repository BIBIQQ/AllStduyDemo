package com.ff;

import com.ff.dao.BankDao;
import com.ff.service.BankService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BankOperationalApplicationTests {

	@Autowired
	private BankService bankService;

	/**
	 * 扣款
	 */
	@Test
	void cutPay() {
		boolean lisi = bankService.cuyPay("lisi", 50);
		System.out.println(lisi);
	}

}
