/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本系统已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.entity;

public class GoodsQAins {

	private long goods_id;

	private long qa_id;
	
	private String question;
	
	private long question_date;
	
	private String answer;
	
	private long answer_date;

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

	public long getQuestion_date() {
		return question_date;
	}

	public void setQuestion_date(long question_date) {
		this.question_date = question_date;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public long getAnswer_date() {
		return answer_date;
	}

	public void setAnswer_date(long answer_date) {
		this.answer_date = answer_date;
	}

	
	}

	
	
