package ltd.newbee.mall.controller.mall;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
public class GoodsControllergoodsreviewTest {
	//在controller里导入service
	@Resource
	NewBeeMallGoodsService newBeeMallGoodsService;
	@Test
	public void testGoodsQA() {
		/*
		GoodsReview e1 = new GoodsReview();
		e1.setReviewerId(0);
		e1.setGoodsId(0);
		e1.setReview("");
		e1.setReviewDate(0);
		e1.setCount(0);
		e1.setRate(0);
		e3.setReviewImg("");
		expectedList1.add(e1);
		*/
		//输入四种分支对应期望ArrayList的值，以entity为单位输出


		//expectedList1******************************************************************
		ArrayList<GoodsReview> expectedList1= new ArrayList<GoodsReview>();
		GoodsReview e3 = new GoodsReview();
		e3.setReviewerId(10003);
		e3.setGoodsId(20001);
		e3.setReview("review4");
		e3.setReviewDate(201222);
		e3.setCount(6);
		e3.setRate(4);
		e3.setReviewImg("/goods-img/ef75879d-3d3e-4bab-888d-1e4036491e11.jpg");
		expectedList1.add(e3);
		
		GoodsReview e2 = new GoodsReview();
		e2.setReviewerId(10006);
		e2.setGoodsId(20001);
		e2.setReview("review7");
		e2.setReviewDate(201225);
		e2.setCount(5);
		e2.setRate(4);
		e2.setReviewImg("/goods-img/f172c500-21d0-42e3-95ce-aa9b84a2ef49.jpg");
		expectedList1.add(e2);
		
		GoodsReview e1 = new GoodsReview();
		e1.setReviewerId(10001);
		e1.setGoodsId(20001);
		e1.setReview("review1");
		e1.setReviewDate(201010);
		e1.setCount(2);
		e1.setRate(4);
		e1.setReviewImg("/goods-img/87446ec4-e534-4b49-9f7d-9bea34665284.jpg");
		expectedList1.add(e1);
		

		//expectedList2******************************************************************	
		ArrayList<GoodsReview> expectedList2= new ArrayList<GoodsReview>();
		GoodsReview e4 = new GoodsReview();
		e4.setReviewerId(10012);
		e4.setGoodsId(20001);
		e4.setReview("review111");
		e4.setReviewDate(201010);
		e4.setCount(0);
		e4.setRate(4);
		e4.setReviewImg("/goods-img/87446ec4-e534-4b49-9f7d-9bea34665284.jpg");
		expectedList2.add(e4);
		
		GoodsReview e5 = new GoodsReview();
		e5.setReviewerId(10023);
		e5.setGoodsId(20001);
		e5.setReview("review112");
		e5.setReviewDate(201010);
		e5.setCount(0);
		e5.setRate(4);
		e5.setReviewImg("/goods-img/87446ec4-e534-4b49-9f7d-9bea34665284.jpg");
		expectedList2.add(e5);
		

		//expectedList3******************************************************************
		ArrayList<GoodsReview> expectedList3= new ArrayList<GoodsReview>();
		GoodsReview e6 = new GoodsReview();
		e6.setReviewerId(10008);
		e6.setGoodsId(20001);
		e6.setReview("review9");
		e6.setReviewDate(201227);
		e6.setCount(3);
		e6.setRate(5);
		e6.setReviewImg("/goods-img/16230038-bf86-4d4e-a11f-954b9ee4bab2.jpg");
		expectedList3.add(e6);
		
		GoodsReview e7 = new GoodsReview();
		e7.setReviewerId(10002);
		e7.setGoodsId(20001);
		e7.setReview("review3");
		e7.setReviewDate(201108);
		e7.setCount(1);
		e7.setRate(5);
		e7.setReviewImg("/goods-img/7614ce78-0ebc-4275-a7cc-d16ad5f5f6ed.jpg");
		expectedList3.add(e7);
		
		GoodsReview e8 = new GoodsReview();
		e8.setReviewerId(10003);
		e8.setGoodsId(20001);
		e8.setReview("review4");
		e8.setReviewDate(201222);
		e8.setCount(6);
		e8.setRate(4);
		e8.setReviewImg("/goods-img/ef75879d-3d3e-4bab-888d-1e4036491e11.jpg");
		expectedList3.add(e8);
		
		
		
		//expectedList4******************************************************************		
        ArrayList<GoodsReview> expectedList4= new ArrayList<GoodsReview>();
		expectedList4.add(e2);//e2在上面定义过了
		expectedList4.add(e1);//e1在上面定义过了
		expectedList4.add(e4);//e4在上面定义过了
	
		GoodsReview e9 = new GoodsReview();
		e9.setReviewerId(10023);
		e9.setGoodsId(20001);
		e9.setReview("review112");
		e9.setReviewDate(201010);
		e9.setCount(0);
		e9.setRate(4);
		e9.setReviewImg("/goods-img/87446ec4-e534-4b49-9f7d-9bea34665284.jpg");
		expectedList4.add(e9);
		
		GoodsReview e10 = new GoodsReview();
		e10.setReviewerId(10004);
		e10.setGoodsId(20001);
		e10.setReview("review5");
		e10.setReviewDate(201223);
		e10.setCount(3);
		e10.setRate(3);
		e10.setReviewImg("/goods-img/558422d1-640e-442d-a073-2b2bdd95c4ed.jpg");
		expectedList4.add(e10);
		
		GoodsReview e11 = new GoodsReview();
		e11.setReviewerId(10007);
		e11.setGoodsId(20001);
		e11.setReview("review8");
		e11.setReviewDate(201226);
		e11.setCount(2);
		e11.setRate(3);
		e11.setReviewImg("/goods-img/f87bdee1-ed48-4b49-b701-cc44f26a2699.jpg");
		expectedList4.add(e11);
		
		GoodsReview e12 = new GoodsReview();
		e12.setReviewerId(10005);
		e12.setGoodsId(20001);
		e12.setReview("review6");
		e12.setReviewDate(201224);
		e12.setCount(4);
		e12.setRate(2);
		e12.setReviewImg("/goods-img/89660409-78b7-4d47-ae12-f94b3ce9664b.png");
		expectedList4.add(e12);
		
		GoodsReview e13 = new GoodsReview();
		e13.setReviewerId(10009);
		e13.setGoodsId(20001);
		e13.setReview("review10");
		e13.setReviewDate(201228);
		e13.setCount(1);
		e13.setRate(1);
		e13.setReviewImg("/goods-img/a952ecce-32e7-474e-9c1b-943962e0a580.jpg");
		expectedList4.add(e13);

		
		
		
		
		
		
		
		
		
		
		
		//四种分支的测试******************************************************************
		
		
		Map<String, Object> paramap1 = new SearchPageReviewParams();
		paramap1.put("reviewType", 1);//判断0：默认输出全部星级评论，1：按星级输出评论
		paramap1.put("reviewRate", 4);//选择星级评价1~5
		paramap1.put("start", "first");//first：前3条 next：第4条到最后一条
		paramap1.put("goodsId", 20001);//选择要看评论的商品的goodsid
		ArrayList<GoodsReview> listGoodsreview1=newBeeMallGoodsService.selectByGoodsreview(paramap1);
		String a1= String.valueOf(listGoodsreview1);
		String b1= String.valueOf(expectedList1);
		assertEquals(a1,b1);
		
		/*for( int i = 0; i < listGoodsreview.size(); i ++) {
			GoodsReview st1 = listGoodsreview.get(i);
			GoodsReview st2 = expectedList1.get(i);
			String a= String.valueOf(st1);
			String b= String.valueOf(st2);
			assertEquals(a,b);  
		}*/


		Map<String, Object> paramap2 = new SearchPageReviewParams();
		paramap2.put("reviewType", 1);//判断0：默认输出全部星级评论，1：按星级输出评论
		paramap2.put("reviewRate", 4);//选择星级评价1~5
		paramap2.put("start", "next");//first：前3条 next：第4条到最后一条
		paramap2.put("goodsId", 20001);//选择要看评论的商品的goodsid
		ArrayList<GoodsReview> listGoodsreview2 =newBeeMallGoodsService.selectByGoodsreview(paramap2);
		String a2= String.valueOf(listGoodsreview2);
		String b2= String.valueOf(expectedList2);
		assertEquals(a2,b2);
		

		Map<String, Object> paramap3 = new SearchPageReviewParams();
		paramap3.put("reviewType", 0);//判断0：默认输出全部星级评论，1：按星级输出评论
		paramap3.put("reviewRate", 4);//选择星级评价1~5
		paramap3.put("start", "first");//first：前3条 next：第4条到最后一条
		paramap3.put("goodsId", 20001);//选择要看评论的商品的goodsid
		ArrayList<GoodsReview> listGoodsreview3 =newBeeMallGoodsService.selectByGoodsreview(paramap3);
		String a3= String.valueOf(listGoodsreview3);
		String b3= String.valueOf(expectedList3);
		assertEquals(a3,b3);
		
		
		
		Map<String, Object> paramap4 = new SearchPageReviewParams();
		paramap4.put("reviewType", 0);//判断0：默认输出全部星级评论，1：按星级输出评论
		paramap4.put("reviewRate", 4);//选择星级评价1~5
		paramap4.put("start", "next");//first：前3条 next：第4条到最后一条
		paramap4.put("goodsId", 20001);//选择要看评论的商品的goodsid
		ArrayList<GoodsReview> listGoodsreview4 =newBeeMallGoodsService.selectByGoodsreview(paramap4);
		String a4= String.valueOf(listGoodsreview4);
		String b4= String.valueOf(expectedList4);
		assertEquals(a4,b4);

/*
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(a2);
		System.out.println(b2);
		System.out.println(a3);
		System.out.println(b3);
		System.out.println(a4);
		System.out.println(b4);
		*/
		

		
		
		
		
		

		
}
}
