/**
 * 많이 사용되는 메소드 저장 클래스
 * 상속 불가
 * MoneyBook에 있는 전체 데이터 HashMap에서 지출과 수입을 따로 Map으로 저장 및 반환
 */
package moneybook.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import moneybook.model.dto.Expense;
import moneybook.model.dto.Income;
import moneybook.model.dto.Money;
import moneybook.model.dto.MoneyBook;

public final class Utils {
	
	/**
	 * 수입/지출을 구분한 list를 반환
	 * 
	 * @param mList
	 * @return 구분된 ArrayList
	 */
	public static Map<Integer, Expense> getEMap(){
		Map<Integer, Expense> eMap = new HashMap<>();
		Iterator<Integer> keys = MoneyBook.mMap.keySet().iterator();
		while(keys.hasNext()){
			int key = keys.next();
			if(MoneyBook.mMap.get(key) instanceof Expense)
				eMap.put(key, (Expense)MoneyBook.mMap.get(key));
		}
		return eMap;
	}
	
	public static Map<Integer, Income> getIMap(){
		Map<Integer, Income> iMap = new HashMap<>();
		Iterator<Integer> keys = MoneyBook.mMap.keySet().iterator();
		while(keys.hasNext()){
			int key = keys.next();
			if(MoneyBook.mMap.get(key) instanceof Income)
				iMap.put(key, (Income)MoneyBook.mMap.get(key));
		}
		return iMap;
	}
}
