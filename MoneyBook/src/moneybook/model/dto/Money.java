/**
 * Expense, Income의 부모클래스
 * 비용, 날짜, 세부내역 변수를 갖는다.
 */
package moneybook.model.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import moneybook.exception.CostException;

public class Money {
	private int  cost; // 비용
	private Date date;	// 날짜
	private String contents; // 세부내역
//	private SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	public Money(){}
	
	public Money(int cost, Date date, String contents) throws Exception{
		// 0보다 작은 값 입력시 예외 처리
		if(cost <=0)
			throw new CostException("0보다 작거나 같은 값을 입력할 수 없습니다.");
		
		this.cost = cost;
		this.date = date;
		this.contents = contents;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) throws Exception{
		// 0보다 작은 값 입력시 예외 처리
		if(cost <=0)
			throw new CostException("0보다 작거나 같은 값을 입력할 수 없습니다.");
		
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

	public String toString() {
	      return "\t" + cost + "\t\t" + convertYear(date) +"년 " + convertMonth(date) +"월  " + date.getDate()+ "일" + "\t" + contents + "\t";
	}
	
	/**
	 * 날짜 최적화 메소드
	 * @param date
	 * @return
	 */
	public int convertYear(Date date){
		return date.getYear()+1900;
	}
	
	public int convertMonth(Date date){
		return date.getMonth() + 1;
	}
	
}
