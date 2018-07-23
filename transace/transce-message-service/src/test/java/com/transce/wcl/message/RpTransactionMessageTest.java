package com.transce.wcl.message;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.transce.wcl.message.StreamSenderApplication;
import com.transce.wcl.message.entity.RpTransactionMessage;
import com.transce.wcl.message.mapper.RpTransactionMessageMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StreamSenderApplication.class)
public class RpTransactionMessageTest {
	
	     @Autowired
	     private RpTransactionMessageMapper pTransactionMessageMapper;
	     
	     @Test
	     public void findList() throws Exception {
	         List<RpTransactionMessage> tcontents = pTransactionMessageMapper.findList(new RpTransactionMessage());
	     }
}
