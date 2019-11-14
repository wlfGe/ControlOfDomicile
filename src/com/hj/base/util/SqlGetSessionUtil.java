package com.hj.base.util;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/*
 * 返回一个SqlSession对象的工具类
 */
public class SqlGetSessionUtil {
	public static SqlSessionFactory sqlSessionFactory = null;
    public static SqlSession getSqlSession() {
		InputStream inputStream = null;
		try {
			// 加载mybatis的配置文件（它也加载关联的映射文件）
			inputStream = Resources.getResourceAsStream("jdbc/jdbc-conf.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//创建一个SESSION工厂
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//创建一个SESSION对象
		SqlSession session = sessionFactory.openSession();
		return session;
	}
}
