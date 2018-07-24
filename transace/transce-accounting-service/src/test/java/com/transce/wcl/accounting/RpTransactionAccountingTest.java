package com.transce.wcl.accounting;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.transce.wcl.accounting.entity.RpAccountingVoucher;
import com.transce.wcl.accounting.mapper.RpAccountingVoucherMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AccountingServiceApplication.class)
public class RpTransactionAccountingTest {
	
	     @Autowired
	     private RpAccountingVoucherMapper voucherMapper;
	     
	     @Test
	     public void findList() throws Exception {
	         List<RpAccountingVoucher> tcontents = voucherMapper.findList(new RpAccountingVoucher());
	         System.out.println("tcontents ="+tcontents);
	     }
}
