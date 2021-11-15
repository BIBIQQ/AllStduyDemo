package com.ff;

import com.ff.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02ApplicationTests {
	@Autowired
	private BookService bookService;

	@Test
	void contextLoads() {
		bookService.save();
	}

}
