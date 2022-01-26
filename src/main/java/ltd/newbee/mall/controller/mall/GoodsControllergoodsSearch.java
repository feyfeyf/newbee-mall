package ltd.newbee.mall.controller.mall;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import ltd.newbee.mall.entity.GoodsSearch;
import ltd.newbee.mall.service.NewBeeMallGoodsService;



@SpringBootTest
public class GoodsControllergoodsSearch {
	//在controller里导入service
	@Resource
	NewBeeMallGoodsService newBeeMallGoodsService;
	@Test
	public void testgoodsSearch() {

		String goodsName = "MUJI";		//输入goodsName为要找的东西
		long userId = 10001;            //输入userId为当前账号
		
		
		
		//按次数降序显示搜索履历
		ArrayList<String> SearchHistory = newBeeMallGoodsService.GoodsSearchHistory(userId);
		System.out.println("当前id"+userId+"的搜索历史按次数排序为"+SearchHistory);
		
		//将搜索记录insert搜索履历		
	 	  GoodsSearch e = new GoodsSearch(); 
		  e.setUserId(userId);
		  Date date = new Date();
		  e.setDateTime(date); 
		  e.setGoodsName(goodsName); 
		  int cnt = newBeeMallGoodsService.SearhHistoryInsert(e);  
		  if(cnt == 1) {  //1是被操作记录条数
		  System.out.println(goodsName+"已加入检索历史");
		  }
		  
		//查找tb_newbee_mall_goods_info中相匹配商品名
		  ArrayList<String> SearchHelp = newBeeMallGoodsService.selectBygoodsHelp(goodsName);
		  System.out.println("您是不是要找"+SearchHelp);
		  
		  



		
	}   
}
