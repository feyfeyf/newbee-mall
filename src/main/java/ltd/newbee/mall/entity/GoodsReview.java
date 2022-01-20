/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.entity;

public class GoodsReview {

	private long reviewerId; // goods_id => goodsId

	private long goodsId;
	
	private String review;
	
	private long reviewDate;
	
	private long count;
	
	private long rate;
	
	private String reviewImg;

	public long getReviewerId() {
		return reviewerId;
	}

	public void setReviewerId(long reviewerId) {
		this.reviewerId = reviewerId;
	}

	public long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public long getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(long reviewDate) {
		this.reviewDate = reviewDate;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	
	public long getRate() {
		return rate;
	}

	public void setRate(long rate) {
		this.rate = rate;
	}

	
	public String getReviewImg() {
		return reviewImg;
	}

	public void setReviewImg(String reviewImg) {
		this.reviewImg = reviewImg;
	}

	@Override
	public String toString() {
		return "GoodsReview [reviewerId=" + reviewerId + ", goodsId=" + goodsId + ", review=" + review + ", reviewDate="
				+ reviewDate + ", count=" + count + ", rate=" + rate + ", reviewImg=" + reviewImg + "]";
	}

	


	


	
}