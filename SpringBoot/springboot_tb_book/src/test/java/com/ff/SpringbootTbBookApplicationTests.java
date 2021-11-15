package com.ff;

import com.ff.domain.Book;
import com.ff.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootTbBookApplicationTests {

	@Autowired
	private BookService bookService;

	@Test
	void contextLoads() {
		List<Book> all = bookService.getAll();
		System.out.println(all);
	}

}
