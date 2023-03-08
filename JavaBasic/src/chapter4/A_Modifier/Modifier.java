package chapter4.A_Modifier;

import chapter4.A_AccessModifier.Example4;

// 제어자
// 클래스, 변수 혹은 메서드의 선언부에서 사용되는 부가적 의미를 추가해주는 키워드

// 접근 제어자 : public, protect, default, private
// 기타 제어자 : static, abstract, final

// (접근 제어자)하나의 대상에 여러개의 제어자를 종합해서 사용할 수 있다
// 단, 접근 제어자는 한 선언에 대하여 한번만 사용할 수 있음
// 제어자의 순서는 무관

//static 제어자
// 해당 제어자가 포함되어있는 선언문은 클래스 단위로 사용가능하도록 함(정적선언)
// 멤버 변수, 멤버 메서드에서 사용가능
class Example1 {
	static int number1;
	static void function1() {}
	
}

//final 제어자
// 해당 제어자가 포함되어있는 선언문은 변경이 불가능하도록 함
// 클래스, 메서드, 변수에서 사용 가능

// 클래스 선언문에 final이 포함되면 해당 클래스를 상속하지 못함
final class Example2{
	// 메서드 선언문에 final이 포함되면 해당 메서드를 오버라이드하지 못함
	final void function2() {
		// 변수 선언문에 final이 포함되면 초기화한 후 해당 변수의 값을 변경하지 못함
		final int NUMBER2 = 10;
//		NUMBER2 =12;   바꾸는것이 불가능한것을 볼 수 있다.
	}
}

//class Example2_1 extends Example2{
//	void function2(){}
//}

// abstract 제어자
// 해당 제어자가 포함되어있는 선언문은 선언만 되어있고 구현은 되어있지 않음을 나타냄
// 클래스, 메서드에서 사용 가능

// 클래스 선언문에 abstract가 포함되어 있으면 해당 클래스는 구현되지 않은 메서드를 
// 포함하고 있음을 의미
abstract class Example3{
	// 메서드 선언문에 abstract가 포함되어 있으면 해당 메서드는 구현되지 않았음을 의미
	abstract void function3();
}

public class Modifier {

	public static void main(String[] args) {
//		Example4 example4 = new Example4();
//		example4.number4 = 10;
//		example4.function4();
		
		Example1 example1 =new Example1();
		example1.number1 = 10;
		
		
	}

}
