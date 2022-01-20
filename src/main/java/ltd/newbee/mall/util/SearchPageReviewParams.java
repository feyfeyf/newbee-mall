package ltd.newbee.mall.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class SearchPageReviewParams extends LinkedHashMap<String, Object> {
	private String start;
    private long reviewType;
    private long reviewRate;
    private long goodsId;
	
	public SearchPageReviewParams(Map<String, Object> params) {

		this.putAll(params);
        this.put("start", start);
        this.put("reviewType", reviewType);
        this.put("reviewRate", reviewRate);
        this.put("goodsId", goodsId);

    }
	
	public SearchPageReviewParams() {
		// TODO 自动生成的构造函数存根
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public long getReviewType() {
		return reviewType;
	}

	public void setReviewType(long reviewType) {
		this.reviewType = reviewType;
	}

	public long getReviewRate() {
		return reviewRate;
	}

	public void setReviewRate(long reviewRate) {
		this.reviewRate = reviewRate;
	}

	public long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}
	
	
	
	
}
