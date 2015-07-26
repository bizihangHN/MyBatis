package com.mybatis.domain;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String resource="configuration.xml";
		Reader reader=Resources.getResourceAsReader(resource);
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session=factory.openSession();
		try {
//			User user=(User)session.selectOne("selectUser","1");//查询，传入单个数值，返回user
//			System.out.println(user);
//			Map paraMap=new HashMap();
//			paraMap.put("id", "1");
//			paraMap.put("name", "吴正良");
//			System.out.println(paraMap);
//			Map user2=(Map)session.selectOne("selectUserToHashMap",paraMap);//查询，传入HashMap
//			System.out.println(user2);
			User user1=new User();
			user1.setId(4);
			user1.setName("李明");
			user1.setNation("日本");
			session.insert("insertuser",user1);//插入，传入对象
//			User user3=(User)session.selectOne("selectUser","3");
//			System.out.println(user3);
//			Map paraMap1=new HashMap();
//			paraMap1.put("id", "4");
//			paraMap1.put("name", "王五");
//			session.update("updateuser", paraMap1);//修改，传入HashMap
//			session.delete("deleteuser","4");//删除，传入数值
			session.commit();
		} catch (RuntimeException e) {
			// TODO: handle exception
		//	e.printStackTrace();
		}finally{
			session.close();
		}
	}

}
