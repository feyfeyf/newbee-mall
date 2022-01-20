/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.entity;

public class GoodsQA {



	



	@Override
	public String toString() {
		return "GoodsQA [goods_id=" + goods_id + ", qa_id=" + qa_id + ", question=" + question + ", question_data="
				+ question_data + ", answer=" + answer + ", answer_data=" + answer_data + "]";
	}

	private long goods_id;

	private long qa_id;
	
	private String question;
	
	private long question_data;
	
	private String answer;
	
	private long answer_data;
	
	public long getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(long goods_id) {
		this.goods_id = goods_id;
	}

	public long getQa_id() {
		return qa_id;
	}

	public void setQa_id(long qa_id) {
		this.qa_id = qa_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public long getQuestion_data() {
		return question_data;
	}

	public void setQuestion_data(long question_data) {
		this.question_data = question_data;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public long getAnswer_data() {
		return answer_data;
	}

	public void setAnswer_data(long answer_data) {
		this.answer_data = answer_data;
	}


	
	
}