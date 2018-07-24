package com.transce.wcl.trade;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.transce.wcl.trade.entity.RpTradePaymentOrder;
import com.transce.wcl.trade.mapper.RpTradePaymentOrderMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TradeServiceApplication.class)
public class RpTransactionTradeTest {
	
	     @Autowired
	     private RpTradePaymentOrderMapper paymentOrderMapper;
	     
	     @Test
	     public void findList() throws Exception {
	         List<RpTradePaymentOrder> tcontents = paymentOrderMapper.findList(new RpTradePaymentOrder());
	         System.out.println("tcontents ="+tcontents);
	     }
}
