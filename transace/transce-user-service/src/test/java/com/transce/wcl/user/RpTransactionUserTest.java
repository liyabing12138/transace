package com.transce.wcl.user;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.transce.wcl.user.entity.RpPayProduct;
import com.transce.wcl.user.mapper.RpPayProductMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserServiceApplication.class)
public class RpTransactionUserTest {
	
	     @Autowired
	     private RpPayProductMapper rpPayProductMapper;
	     
	     @Test
	     public void findList() throws Exception {
	         List<RpPayProduct> tcontents = rpPayProductMapper.findList(new RpPayProduct());
	         System.out.println("tcontents ="+tcontents);
	     }
}
