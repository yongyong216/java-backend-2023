package chapter1.F_Opperator;

// 연산자
// 산술연산자, 대입연산자, 비교연산자, 논리연산자, 삼항연산자
public class Opperator {

	public static void main(String[] args) {
		// 산술 연산자
		
		// 덧셈 연산자 : +
		// 좌항에 우항을 더한 값을 반환
		int addResult = 8 + 3;
		System.out.println(addResult);
		
		// 뺄셈 연산자 : - 
		// 좌항에 우항을 뺀 값을 반환
		int minusResult = 8 - 3;
		System.out.println(minusResult);
		
		// 곱셈 연산자 : *
		// 좌항에 우항을 곱한 값을 반환
		int multiResult = 8 * 3;
		System.out.println(multiResult);
		
		// 나눗셈 연산자 : /
		// 좌항에 우항을 나눈 값을 반환
		int remainderResult = 8 / 3; // 무조건 몫을 반환한다는 의미가 아님
		float float1 = 2.6666F;
		int number1 = (int)float1;
		System.out.println(number1);
		System.out.println(remainderResult);
		
		double remainderResult2 = 8.0 /3.0;
		System.out.println(remainderResult2);
		
		// 나머지 연산자 : %
		// 좌항에 우항을 나눈 나머지를 반환
		int remainderResult3 = 8 % 3;
		System.out.println(remainderResult3);
		
		// 정수와 정수를 연산하면 정수가 반환됨
		// 실수와 정수를 연산하면 실수가 반환됨(둘중 하나라도 실수라면 실수로 받아줘야 한다.)
		// 실수와 실수를 연산하면 실수가 반환됨
		
		// 증감연산자 : '변수' 자신을 1 증가 혹은 감소 
		
		// 증가연산자 : ++
		// 연산자의 좌항 혹은 우항의 값을 1증가 시킴
		int integer1 = 10;
		++integer1; // 증가하고 읽힌다.
		System.out.println(integer1);
		integer1++; // 읽히고 나서 증가한다.
		System.out.println(integer1);
		System.out.println("=============");
		integer1 = 0;
		System.out.println(integer1);
		System.out.println(++integer1); // 증가되고 읽히기 때문에 바로 증가한다.
		
		System.out.println(integer1);
		System.out.println(integer1++);  // 읽히고 증가되기 때문에 1이 그대로 남아있음
		
		System.out.println(integer1);
		
		// 상수에는 증감연산자 사용 불가능
		//final int NUMBER = 0;
		//NUMBER++; 
		//0++;    //리터럴 상수 자체를 연산할 수 없다.
		
		// 감소연산자 : --
		// 연산자의 좌항 혹은 우항의 값을 1 감소시킴
		int integer2 = 10;
		--integer2;
		integer2--;
		
		int number2 = 8;
		int number3 = 3;
		int sampleNumber = number2 / --number3; // ;이 끝난 다음 연산이 된다.

		// 대입연산자
		// 좌항에 우항을 (누적)대입
		// 좌항의 변수에 좌항 변수와 우항을 연산한 결과를 대입
		
		// = : 좌항에 우항을 대입
		int number4 = 10;
		// += : 좌항에 우항을 더한 값을 좌항에 대입
		number4 += 3;
		System.out.println(number4);
		// -= : 좌항에 우항을 뺀 값을 좌항에 대입
		number4 -= 6;
		System.out.println(number4);
		// *= : 좌항에 우항을 곱한 값을 좌항에 대입
		number4 *= 3;
		System.out.println(number4);
		// /= : 좌항에 우항을 나눈 값을 좌항에 대입
		number4 /= 5;
		System.out.println(number4);
		// %= : 좌항에 우항을 나눈 나머지를 좌항에 대입
		number4 %= 3;
		System.out.println(number4);
		
		// 대입 연산자의 좌항에는 무조건 변수만 지정할 수 있음
			
		// 비교 연산자
		// 좌항을 우항과 비교한 결과를 논리(true, false) 값으로 반환
		
		// ==
		// 좌항이 우항과 같다면 true, 아니면 false 반환
		boolean boolean1 = 10 == 12;
		System.out.println(boolean1);
		// !=
		// 좌항이 우항과 다르다면 true, 아니면 false 반환
		boolean boolean2 = 10 != 12;
		System.out.println(boolean2);
		// >, >=     (gt)
		// 좌항이 우항보다 크면 true, 아니면 false 반환
		// 좌항이 우항보다 크거나 같으면 true, 아니면 false 반환
		boolean boolean3 = 10 > 10;
		boolean boolean4 = 10 >= 10;
		System.out.println(boolean3); 
		System.out.println(boolean4);
		// <, <=      (lt)
		// 좌항이 우항보다 작으면 true, 아니면 false
		// 좌항이 우항보다 작거나 같으면 true, 아니면 false
		boolean boolean5 = 8 < 10;
		boolean boolean6 = 10 <= 10;
		System.out.println(boolean5);
		System.out.println(boolean6);
	
		// 논리 연산자
		// 논리 값을 연산하는 연산자
		// 좌항과 우항값 모두에 논리값이 있어야한다.
		
		// && : AND 연산
		// 좌항과 우항이 모두 true일 때 true, 아니면 false
		int number5 = 8;
		int number6 = 3;
		boolean boolean7 = number5 > number6 && true;
		
		// || : OR 연산
		// 좌항과 우항 중 하나라도 true이면 true, 아니면 false
		boolean boolean8 = false || true;
		
		boolean boolean9 = (number6 > number5) && (number5++ > number6);
		System.out.println(number5);
		
		boolean boolean10 = 
					(number5 > number6) || (number6 > ++number5);
		System.out.println(number5);
		
		// ! : NOT 연산
		// 부정 연산자, 논리값의 부정을 반환
		boolean boolean11 = !(number5 > number6);
		System.out.println(boolean11);
		
		
		// 삼항 연산자
		// 조건에 따라 다른 결과를 반환하는 연산자
		// 조건(논리연산자) ? 참일때 결과 : 거짓일때 결과
		String string1 =
				number5 > number6 ? "3보다 큽니다." :
				number5 == number6 ? "3입니다.":"3보다 크지 않습니다.";
				
			if (number5 > number6) {
				System.out.println("3보다 큽니다.");
			}else if(number5 == number6) {
				System.out.println("3입니다.");
			}else {
				System.out.println("3보다 크지 않습니다.");
			}
				
		System.out.println(string1);
		
	}

}
