package ltd.newbee.mall.controller.mall;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ltd.newbee.mall.entity.GoodsQAins;
import ltd.newbee.mall.entity.GoodsReview;
import ltd.newbee.mall.entity.GoodsReviewIns;
import ltd.newbee.mall.service.NewBeeMallGoodsService;
import ltd.newbee.mall.util.SearchPageReviewParams;


@SpringBootTest
public class GoodsControllergoodsreviewinsert {
	//在controller里导入service
	@Resource
	NewBeeMallGoodsService newBeeMallGoodsService;
	@Test
	public void testGoodsQA() {

		  GoodsReviewIns e = new GoodsReviewIns(); 
		  e.setReviewer_id(10011);
		  e.setGoods_id(20001); 
		  e.setReview("Review10"); 
		  e.setReview_date(220217);
		  e.setRate(5);
		  e.setReview_img("/goods-img/f6832ed7-cb01-48ab-987f-cd437b21be80.jpg"); 
		  int cnt = newBeeMallGoodsService.reviewinsert(e); 
		  
		  System.out.println(cnt);
		 
		 

		
	}   
}
