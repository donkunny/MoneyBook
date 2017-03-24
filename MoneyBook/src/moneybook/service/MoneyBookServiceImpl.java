package moneybook.service;

import java.util.Date;

import moneybook.model.dto.ExpenseType;
import moneybook.model.dto.Income;
import moneybook.model.dto.IncomeType;
import moneybook.model.dto.Money;
import moneybook.model.dto.MoneyBook;

public class MoneyBookServiceImpl implements MoneyBookService{
	//
	@Override
	public void registMoney(Money money) throws Exception{
		MoneyBook.mList.add(money);
	}

	@Override
	public void updateContents(int index, String contents) throws Exception{
		MoneyBook.mList.get(index).setContents(contents);
	}
	
	@Override
	public void updateCost(int index, int cost) throws Exception {
	}

	@Override
	public void updateDate(int index, Date date) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEType(int index, ExpenseType eType) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateIType(int index, IncomeType iType) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMoney() {
		
	}

	@Override
	public MoneyBook MoneyPerDay() {
		return null;
	}

	@Override
	public MoneyBook MoneyPerMonth() {
		return null;
	}
	
}
