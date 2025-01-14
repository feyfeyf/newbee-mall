/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ltd.newbee.mall.entity.GoodsImage;
import ltd.newbee.mall.entity.GoodsQA;
import ltd.newbee.mall.entity.GoodsQAins;
import ltd.newbee.mall.entity.GoodsReview;
import ltd.newbee.mall.entity.GoodsReviewIns;
import ltd.newbee.mall.entity.GoodsSearch;
import ltd.newbee.mall.entity.Goodsinfo;
import ltd.newbee.mall.entity.NewBeeMallGoods;
import ltd.newbee.mall.entity.NewBeeMallGoodsChkHistory;
import ltd.newbee.mall.util.PageQueryUtil;
import ltd.newbee.mall.util.PageResult;
import ltd.newbee.mall.util.SearchPageParams;

public interface NewBeeMallGoodsService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getNewBeeMallGoodsPage(PageQueryUtil pageUtil);

    /**
     * 添加商品
     *
     * @param goods
     * @return
     */
    String saveNewBeeMallGoods(NewBeeMallGoods goods);

    /**
     * 批量新增商品数据
     *
     * @param newBeeMallGoodsList
     * @return
     */
    void batchSaveNewBeeMallGoods(List<NewBeeMallGoods> newBeeMallGoodsList);

    /**
     * 修改商品信息
     *
     * @param goods
     * @return
     */
    String updateNewBeeMallGoods(NewBeeMallGoods goods);

    /**
     * 获取商品详情
     *
     * @param id
     * @return
     */
    NewBeeMallGoods getNewBeeMallGoodsById(Long id);

    /**
     * 批量修改销售状态(上架下架)
     *
     * @param ids
     * @return
     */
    Boolean batchUpdateSellStatus(Long[] ids,int sellStatus);

    /**
     * 商品搜索
     *
     * @param pageUtil
     * @return
     */
    PageResult searchNewBeeMallGoods(PageQueryUtil pageUtil);
    


	
    ArrayList<GoodsImage> selectByGoodsImage(long goodsId);

    ArrayList<NewBeeMallGoods> selectBygoodsPage(Map<String, Object> paramap1);
	

	ArrayList<GoodsQA> selectByGoodsqa(long goodsId,String orderBy);
	
	
	ArrayList<GoodsQA> countComment(String start,String pageSize);

	
	double selectByGoodsRateAvg(long goodsId);
	
	long[] selectByGoodsRateCount(long goodsId);
	
	long selectByGoodsGreatRateCount(long goodsId);
	
	int reviewinsert(GoodsReviewIns Review);
	
	Goodsinfo selectByGoodsinfoPK(long id);
	
	int QAinsert(GoodsQAins question);

	ArrayList<GoodsReview> selectByGoodsreview(Map<String, Object> params);

	ArrayList<String> GoodsSearchHistory(long userId);
	
	int SearhHistoryInsert(GoodsSearch Gs);
	
	ArrayList<String> selectBygoodsHelp(String keyword);
	
	ArrayList<NewBeeMallGoodsChkHistory> GoodsRecenctChk(long goodsId);
	
}
