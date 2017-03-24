/**
 * Test 및 화면
 */
package moneybook.view;

import java.util.Date;

import moneybook.controller.MoneyController;
import moneybook.model.dto.Expense;
import moneybook.model.dto.ExpenseType;
import moneybook.model.dto.Income;
import moneybook.model.dto.IncomeType;
import moneybook.model.dto.MoneyBook;

public class MoneyStartView {

   public static void main(String[] args) throws Exception {
      
      MoneyController moneyController = new MoneyController();
      
      //지출
      Date date = new Date(2017, 3, 24);
      Expense ep1 = new Expense(10000, date, "순두부찌개", ExpenseType.Food);
      Expense ep2 = new Expense(15000, date, "블루클럽", ExpenseType.Beuty);
      Expense ep3 = new Expense(20000, date, "택시비", ExpenseType.Transportation);
      date = new Date();
      Expense ep4 = new Expense(65000, date, "통신비", ExpenseType.Communication);
      
      //수입
      date = new Date(2017, 3, 1);
      Income ic1 = new Income(300000, date, "용돈", IncomeType.PocketMoney);
      Income ic2 = new Income(100000, date, "삼일절보너스", IncomeType.Bonus);
      
      try {
         moneyController.registMoney(ep1);
         moneyController.registMoney(ep2);
         moneyController.registMoney(ep3);
         moneyController.registMoney(ep4);
         moneyController.registMoney(ic1);
         moneyController.registMoney(ic2);
      } catch (Exception e) {
         e.printStackTrace();
      }     
      
      System.out.println("-------------------------가계부 전체-----------------------------");
      MoneyEndView.LoadMoneyBook();
      System.out.println("-------------------------지출 전체-----------------------------");
      MoneyEndView.LoadExpenseMoneyBook();
      System.out.println("-------------------------수입 전체-----------------------------");
      MoneyEndView.LoadIncomeMoneyBook();
      System.out.println("-------------------------가계부 전체-----------------------------");
      MoneyEndView.LoadMoneyBook();
      System.out.println("-------------------------지출 전체-----------------------------");
      MoneyEndView.LoadExpenseMoneyBook();
      System.out.println("-------------------------수입 전체-----------------------------");
      MoneyEndView.LoadIncomeMoneyBook();
      System.out.println("-------------------------가계부 지출 수정-----------------------------");
      moneyController.updateContents(1, "언니네이발관");
      MoneyEndView.LoadExpenseMoneyBook();
      System.out.println("-------------------------가계부 수입 삭제-----------------------------");
      moneyController.deleteMoney(5);
      MoneyEndView.LoadIncomeMoneyBook();
   
   }

}