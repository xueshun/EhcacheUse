package com.xue.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xue.ehcache.entity.TbUse;
import com.xue.ehcache.service.TbUseService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml","classpath:spring/spring-web.xml" })
public class ServiceTest {

	@Autowired
	private TbUseService useService;
	
	@Test
	public void getUseById() throws InterruptedException{
		TbUse useById = useService.getUseById(1);
		System.out.println(useById);
		
		Thread.sleep(1000);
		useService.getUseById(1);
	}
}
