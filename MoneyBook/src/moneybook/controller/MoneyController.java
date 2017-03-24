/**
 * 사용자 요청값 반환
 * 
 * MoneyController
 * 수입/지출 가계부 삽입, 수정, 삭제 Service로부터 메소드 받아온다
 * 메소드를 이용하여 필요한 자료값을 View에 전달
 */
package moneybook.controller;

import java.util.Date;

import moneybook.model.dto.ExpenseType;
import moneybook.model.dto.IncomeType;
import moneybook.model.dto.Money;
import moneybook.service.MoneyBookService;
import moneybook.service.MoneyBookServiceImpl;

public class MoneyController {

   MoneyBookService moneyBookService = MoneyBookServiceImpl.getMoneyBookService();
   
   //가계 등록
   public void registMoney(Money money) throws Exception {
      moneyBookService.registMoney(money);
   }
   
   //해당 가계 삭제
   public void deleteMoney(int index) throws Exception {
      moneyBookService.deleteMoney(index);
   }
   
   //가계 수정 - 세부내역
   public void updateContents(int index, String contents) throws Exception {
      moneyBookService.updateContents(index, contents);
   }
   
   //가계 수정 - 비용
   public void updateCost(int index, int cost) throws Exception {
      moneyBookService.updateCost(index, cost);
   }
   
   //가계 수정 - 날짜
   public void updateDate(int index, Date date) throws Exception {
      moneyBookService.updateDate(index, date);
   }
   
   //가계 수정 - 지출 카테고리
   public void updateEType(int index, ExpenseType eType) throws Exception {
      moneyBookService.updateEType(index, eType);
   }
   
   //가계 수정 - 수입 카테고리
   public void updateIType(int index, IncomeType iType) throws Exception {
      moneyBookService.updateIType(index, iType);
   }
   
   //일별 가계 수입
   public int incomePerDay(Date date) throws Exception {
      int sumDay = moneyBookService.incomePerDay(date);
      return sumDay;   
   }
   
   //월별 가계 수입
   public int incomePerMonth(int month) throws Exception {
      int sumMonth = moneyBookService.incomePerMonth(month);
      return sumMonth;   
   }
   
   //일별 가계 지출
   public int expensePerDay(Date date) throws Exception {
      int sumDay = moneyBookService.expensePerDay(date);
      return sumDay;   
   }
   
   //월별 가계 지출
   public int expensePerMonth(int month) throws Exception {
      int sumMonth = moneyBookService.expensePerMonth(month);
      return sumMonth;   
   }
   
   // 전체 가계 조회
	public int totalMoney() throws Exception {
		return moneyBookService.totalMoney();
	}
}