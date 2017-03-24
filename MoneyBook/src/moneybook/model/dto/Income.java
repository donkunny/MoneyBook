/**
 * Money로 부터 상속받은 수입 클래스
 * + 수입타입 변수 추가
 */
package moneybook.model.dto;

import java.util.Date;

public class Income extends Money{
	
	private IncomeType iType;	// 수입타입
	
	public Income(int cost, Date date, String contents, IncomeType iType) throws Exception{
		super(cost, date, contents);
		this.iType = iType;
	}

	public IncomeType getiType() {
		return iType;
	}

	public void setiType(IncomeType iType) {
		this.iType = iType;
	}

	public String toString() {
	      return "\t[수입]" + iType + "\t" + super.toString() + "\t";
	}
}
