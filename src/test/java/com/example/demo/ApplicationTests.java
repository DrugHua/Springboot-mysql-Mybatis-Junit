package com.example.demo;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	UserService us;


	@org.junit.Test
	public void test(){
		List<User> users = us.selectAll();
		for (User user1 : users) {
			System.out.println(user1);
		}
	}

	@Test
	public void contextLoads() {
		User user = us.selectUser("car");
		System.out.println(user);
	}


	@org.junit.Test
	public void test2(){
		User user = us.selectUserById(1);
		System.out.println(user);
	}

}
