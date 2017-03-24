package moneybook.service;

import java.util.Date;

import moneybook.model.dto.ExpenseType;
import moneybook.model.dto.IncomeType;
import moneybook.model.dto.Money;
import moneybook.model.dto.MoneyBook;

public interface MoneyBookService {
	public void registMoney(Money money) throws Exception;
	public void updateContents(int index, String contents) throws Exception;
	public void updateCost(int index, int cost) throws Exception;
	public void updateDate(int index, Date date) throws Exception;
	public void updateEType(int index, ExpenseType eType) throws Exception;
	public void updateIType(int index, IncomeType iType) throws Exception;
	public void deleteMoney();
	public MoneyBook MoneyPerDay();
	public MoneyBook MoneyPerMonth();
}
