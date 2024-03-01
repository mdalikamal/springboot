package com.SpringJdbc.connecion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.SpringJdbc.dao.StudentDao;
import com.SpringJdbc.dao.StudentDaoImple;
import com.SpringJdbc.entity.Student;

public class Driver 
{
    public static void main( String[] args )
    {
    	//spring jdbc template
      
     System.out.println("spring jdbc template");
     ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringJdbc/connecion/config.xml");
       StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
      
            Student stu=new Student();
            stu.setId(2);
            stu.setName("raman");
            stu.setEmail("dhuniya goa");
            int res=studentDao.Update(stu);
            System.out.println("=================================================");
    }
}
