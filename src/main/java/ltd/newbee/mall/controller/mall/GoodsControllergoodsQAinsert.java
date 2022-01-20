package ltd.newbee.mall.controller.mall;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

//import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;


import ltd.newbee.mall.entity.GoodsQA;
import ltd.newbee.mall.entity.GoodsQAins;
import ltd.newbee.mall.service.NewBeeMallGoodsService;


@SpringBootTest
public class GoodsControllergoodsQAinsert {
	//在controller里导入service
	@Resource
	NewBeeMallGoodsService newBeeMallGoodsService;
	@Test
	public void testGoodsQA() {
		GoodsQAins e = new GoodsQAins();
		
		e.setGoods_id(10005);
		e.setQa_id(20005);
		e.setQuestion("question5");
		e.setQuestion_date(220217);
		e.setAnswer("answer5");
		e.setAnswer_date(220118);
		
		
		int cnt = newBeeMallGoodsService.QAinsert(e);

		System.out.println(cnt);
	}

   
}
