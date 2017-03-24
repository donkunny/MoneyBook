/**
 * 많이 사용되는 메소드
 */
package moneybook.utils;

import java.util.ArrayList;

import moneybook.model.dto.Expense;
import moneybook.model.dto.Income;
import moneybook.model.dto.Money;
import moneybook.model.dto.MoneyBook;

public final class Utils {

	/**
	 * 수입/지출을 구분한 list를 반환
	 * @param mList
	 * @return 구분된 ArrayList
	 */
	public static ArrayList<Expense> getEList() {
		ArrayList<Expense> eList = new ArrayList<Expense>();
		for(Money money : MoneyBook.mList){
			if(money instanceof Expense)
				eList.add((Expense)money);
		}
		return eList;
	}
	
	public static ArrayList<Income> getIList() {
		ArrayList<Income> iList = new ArrayList<Income>();
		for(Money money : MoneyBook.mList){
			if(money instanceof Income)
				iList.add((Income)money);
		}
		return iList;
	}
	
}
