/**
 * Service 관리 및 예외처리 && instanceof
 */
package moneybook.controller;

import moneybook.service.MoneyBookService;
import moneybook.service.MoneyBookServiceImpl;

public class MoneyController {
	
	private MoneyBookService moneyBookService = new MoneyBookServiceImpl();

	public void setMoneyBookService(MoneyBookService moneyBookService) {
		this.moneyBookService = moneyBookService;
	}
	
	
	
}
