/**
 * Test 諛� �솕硫�
 */
package moneybook.view;

import java.util.Date;

import moneybook.controller.MoneyController;
import moneybook.model.dto.Expense;
import moneybook.model.dto.ExpenseType;
import moneybook.model.dto.MoneyBook;

public class MoneyStartView {

	public static void main(String[] args) throws Exception {
		
		MoneyController moneyController = new MoneyController();
		
		Date date = new Date(2017, 3, 24); 
		Expense ep1 = new Expense(10000, date, "순두부찌개", ExpenseType.Food);
		Expense ep2 = new Expense(15000, date, "블루클럽", ExpenseType.Beuty);
		Expense ep3 = new Expense(20000, date, "택시비", ExpenseType.Transportation);
		date = new Date(2017, 3, 25);
		Expense ep4 = new Expense(65000, date, "통신비", ExpenseType.Communication);
		
		try {
			moneyController.registMoney(ep1);
			moneyController.registMoney(ep2);
			moneyController.registMoney(ep3);
			moneyController.registMoney(ep4);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MoneyEndView.LoadMoneyBook();
	}

}