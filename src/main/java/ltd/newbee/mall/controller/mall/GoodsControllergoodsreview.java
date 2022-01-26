package ltd.newbee.mall.controller.mall;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
		paramap1.put("start", "next");//first：前3条 next：第4条到最后一条
		paramap1.put("goodsId", 10001);//选择要看评论的商品的goodsid
		ArrayList<GoodsReview> listGoodsreview=newBeeMallGoodsService.selectByGoodsreview(paramap1);
		
		long goodsId = 20001;//选择看哪个商品
		double rateAvg = newBeeMallGoodsService.selectByGoodsRateAvg(goodsId);//平均评价是
		long GreatRateCount = newBeeMallGoodsService.selectByGoodsGreatRateCount(goodsId);//总评论人数是
		long[] RateCount = newBeeMallGoodsService.selectByGoodsRateCount(goodsId);//打54321星的人数分别是
        String RateCountString = Arrays.toString(RateCount);//对RateCount数组进行toString转换
        
        
	/*	System.out.println(listGoodsreview.size());
		System.out.println(listGoodsreview);  
		System.out.println("该当商品"+goodsId+"的平均评价是  "+rateAvg+
				           ",   总评论人数是"+GreatRateCount+
				           ",   打54321星的人数分别是"+RateCountString);         */
	
		
		
		
		//在4星评价中准备了reviewType=1按星级输出评论时的测试数据
		//测试：共同类型 总评论人数GreatRateCount  平均评价rateAvg    打54321星的人数RateCountString
		assertEquals(15, GreatRateCount);
		assertTrue(rateAvg-3.8<0.00001);
		long[]testlist1 = {4, 7, 2, 1, 1};
		String testlist1string = Arrays.toString(testlist1);
		assertEquals(testlist1string,RateCountString);  
		
		
		//reviewType=1 start='first'
        assertEquals(3, listGoodsreview.size());  
		
		//reviewType=1 start='next'
		assertEquals(4, listGoodsreview.size());
	//	assertTrue(listGoodsreview == "
	//	再建一个select方法创建测试arraylist[GoodsReview [reviewerId=10012, goodsId=20001, review=review111, reviewDate=201010, count=0, rate=4, reviewImg=null], GoodsReview [reviewerId=10023, goodsId=20001, review=review112, reviewDate=201010, count=0, rate=4, reviewImg=null], GoodsReview [reviewerId=10025, goodsId=20001, review=review113, reviewDate=201010, count=0, rate=4, reviewImg=null], GoodsReview [reviewerId=10011, goodsId=20001, review=review141, reviewDate=201225, count=0, rate=4, reviewImg=null]]");

		//reviewType=0 start='first'
		assertEquals(3, listGoodsreview.size());
		
		//reviewType=0 start='next'
		assertEquals(12, listGoodsreview.size());	
		
	}   
}
