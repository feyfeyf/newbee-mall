package ltd.newbee.mall.controller.mall;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ltd.newbee.mall.entity.Goodsinfo;
import ltd.newbee.mall.service.NewBeeMallGoodsService;


@SpringBootTest
public class GoodsControllerTest {
	//在controller里导入service
	@Resource
	NewBeeMallGoodsService newBeeMallGoodsService;
	@Test
	public void testGoodsInfo() {
		Goodsinfo info = newBeeMallGoodsService.selectByGoodsinfoPK(5651205l);
		assertEquals("nature",info.getName());
		assertEquals("98×200×23.5(cm)",info.getSize());
	}

   
}
