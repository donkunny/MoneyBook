package moneybook.service;

import moneybook.model.dto.Income;
import moneybook.model.dto.Money;
import moneybook.model.dto.MoneyBook;

public class MoneyBookServiceImpl implements MoneyBookService{

	@Override
	public void registMoney(Money money) throws Exception{
		MoneyBook.mList.add(money);
	}

	@Override
	public void updateContents(int index, String contents) throws Exception{
		MoneyBook.mList.get(index).setContents(contents);
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
