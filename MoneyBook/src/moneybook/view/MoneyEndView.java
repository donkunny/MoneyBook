/**
 * 입출력 기록
 */

package moneybook.view;

import java.util.ArrayList;

import moneybook.controller.MoneyController;
import moneybook.model.dto.Money;
import moneybook.model.dto.MoneyBook;

public class MoneyEndView {
		
	public static void LoadMoneyBook() throws Exception {
		
		for(Money m : MoneyBook.mList) {
			System.out.println(m.toString()+"\n");
		}
	}

}
