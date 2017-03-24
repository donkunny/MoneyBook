/**
 * 설명
 */
package moneybook.model.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MoneyBook {
	
	public static ArrayList<Money> mList = new ArrayList<Money>();
	public static Map<Integer, Money> mMap = new HashMap<Integer, Money>();
	
	public static ArrayList<Money> getmList() {
		return mList;
	}

	public static void setmList(ArrayList<Money> mList) {
		MoneyBook.mList = mList;
	}
	

}
