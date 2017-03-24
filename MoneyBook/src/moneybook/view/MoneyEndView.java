/**
 * 수입/지출 기록 데이터 로드 클래스
 */

package moneybook.view;

import java.util.Iterator;

import moneybook.controller.MoneyController;
import moneybook.model.dto.Expense;
import moneybook.model.dto.Income;
import moneybook.model.dto.MoneyBook;

public class MoneyEndView {

	public static void LoadMoneyBook() throws Exception {

		MoneyController moneyController = new MoneyController();

		Iterator<Integer> idx = (Iterator) MoneyBook.mMap.keySet().iterator();
		while (idx.hasNext()) {
			int key = idx.next();
			System.out.println("[" + key + "]" + MoneyBook.mMap.get(key).toString() + "\n");
		}

		System.out.println("[합계] : " + moneyController.totalMoney());
	}

	public static void LoadExpenseMoneyBook() throws Exception {

		MoneyController moneyController = new MoneyController();

		Iterator<Integer> idx = (Iterator) MoneyBook.mMap.keySet().iterator();
		while (idx.hasNext()) {
			int key = idx.next();
			if (MoneyBook.mMap.get(key) instanceof Expense) {
				System.out.println("[" + key + "]" + MoneyBook.mMap.get(key).toString() + "\n");
			}
		}
	}

	public static void LoadIncomeMoneyBook() throws Exception {

		MoneyController moneyController = new MoneyController();

		Iterator<Integer> idx = (Iterator) MoneyBook.mMap.keySet().iterator();
		while (idx.hasNext()) {
			int key = idx.next();
			if (MoneyBook.mMap.get(key) instanceof Income) {
				System.out.println("[" + key + "]" + MoneyBook.mMap.get(key).toString() + "\n");
			}
		}
	}

}
