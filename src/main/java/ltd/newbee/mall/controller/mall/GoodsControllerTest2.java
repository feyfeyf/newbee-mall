package ltd.newbee.mall.controller.mall;

import java.util.ArrayList;
import java.util.List;

//import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ltd.newbee.mall.entity.GoodsImage;

import ltd.newbee.mall.service.NewBeeMallGoodsService;


@SpringBootTest
public class GoodsControllerTest2 {
	//在controller里导入service
	@Resource
	NewBeeMallGoodsService newBeeMallGoodsService;
	@Test
	public void testGoodsInfo() {
		List<GoodsImage> list = newBeeMallGoodsService.selectByGoodsImage();
		System.out.println(list.size());
		
		if(list.size()>0) { System.out.println("success"); 
		} else {
		System.out.println("fail"); }
		 
		
		
		
		/*
		 * GoodsImage info = newBeeMallGoodsService.selectByGoodsImage(31415926l);
		 * System.out.println(info.getImageUrl());
		 */
		
	}

   
}
