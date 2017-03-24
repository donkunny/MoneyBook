/**
 * Money로 부터 상속받은 지출 클래스
 * + 지출타입 변수 추가
 */
package moneybook.model.dto;

import java.util.Date;

public class Expense  extends Money{

	private ExpenseType eType; //지출 타입
	
	public Expense(){}
	
	public Expense(int cost, Date date, String contents, ExpenseType eType) throws Exception{
		super(cost, date, contents);
		this.eType = eType;
	}

	public ExpenseType geteType() {
		return eType;
	}

	public void seteType(ExpenseType eType) {
		this.eType = eType;
	}

	public String toString() {
	      return "\t[지출]" + eType + "\t" + super.toString() + "\t";
	}
}
