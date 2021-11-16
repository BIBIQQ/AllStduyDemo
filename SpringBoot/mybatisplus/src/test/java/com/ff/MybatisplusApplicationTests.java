package com.ff;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ff.dao.UserDao;
import com.ff.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisplusApplicationTests {

    @Autowired
    private UserDao userDao;

    /**
     * 搜索所有
     */
    @Test
    void findAll() {
        List<Book> books = userDao.selectList(null);
        System.out.println(books);
    }

    /**
     * 添加新内容
     * 主键自动生成   实体类主键id数据类型需要时Long
     */
    @Test
    void creat(){
        Book book = new Book();
        book.setName("1");
        book.setDescription("好看");
        book.setType("1");
        userDao.insert(book);
    }

    /**
     * 修改
     */
    @Test
    void updataById(){
        Book book = new Book();
        book.setId(2L);
        book.setName("女人花");
        userDao.updateById(book);
    }

    /**
     *通过ID删除
     */
    @Test
    void removeById(){
        userDao.deleteById(4L);
    }

    /**
     * 1.配置分页拦截器
     * 2.传递当前页码和当前页码数为参数
     */
    @Test
    void testGetByPage(){
        IPage page = new Page(1,2);
        userDao.selectPage(page, null);
        System.out.println("当前页= " + page.getCurrent());
        System.out.println("当前页数量  = " + page.getSize());
        System.out.println("总数 =" + page.getTotal());
        System.out.println("搜索到的内容 =" + page.getRecords());
        System.out.println("总页数 =" + page.getPages());
    }

    /**
     * 条件查询
     */
    @Test
    void testGetAll(){
        //条件查询
        //年龄小于4
		/*QueryWrapper qw = new QueryWrapper();
		qw.lt("age",4);
		List<Book> books = userDao.selectList(qw);
        System.out.println("books = " + books);*/

        //年龄小于5  lambda第一种
	/*	QueryWrapper<Book> qw = new QueryWrapper<>();
		qw.lambda().lt(Book::getAge,5);
		List<Book> books = userDao.selectList(qw);
		System.out.println(books);*/

        //年龄小于7大于5      lambda第二种
      /*  LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
//        lqw.lt(Book::getAge,7).gt(Book::getAge,5);
        //年龄小于等于7,大于等于5
//        lqw.le(Book::getAge,7).ge(Book::getAge,5);
        //年龄小于等于5，或者，大于等于7
        lqw.le(Book::getAge,5).or().ge(Book::getAge,7);
        List<Book> books = userDao.selectList(lqw);
        System.out.println("books = " + books);*/

       /* LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.lt(Book::getAge,7).groupBy(Book::getType);
        List<Book> books = userDao.selectList(lqw);
        System.out.println(books);*/

        //动态条件查询   最大到7  最小到 5
		/*Integer max = null;
		Integer mini = null;
		max = 7;
		mini = 5;
		LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
		lqw.lt(max != null,Book::getAge,max);
		lqw.gt(mini != null,Book::getAge,mini);
		List<Book> books = userDao.selectList(lqw);
		System.out.println(books);*/

        //动态投影
        //查询模型中有的内容
		/*LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
		lqw.select(Book::getType,Book::getName);
		List<Book> books = userDao.selectList(lqw);
		System.out.println(books);*/

        //搜索未定义的属性
		/*QueryWrapper<Book> qm = new QueryWrapper<>();
		qm.select("count(*) as book,type");
		qm.groupBy("type");
		List<Map<String, Object>> maps = userDao.selectMaps(qm);
		System.out.println(maps);*/
    }

    @Test
    void testGetSingle() {
        //eq 等于
       /* LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.eq(Book::getAge,7);
        List<Book> books = userDao.selectList(lqw);
        System.out.println(books); */

        //范围
        /*LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.between(Book::getAge,1,4);
        List<Book> books = userDao.selectList(lqw);
        System.out.println(books);*/

        //模糊查询
       /* LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
//        lqw.likeLeft(Book::getType,"销");
        lqw.likeRight(Book::getType,"计");
        List<Book> books = userDao.selectList(lqw);
        System.out.println(books);*/

    }

    /**
     * 批量删除
     */
    @Test
    void deleteByIds(){
        ArrayList<Long> longs = new ArrayList<>();
        longs.add(1460438921631608833L);
        longs.add(1460519703742111746L);
        longs.add(2L);
        userDao.deleteBatchIds(longs);
    }
    /**
     * 批量查询
     */
    @Test
    void GetByIds(){
        ArrayList<Long> longs = new ArrayList<>();
        longs.add(4L);
        longs.add(5L);
        longs.add(6L);
        List<Book> books = userDao.selectBatchIds(longs);
        System.out.println(books);
    }

    /**
     * 版本自增
     * 乐观锁
     */
    @Test
    void testUpdata(){
        Book book = userDao.selectById(13L);
        Integer version = book.getVersion();
        book.setName("女人花");
        book.setVersion(version);
        userDao.updateById(book);
    }
}
