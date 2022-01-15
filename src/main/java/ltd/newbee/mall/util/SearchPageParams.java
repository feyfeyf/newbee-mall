package ltd.newbee.mall.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class SearchPageParams extends LinkedHashMap<String, Object> {
	private int pageNo;
	private String keyword;
	private int goodsCategoryId;
	private String orderBy;
	
	public SearchPageParams(Map<String, Object> params) {
        this.pageNo=(int)params.get("pageNo");
		this.putAll(params);
        //分页参数
        int start=(pageNo-1)*3;
        this.put("start", start);
        this.put("keyword", keyword);
        this.put("goodsCategoryId", goodsCategoryId);
        this.put("orderBy", orderBy);
    }
	
	public SearchPageParams() {
		// TODO 自动生成的构造函数存根
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getGoodsCategoryId() {
		return goodsCategoryId;
	}
	public void setGoodsCategoryId(int goodsCategoryId) {
		this.goodsCategoryId = goodsCategoryId;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

}
