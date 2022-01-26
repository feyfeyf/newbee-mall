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
import ltd.newbee.mall.service.NewBeeMallGoodsService;



@SpringBootTest
public class GoodsControllergoodsSearchTest {
	//在controller里导入service
	@Resource
	NewBeeMallGoodsService newBeeMallGoodsService;
	@Test
	public void testgoodsSearch() {

		String goodsName = "MUJI";		//输入goodsName为要找的东西
		long userId = 10001;            //输入userId为当前账号

		//按次数降序显示搜索履历
		ArrayList<String> SearchHistory = newBeeMallGoodsService.GoodsSearchHistory(userId);
		ArrayList<String> expectedList1= new ArrayList<String>();
		expectedList1.add("MUJI");
		expectedList1.add("iphone");
		expectedList1.add("华为");
		expectedList1.add("二手");
		expectedList1.add("小米");
		expectedList1.add("女");
		expectedList1.add("男");
		String a1= String.valueOf(SearchHistory);
	    String b1= String.valueOf(expectedList1);
	    assertEquals(a1,b1);

		  
		//查找tb_newbee_mall_goods_info中相匹配商品名
		ArrayList<String> SearchHelp = newBeeMallGoodsService.selectBygoodsHelp(goodsName);
		ArrayList<String> expectedList2= new ArrayList<String>();
		expectedList2.add("无印良品 MUJI 基础润肤化妆水");
		expectedList2.add("无印良品 MUJI 柔和洁面泡沫");
		expectedList2.add("无印良品 MUJI 基础润肤乳液");
		expectedList2.add("无印良品 MUJI 男式");
		expectedList2.add("无印良品 MUJI 基础润肤洁面泡沫");
		expectedList2.add("无印良品 MUJI 平衡高保湿化妆水");
		expectedList2.add("无印良品 MUJI 凝胶墨水圆珠笔");
		expectedList2.add("无印良品 MUJI 平衡保湿乳霜");
		expectedList2.add("无印良品 MUJI 平衡洁面泡沫");
		expectedList2.add("无印良品 MUJI 便携式香薰机");
		expectedList2.add("无印良品 MUJI 女式");
		expectedList2.add("无印良品（MUJI） 聚丙烯化妆盒 1/2");
		expectedList2.add("无印良品 MUJI 聚丙烯");
		expectedList2.add("无印良品（MUJI） 无针订书机 其他");
		expectedList2.add("无印良品 MUJI 塑料橡皮");
		expectedList2.add("无印良品 MUJI 大容量基础乳液/高保湿型");
		expectedList2.add("无印良品 MUJI 毛笔");
		expectedList2.add("无印良品 MUJI 荧光笔");
		expectedList2.add("无印良品（MUJI） 钢制指甲刀 小");
		expectedList2.add("无印良品 MUJI 长条诗笺型笔记表格");
		expectedList2.add("无印良品 MUJI PET喷雾小分装瓶100ml");
		expectedList2.add("无印良品 MUJI 遮瑕膏");
		expectedList2.add("无印良品 MUJI 马桶刷/附盒子");
		expectedList2.add("无印良品 MUJI 耐热玻璃_壶_大");
		expectedList2.add("无印良品（MUJI） PET分裝瓶");
		expectedList2.add("无印良品（MUJI） PE分裝瓶");
		expectedList2.add("无印良品（MUJI） 聚丙烯化妆盒 半透明约150x220x169mm");
		expectedList2.add("无印良品（MUJI） 散粉小 自然色");
		expectedList2.add("无印良品（MUJI） PET小分装瓶100ml");
		expectedList2.add("无印良品 MUJI 基础润肤洁面乳");
		expectedList2.add("无印良品 MUJI 基础润肤乳霜");
		expectedList2.add("无印良品 MUJI 基础润肤洁面泡沫(替换装)");
		expectedList2.add("无印良品 MUJI 保湿洁面啫喱");
		expectedList2.add("无印良品 MUJI 小型超声波香薰机");
		expectedList2.add("无印良品 MUJI 修正带");
		expectedList2.add("无印良品 MUJI 乳液");
		expectedList2.add("无印良品 MUJI 香/绿意");
		expectedList2.add("无印良品 MUJI 润肤乳霜(高保湿型)50g");
		expectedList2.add("无印良品 MUJI 柔滑笔芯");
		expectedList2.add("无印良品 MUJI 铝制");
		expectedList2.add("无印良品 MUJI 压克力记录板夹");
		expectedList2.add("无印良品（MUJI） 自然亲肤粉底液 自然透亮色");
		expectedList2.add("无印良品 MUJI PE小分装盒");
		expectedList2.add("无印良品 MUJI 保湿化妆液");
		expectedList2.add("MUJI 羽毛 靠垫");
		expectedList2.add("无印良品（MUJI） 可携带用小卷尺 白色");
		expectedList2.add("无印良品 MUJI 笔记本/5mm方格");
		expectedList2.add("无印良品 MUJI 低重心铅笔");
		expectedList2.add("无印良品（MUJI） 手动碎纸机");
		expectedList2.add("无印良品 MUJI 塑料浴室座椅/小");
		expectedList2.add("无印良品（MUJI） 树脂携带型订书机 白色");
		expectedList2.add("无印良品（MUJI） 控色隔离霜30g 浅蓝色");
		expectedList2.add("无印良品 MUJI 塑料浴室座椅");
		String a2= String.valueOf(SearchHelp);
	    String b2= String.valueOf(expectedList2);
	    assertEquals(a2,b2);
		  
		  



		
	}   
}
