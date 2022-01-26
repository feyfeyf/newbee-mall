package ltd.newbee.mall.controller.mall;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ltd.newbee.mall.entity.GoodsReview;
import ltd.newbee.mall.entity.GoodsSearch;
import ltd.newbee.mall.entity.NewBeeMallGoodsChkHistory;
import ltd.newbee.mall.service.NewBeeMallGoodsService;



@SpringBootTest
public class GoodsControllergoodsCheckHistory {
	//在controller里导入service
	@Resource
	NewBeeMallGoodsService newBeeMallGoodsService;
	@Test
	public void testgoodsSearch() {

		long userId = 10001;            //输入userId为当前账号
		
		
		
		//按次数降序显示搜索履历
		ArrayList<NewBeeMallGoodsChkHistory> checkSearchHistory = newBeeMallGoodsService.GoodsRecenctChk(userId);
		System.out.println("当前id"+userId+"经常看的商品按次数排序为"+checkSearchHistory);
		
		
		
		
		
		
		
		//test
		ArrayList<NewBeeMallGoodsChkHistory> expectedList1= new ArrayList<NewBeeMallGoodsChkHistory>();
		NewBeeMallGoodsChkHistory e1 = new NewBeeMallGoodsChkHistory();
		e1.setGoodsName("Apple Macbook Pro 13.3");
		e1.setGoodsCoverImg("/goods-img/4da4fa5d-ee2d-4496-9950-e53b102f0e8e.jpg");
		e1.setSellingPrice(13068);
		expectedList1.add(e1);
		
		NewBeeMallGoodsChkHistory e2 = new NewBeeMallGoodsChkHistory();
		e2.setGoodsName("无印良品 MUJI 基础润肤化妆水");
		e2.setGoodsCoverImg("/goods-img/87446ec4-e534-4b49-9f7d-9bea34665284.jpg");
		e2.setSellingPrice(100);
		expectedList1.add(e2);
		
		NewBeeMallGoodsChkHistory e3 = new NewBeeMallGoodsChkHistory();
		e3.setGoodsName("Apple iPhone XR (A2108)");
		e3.setGoodsCoverImg("/goods-img/c2e3b2e4-1fc8-43f3-b133-6f4eae7faa5d.jpg");
		e3.setSellingPrice(5199);
		expectedList1.add(e3);
		
		NewBeeMallGoodsChkHistory e4 = new NewBeeMallGoodsChkHistory();
		e4.setGoodsName("Apple iPhone 7 (A1660)");
		e4.setGoodsCoverImg("/goods-img/1f5bb955-fbe7-451a-b12c-3e2115c53020.jpg");
		e4.setSellingPrice(2929);
		expectedList1.add(e4);
		
		
		System.out.println("测试id"+userId+"经常看的商品按次数排序为"+expectedList1);
		String a1= String.valueOf(checkSearchHistory);
		String b1= String.valueOf(expectedList1);
		assertEquals(a1,b1);
	}   
}
