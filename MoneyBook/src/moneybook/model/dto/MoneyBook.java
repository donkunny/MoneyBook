/**
 * 설명
 */
package moneybook.model.dto;

import java.util.ArrayList;
import java.util.Date;

public class MoneyBook {
	
	public static ArrayList<Money> mList = new ArrayList<Money>();
	
	public MoneyBook(ArrayList<Money> mList){
		this.mList = mList;
	}

	public ArrayList<Money> getmList() {
		return mList;
	}

	public void setmList(ArrayList<Money> mList) {
		this.mList = mList;
	}


	
	
	
	
}
