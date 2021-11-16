package com.ff;

import com.ff.dao.UserkDao;
import com.ff.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringMybatisplusApplicationTests {

	@Autowired
	private UserkDao bookDao;

	@Test
	void contextLoads() {
		List<Book> books = bookDao.selectList(null);
		System.out.println(books);
	}

}
