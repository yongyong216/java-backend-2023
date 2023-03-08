package chapter4.A_AccessModifier;

// 접근 제어자
// 멤버 또는 클래스의 접근 권한을 제한하는 제어자
// private: 같은 클래스 내에서만 접근이 가능
// default: 같은 패키지 내에서만 접근이 가능
// protect: 같은 패키지 내에서 그리고 다른 패키지의 자손클래스에서만 접근이 가능
// public: 모든 공간에서 접근이 가능

// 클래스, 멤버변수, 메서드, 생성자


public class Example4 {
	private int number4;
	
	private void function4() {}
	
	private Example4() {}
}
