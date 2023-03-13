package chapter5.D_EtcClass;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;

// Timer - TimerTask
// 특정 작업을 지연 시킬때 사용
// TimerTask 클래스를 상속 받아서 run 메서드를 구현

class Delay extends TimerTask {

	@Override
	public void run() {
		//지연 시킬 메서드
		System.out.println("지연됨!");
		
	}
	
}

public class EtcClass {

	public static void main(String[] args) throws InterruptedException {
		
		// Timer 클래스의 인스턴스로 TimerTask 구현체를 실행
		Timer timer = new Timer(true);
		Delay delay = new Delay();
		timer.schedule(delay, 500);   // 1000 = 1초 기다린 후 실행 된다.
		
//		for (int index = 0; index < 10000000; index++) {
//			int a =10;
//			int b =20;
//			a += b;
//			b -= a;
//		}
//		
//		for (int index = 0; index < 10000000; index++) {
//			int a =10;
//			int b =20;
//			a += b;
//			b -= a;
//		}
		
		System.out.println("완료");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		// BigDecimal
		// 정확한 소수점 연산을 하기 위한 클래스
		double double1 = 9.4720230310;
		double double2 = 1.303202749;
		System.out.println(double1 + double2);
		
		BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(double1));
		BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(double2));
		System.out.println(bigDecimal1.add(bigDecimal2));
		
		// DecimalFormat
		// 일정형식으로 데이터 출력해주는 클래스
		DecimalFormat decimalFormat = new DecimalFormat("$###,###,###.00");
		System.out.println(decimalFormat.format(10_000_000));  //문자열로 나온다.
	
	
	}

}
