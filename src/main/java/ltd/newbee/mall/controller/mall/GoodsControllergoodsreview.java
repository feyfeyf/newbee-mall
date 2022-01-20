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
public class GoodsControllergoodsreview {
	//在controller里导入service
	@Resource
	NewBeeMallGoodsService newBeeMallGoodsService;
	@Test
	public void testGoodsQA() {
		Map<String, Object> paramap1 = new SearchPageReviewParams();
		paramap1.put("reviewType", 1);//判断0：默认输出全部星级评论，1：按星级输出评论
		paramap1.put("reviewRate", 4);//选择星级评价1~5
		paramap1.put("start", "first");//first：前3条 next：第4条到最后一条
		paramap1.put("goodsId", 20001);//选择要看评论的商品的goodsid
		ArrayList<GoodsReview> listGoodsreview=newBeeMallGoodsService.selectByGoodsreview(paramap1);
		
		long goodsId = 20001;//选择看哪个商品
		double rateAvg = newBeeMallGoodsService.selectByGoodsRateAvg(goodsId);//平均评价是
		long GreatRateCount = newBeeMallGoodsService.selectByGoodsGreatRateCount(goodsId);//总评论人数是
		long[] RateCount = newBeeMallGoodsService.selectByGoodsRateCount(goodsId);//打54321星的人数分别是
        String RateCountString = Arrays.toString(RateCount);//对RateCount数组进行toString转换

        GoodsReviewIns e = new GoodsReviewIns();
		e.setReviewerId(10010);
		e.setGoodsId(20001);
		e.setReview("Review10");
		e.setReviewDate(220217);
		e.setRate(5);
		e.setReviewImg("/goods-img/f6832ed7-cb01-48ab-987f-cd437b21be80.jpg");
		int cnt = newBeeMallGoodsService.reviewinsert(e);
		System.out.println(cnt);
        
        
        
        
        
		System.out.println(listGoodsreview.size());
		System.out.println(listGoodsreview);  
		System.out.println("该当商品"+goodsId+"的平均评价是  "+rateAvg+
				           ",   总评论人数是"+GreatRateCount+
				           ",   打54321星的人数分别是"+RateCountString);  
		

		
	}   
}
