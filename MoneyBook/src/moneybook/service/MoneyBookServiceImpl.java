package moneybook.service;

import java.util.ArrayList;
import java.util.Date;


import moneybook.model.dto.Expense;
import moneybook.model.dto.ExpenseType;
import moneybook.model.dto.Income;
import moneybook.model.dto.IncomeType;
import moneybook.model.dto.Money;
import moneybook.model.dto.MoneyBook;
import moneybook.utils.Utils;

public class MoneyBookServiceImpl implements MoneyBookService{
	int idx = 0;
   private static MoneyBookService moneyBookService = new MoneyBookServiceImpl();
   
   private MoneyBookServiceImpl(){}

   public static MoneyBookService getMoneyBookService() {
      return moneyBookService;
   }
   //
   @Override
   public void registMoney(Money money) throws Exception{	   
      money.setIndex(idx);
      idx++;
	   MoneyBook.mList.add(money);
      
   }

   
   @Override
   public void updateContents(int index, String contents) throws Exception {
      for (int i = 0; i < MoneyBook.mList.size(); i++) {
         if (index == MoneyBook.mList.get(i).getIndex()) {
            MoneyBook.mList.get(index).setContents(contents);
         }
      }
   }

   @Override
   public void updateCost(int index, int cost) throws Exception {
      for (int i = 0; i < MoneyBook.mList.size(); i++) {
         if (index == MoneyBook.mList.get(i).getIndex()) {
            MoneyBook.mList.get(index).setCost(cost);
         }
      }
   }

   @Override
   public void updateDate(int index, Date date) throws Exception {
      for (int i = 0; i < MoneyBook.mList.size(); i++) {
         if (index == MoneyBook.mList.get(i).getIndex()) {
            MoneyBook.mList.get(index).setDate(date);
         }
      }
   }

   @Override
   public void updateEType(int index, ExpenseType eType) throws Exception {
      for (int i = 0; i < MoneyBook.mList.size(); i++) {
         if (index == MoneyBook.mList.get(i).getIndex()) {
            Utils.getEList().get(i).seteType(eType);
         }
      }
   }

   @Override
   public void updateIType(int index, IncomeType iType) throws Exception {
      for (int i = 0; i < MoneyBook.mList.size(); i++) {
         if (index == MoneyBook.mList.get(i).getIndex()) {
            Utils.getIList().get(index).setiType(iType);
         }
      }
   }
      
   @Override
   public void deleteMoney(int index) throws Exception{
      MoneyBook.mList.remove(index);
   }

   @Override
   public int expensePerDay(Date date) throws Exception {
      int sum = 0;
      for(Money money : Utils.getEList()){
         if(date.compareTo(money.getDate()) == 0)
            sum += money.getCost();
      }
      return sum;
   }

   @Override
   public int incomePerDay(Date date) throws Exception {
      int sum = 0;
      for(Money money : Utils.getEList()){
         if(date.compareTo(money.getDate()) == 0)
            sum += money.getCost();
      }
      return sum;
   }

   @Override
   public int expensePerMonth(int month) throws Exception {
      int sum = 0;
      for(Money money : Utils.getEList()){
         if(money.getDate().getMonth()+1 == month)
            sum += money.getCost();
      }
      return sum;
   }

   @Override
   public int incomePerMonth(int month) throws Exception {
      int sum = 0;
      for(Money money : Utils.getIList()){
         if(money.getDate().getMonth()+1 == month)
            sum += money.getCost();
      }
      return sum;
   }
   
   /**
    * 테스트 코드
    */
   // @Test
   public void registTest(){
      try {
         registMoney(new Expense(10000, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      System.out.println(MoneyBook.mList.toString());
   }
   
   //@Test
   public void deleteTest(){
      try {
         registMoney(new Expense(10000, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
         registMoney(new Expense(1000, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
         registMoney(new Expense(100, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
         deleteMoney(1);
      } catch (Exception e) {
         e.printStackTrace();
      }
      
      System.out.println(MoneyBook.mList.toString());
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
      
      System.out.println(Utils.getEList().toString());
   }
   
   //@Test
   public void updateTest(){
      try {
         registMoney(new Expense(10000, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
         registMoney(new Income(1000, new Date(2017, 3, 24), "순두부찌개", IncomeType.Bonus));
         registMoney(new Expense(100, new Date(2017, 3, 24), "순두부찌개", ExpenseType.Food));
         
         for(int i = 0; i<MoneyBook.mList.size();i++){
//            System.out.println(MoneyBook.mList.ge);
         }
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      
//      System.out.println(MoneyBook.mList.toString());
   }

@Override
public ArrayList<Money> LoadMoneyBook() throws Exception {
	
	ArrayList<Money> mList = new ArrayList<Money>();
	return mList;
}
   
}