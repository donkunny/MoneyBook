package moneybook.model.dto;

import java.util.Date;

public class Expense  extends Money{

	private ExpenseType eType;
	
	public Expense(){}
	
	public Expense(int cost, Date date, String contents, ExpenseType eType){
		super(cost, date, contents);
		this.eType = eType;
	}

	public ExpenseType geteType() {
		return eType;
	}

	public void seteType(ExpenseType eType) {
		this.eType = eType;
	}

	@Override
	public String toString() {
		return "Expense [eType=" + eType + ", toString()=" + super.toString() + "]";
	}

	// 직접
	@Override
	public boolean equals(Object obj) {

		return true;
	}
	
	
}
