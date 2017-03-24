/**
 * 설명
 */
package moneybook.model.dto;

import java.util.Date;

public class Income extends Money{
	
	private IncomeType iType;
	
	public Income(int cost, Date date, String contents, IncomeType iType){
		super(cost, date, contents);
		this.iType = iType;
	}

	public IncomeType getiType() {
		return iType;
	}

	public void setiType(IncomeType iType) {
		this.iType = iType;
	}

	@Override
	public String toString() {
		return "Income [iType=" + iType + ", toString()=" + super.toString() + "]";
	}

	
	// 직접
	@Override
	public boolean equals(Object obj) {
	
		return true;
	}

	
	
}
