/**
 * 지출과 수입 리스트를 HashMap으로 저장하는 클래스
 * key값 - 인덱스 번호, value값 - Money 클래스
 */
package moneybook.model.dto;

import java.util.HashMap;
import java.util.Map;

public class MoneyBook {
	//	public static ArrayList<Money> mList = new ArrayList<Money>();
	public static Map<Integer, Money> mMap = new HashMap<Integer, Money>();

}
