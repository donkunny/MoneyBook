/**
 * 지출/수입에 관한 삽입, 수정, 삭제, 일별조회, 월별조회 인터페이스
 */
package moneybook.service;

import java.util.Date;

import moneybook.model.dto.ExpenseType;
import moneybook.model.dto.IncomeType;
import moneybook.model.dto.Money;

public interface MoneyBookService {
	
	public void registMoney(Money money) throws Exception;						// 수입/지출 기록 메소드
	public void updateContents(int index, String contents) throws Exception;	// 세부내역 수정 메소드
	public void updateCost(int index, int cost) throws Exception;					// 비용 수정 메소드
	public void updateDate(int index, Date date) throws Exception;				// 날짜 수정 메소드
	public void updateEType(int index, ExpenseType eType) throws Exception;	// 지출타입 수정 메소드
	public void updateIType(int index, IncomeType iType) throws Exception;	// 수입타입 수정 메소드
	public void deleteMoney(int index) throws Exception;								// 수입/지출 삭제 메소드
	public int expensePerDay(Date date) throws Exception;							// 일별 지출 조회
	public int incomePerDay(Date date) throws Exception;								// 일별 수입 조회
	public int expensePerMonth(int month) throws Exception;						// 월별 지출 조회
	public int incomePerMonth(int month) throws Exception;							// 월별 수입 조회
	public int totalMoney() throws Exception; 												// 전체 수입 조회
}
