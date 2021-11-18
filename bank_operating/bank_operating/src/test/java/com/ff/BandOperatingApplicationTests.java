package com.ff;

import com.ff.service.BankService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BandOperatingApplicationTests {
	@Autowired
	private BankService bankService;
	@Test
	void cutPay() {
		boolean lisi = bankService.cuyPay("lisi", 50);
		System.out.println(lisi);

	}

}
