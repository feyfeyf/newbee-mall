/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.entity;

public class GoodsReviewIns {

	private long reviewer_id; // goods_id => goodsId

	private long goods_id;
	
	private String review;
	
	private long review_date;
	
	private long rate;
	
	private String review_img;

	public long getReviewer_id() {
		return reviewer_id;
	}

	public void setReviewer_id(long reviewer_id) {
		this.reviewer_id = reviewer_id;
	}

	public long getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(long goods_id) {
		this.goods_id = goods_id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public long getReview_date() {
		return review_date;
	}

	public void setReview_date(long review_date) {
		this.review_date = review_date;
	}

	public long getRate() {
		return rate;
	}

	public void setRate(long rate) {
		this.rate = rate;
	}

	public String getReview_img() {
		return review_img;
	}

	public void setReview_img(String review_img) {
		this.review_img = review_img;
	}

	@Override
	public String toString() {
		return "GoodsReviewIns [reviewer_id=" + reviewer_id + ", goods_id=" + goods_id + ", review=" + review
				+ ", review_date=" + review_date + ", rate=" + rate + ", review_img=" + review_img + "]";
	}

	


	
}