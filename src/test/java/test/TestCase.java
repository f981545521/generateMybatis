package test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import entity.Employee;

public class TestCase {
	
	@Test
	public void test1(){
		String config="SqlMapConfig.xml";
		//创建SqlSessionFactoryBuilder对象.
		SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
		//创建SqlSessionFactory对象
		SqlSessionFactory ssf = ssfb.build(TestCase.class.getClassLoader().getResourceAsStream(config));
		//创建session对象
		SqlSession session = ssf.openSession();
		Employee emp = new Employee();
		emp.setName("刘备");
		emp.setAge(35);
		session.insert("test.save", emp);
		//添加,修改,删除都需要提交事务.
		session.commit();
		//关闭session
		session.close();
	}

}
