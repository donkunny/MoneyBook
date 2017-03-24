package moneybook.service;

import moneybook.model.dto.MoneyBook;

public interface MoneyBookService {
	public void registMoney();
	public MoneyBook updateMoney();
	public void deleteMoney();
	public MoneyBook MoneyPerDay();
	public MoneyBook MoneyPerMonth();
}
