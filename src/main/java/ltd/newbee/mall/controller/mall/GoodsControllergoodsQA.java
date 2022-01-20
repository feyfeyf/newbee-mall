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
import ltd.newbee.mall.service.NewBeeMallGoodsService;


@SpringBootTest
public class GoodsControllergoodsQA {
	//在controller里导入service
	@Resource
	NewBeeMallGoodsService newBeeMallGoodsService;
	@Test
	public void testGoodsQA() {
		//ArrayList<GoodsQA> list = newBeeMallGoodsService.selectByGoodsqa("like",1);
		ArrayList<GoodsQA> listGoods=newBeeMallGoodsService.countComment("2","3");
		
		System.out.println(listGoods);
		//System.out.println(list.get(1));

		/*
		 * if(!CollectionUtils.isEmpty(list)) { assertEquals(10001,list.get(0)); }
		 */
		

		
	}

   
}
