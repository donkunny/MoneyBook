package moneybook.service;

import moneybook.model.dto.Money;
import moneybook.model.dto.MoneyBook;

public interface MoneyBookService {
	public void registMoney(Money money) throws Exception;
	public void updateContents(int index, String contents) throws Exception;
	public void deleteMoney();
	public MoneyBook MoneyPerDay();
	public MoneyBook MoneyPerMonth();
}
