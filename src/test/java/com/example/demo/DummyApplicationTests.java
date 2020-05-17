package com.example.demo;

import com.example.demo.Service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class DummyApplicationTests {

	@Autowired
	UserServiceImpl userServiceImpl;

	@Test
	void contextLoads() {
	}


	@Test
	public void addUse(String name,String surname){
	}

	@Test
	public void removeUser(long Id){

	}

	@Test
	public void getUser(long Id){

	}


	@Test
	void addUser() {
		String username = userServiceImpl.addUser(1001,"Kingdom","Kings");
		//	assertThat(username).isLocalTo("");
	}

	@Test
	void cacheTest()
	{
		String cache = userServiceImpl.cacheUser("Hello");
		String cache2 = userServiceImpl.cacheUser("Hello1");
		String cache3 = userServiceImpl.cacheUser("Hello2");
		String cache4 = userServiceImpl.cacheUser("Hello3");

		System.out.println(cache + " " +cache2 + " " + cache3 + " " + cache4);
	}

	@Autowired
	private TestRestTemplate template;

	ResponseEntity<String> response = template.withBasicAuth(?).getForEntity(?);
}
