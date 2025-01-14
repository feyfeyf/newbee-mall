/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.catalina.mapper.Mapper;
import org.apache.ibatis.annotations.Param;

import ltd.newbee.mall.entity.GoodsImage;
import ltd.newbee.mall.entity.GoodsQA;
import ltd.newbee.mall.entity.GoodsQAins;
import ltd.newbee.mall.entity.GoodsReview;
import ltd.newbee.mall.entity.GoodsReviewIns;
import ltd.newbee.mall.entity.GoodsSearch;
import ltd.newbee.mall.entity.Goodsinfo;
import ltd.newbee.mall.entity.NewBeeMallGoods;
import ltd.newbee.mall.entity.NewBeeMallGoodsChkHistory;
import ltd.newbee.mall.entity.StockNumDTO;

import ltd.newbee.mall.util.PageQueryUtil;
import ltd.newbee.mall.util.SearchPageParams;

public interface NewBeeMallGoodsMapper {
    int deleteByPrimaryKey(Long goodsId);

    int insert(NewBeeMallGoods record);

    int insertSelective(NewBeeMallGoods record);

    NewBeeMallGoods selectByPrimaryKey(Long goodsId);

    NewBeeMallGoods selectByCategoryIdAndName(@Param("goodsName") String goodsName, @Param("goodsCategoryId") Long goodsCategoryId);

    int updateByPrimaryKeySelective(NewBeeMallGoods record);

    int updateByPrimaryKeyWithBLOBs(NewBeeMallGoods record);

    int updateByPrimaryKey(NewBeeMallGoods record);

    List<NewBeeMallGoods> findNewBeeMallGoodsList(PageQueryUtil pageUtil);

    int getTotalNewBeeMallGoods(PageQueryUtil pageUtil);

    List<NewBeeMallGoods> selectByPrimaryKeys(List<Long> goodsIds);

    List<NewBeeMallGoods> findNewBeeMallGoodsListBySearch(PageQueryUtil pageUtil);

    int getTotalNewBeeMallGoodsBySearch(PageQueryUtil pageUtil);

    int batchInsert(@Param("newBeeMallGoodsList") List<NewBeeMallGoods> newBeeMallGoodsList);

    int updateStockNum(@Param("stockNumDTOS") List<StockNumDTO> stockNumDTOS);

    int batchUpdateSellStatus(@Param("orderIds")Long[] orderIds,@Param("sellStatus") int sellStatus);

    List<NewBeeMallGoods> goodsInfo(Mapper paramentMap);

	Goodsinfo selectByGoodsinfoPK(Long id);

	ArrayList<GoodsImage> selectByGoodsImage(long goodsId);
	


	ArrayList<NewBeeMallGoods> selectBygoodsPage(Map<String, Object> paramap1);
    
	ArrayList<GoodsQA> selectByGoodsqa(long goodsId,String orderBy);
	
	ArrayList<GoodsQA> countComment(String start,String pageSize);

	int QAinsert(GoodsQAins question);
	
	ArrayList<GoodsReview> selectByGoodsreview(Map<String, Object> params);
	
	double selectByGoodsRateAvg(long goodsId);
	
	long[] selectByGoodsRateCount(long goodsId);
	
	long selectByGoodsGreatRateCount(long goodsId);
	
	int reviewinsert(GoodsReviewIns Review);
	
	Goodsinfo selectByGoodsinfoPK(long id);
    
	ArrayList<String> GoodsSearchHistory(long userId);
	
	int SearhHistoryInsert(GoodsSearch Gs);
	
	ArrayList<String> selectBygoodsHelp(String keyword);
	
	ArrayList<NewBeeMallGoodsChkHistory> GoodsRecenctChk(long goodsId);
	
}