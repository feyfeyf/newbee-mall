package ltd.newbee.mall.controller.mall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

import ltd.newbee.mall.entity.GoodsImage;
import ltd.newbee.mall.entity.NewBeeMallGoods;
import ltd.newbee.mall.service.NewBeeMallGoodsService;
import ltd.newbee.mall.util.SearchPageParams;


@SpringBootTest
public class TestGoodsPage {
	//在controller里导入service
	@Resource
	NewBeeMallGoodsService newBeeMallGoodsService;
	@Test
	public void testGoodsInfo() {
		Map<String, Object> paramap1 = new HashMap<String, Object>();

		paramap1.put("pageNo", 1);
		paramap1.put("keyword", "iphone");
		paramap1.put("goodsCategoryId", 46);
		paramap1.put("orderBy", "");
		SearchPageParams paraMap=new SearchPageParams(paramap1);
		
		ArrayList<NewBeeMallGoods>list = newBeeMallGoodsService.selectBygoodsPage(paramap1);
		if(!CollectionUtils.isEmpty(list)) {
			assertEquals(3,list.size());
			assertTrue(checkgoodsIdInlist(list,102781));
			assertTrue(checkGoodsCategoryIdInlist(list,46));
		}
	}
	private boolean checkgoodsIdInlist(ArrayList<NewBeeMallGoods> list, long goodsId) {
		for(int i=0;i<list.size();i++) {
		    if(list.get(i).getGoodsId() == goodsId) {
		    return true;
		    }
	    }
		return false;
    }
	private boolean checkGoodsCategoryIdInlist(ArrayList<NewBeeMallGoods> list, long GoodsCategoryId) {
		for(int i=0;i<list.size();i++) {
		    if(list.get(i).getGoodsId() == GoodsCategoryId) {
		    return true;
		    }
	    }
		return false;
    }

   
}
