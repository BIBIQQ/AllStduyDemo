package com.ff;

import com.ff.dao.BookDao;
import com.ff.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot03ApplicationTests {

	@Autowired
	private BookDao bookDao;

	@Test
	void contextLoads() {
		List<Book> all = bookDao.getAll();
		System.out.println(all);
	}

}
