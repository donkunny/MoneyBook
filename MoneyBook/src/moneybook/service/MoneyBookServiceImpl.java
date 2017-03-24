/**
 * MoneyBook 인퍼테이스 구현 클래스
 * Singleton형태로 구현
 */
package moneybook.service;

import java.util.Date;
import java.util.Iterator;

import org.junit.Test;

import moneybook.exception.CostException;
import moneybook.model.dto.Expense;
import moneybook.model.dto.ExpenseType;
import moneybook.model.dto.Income;
import moneybook.model.dto.IncomeType;
import moneybook.model.dto.Money;
import moneybook.model.dto.MoneyBook;
import moneybook.utils.Utils;

public class MoneyBookServiceImpl implements MoneyBookService{
	private static MoneyBookService moneyBookService = new MoneyBookServiceImpl();

	private MoneyBookServiceImpl() {	}

	public static MoneyBookService getMoneyBookService() {
		return moneyBookService;
	}

	@Override
	public void registMoney(Money money) throws Exception{
		MoneyBook.mMap.put(MoneyBook.mMap.size(), money);
	}

	
	@Override
	public void updateContents(int index, String contents) throws Exception {
		Money money = MoneyBook.mMap.get(index);
		money.setContents(contents);
		MoneyBook.mMap.put(index, money);
	}

	@Override
	public void updateCost(int index, int cost) throws Exception {
		if(cost <= 0)
			throw new CostException("0보다 같거나 작은 숫자는입력할 수 없습니다.");
		
		Money money = MoneyBook.mMap.get(index);
		money.setCost(cost);;
		MoneyBook.mMap.put(index, money);
	}

	@Override
	public void updateDate(int index, Date date) throws Exception {
		Money money = MoneyBook.mMap.get(index);
		money.setDate(date);;
		MoneyBook.mMap.put(index, money);
	}

	@Override
	public void updateEType(int index, ExpenseType eType) throws Exception {
		Expense money = (Expense)MoneyBook.mMap.get(index);
		money.seteType(eType);;
		MoneyBook.mMap.put(index, money);
	}

	@Override
	public void updateIType(int index, IncomeType iType) throws Exception {
		Income money = (Income)MoneyBook.mMap.get(index);
		money.setiType(iType);;
		MoneyBook.mMap.put(index, money);
	}
	   
	@Override
	public void deleteMoney(int index) throws Exception{
//		MoneyBook.mList.remove(index);
		MoneyBook.mMap.remove(index);
	}

	@Override
	public int expensePerDay(Date date) throws Exception {
		int sum = 0;
		Iterator<Integer> keys = Utils.getEMap().keySet().iterator();
		while(keys.hasNext()){
			int key = keys.next();
			if(Utils.getEMap().get(key).getDate().compareTo(date) == 0)
				sum += Utils.getEMap().get(key).getCost();
		}
		return sum;
	}

	@Override
	public int incomePerDay(Date date) throws Exception {
		int sum = 0;
		Iterator<Integer> keys = Utils.getIMap().keySet().iterator();
		while(keys.hasNext()){
			int key = keys.next();
			if(Utils.getIMap().get(key).getDate().compareTo(date) == 0)
				sum += Utils.getIMap().get(key).getCost();
		}
		return sum;
	}

	@Override
	public int expensePerMonth(int month) throws Exception {
		int sum = 0;
		Iterator<Integer> keys = Utils.getEMap().keySet().iterator();
		while(keys.hasNext()){
			int key = keys.next();
			if(Utils.getEMap().get(key).getDate().getMonth()+1 == month)
				sum += Utils.getEMap().get(key).getCost();
		}
		return sum;
	}

	@Override
	public int incomePerMonth(int month) throws Exception {
		int sum = 0;
		Iterator<Integer> keys = Utils.getIMap().keySet().iterator();
		while(keys.hasNext()){
			int key = keys.next();
			if(Utils.getIMap().get(key).getDate().getMonth()+1 == month)
				sum += Utils.getIMap().get(key).getCost();
		}
		return sum;
	}

	public int totalMoney() throws Exception {
		int totalMoney = 0;
		Money m = null;
		for (int i = 0; i < MoneyBook.mMap.size(); i++) {
			m = MoneyBook.mMap.get(i);
			if (m instanceof Expense) {
				totalMoney = totalMoney - m.getCost();
			} else if (m instanceof Income) {
				totalMoney = totalMoney + m.getCost();
			}
		}
		return totalMoney;
	}
	
	
	/*
	 * =============================JUnit 테스트 코드===================
	 */

	//@Test
	public void registTest(){
		try {
			registMoney(new Expense(10000, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(MoneyBook.mMap.toString());
	}
	
	// @Test
	public void deleteTest(){
		try {
			registMoney(new Expense(10000, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
			registMoney(new Expense(1000, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
			registMoney(new Expense(100, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
			deleteMoney(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(MoneyBook.mMap.toString());
	}
	
	// @Test
	public void utilTest(){
		try {
			registMoney(new Expense(10000, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
			registMoney(new Income(1000, new Date(2017, 3, 24), "순두부찌개", IncomeType.Bonus));
			registMoney(new Expense(100, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(Utils.getEMap().toString());
		System.out.println(Utils.getIMap().toString());
	}
	
	// @Test
	public void updateTest(){
		try {
			registMoney(new Expense(10000, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
			registMoney(new Income(1000, new Date(2017, 3, 24), "순두부찌개", IncomeType.Bonus));
			registMoney(new Expense(100, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
			
			updateContents(0, "된장찌개");
			updateCost(0, 0);
			updateDate(0, new Date(2017, 3, 23));
			updateEType(0, ExpenseType.Beuty);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(MoneyBook.mMap.toString());
	}
	
}
