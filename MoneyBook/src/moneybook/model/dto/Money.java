/**
 * 
 */
package moneybook.model.dto;

import java.util.Date;

public class Money {
	private static int index=1; // 인덱스
	private int  cost; // 비용
	private Date date;	// 날짜
	private String contents; // 세부 내역
	
	public Money(){}
	
	public Money(int cost, Date date, String contents){
		this.index++;
		this.cost = cost;
		this.date = date;
		this.contents = contents;
		
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "Money [index=" + index + ", cost=" + cost + ", date=" + date + ", contents=" + contents + "]";
	}

	// 직접
	@Override
	public boolean equals(Object obj) {

		return true;
	}

	
	
}
