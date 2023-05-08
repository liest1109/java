package com.yedam.varable;

public class variable01 {

	public static void main(String[]args) {
		//변수 선언
		int value = 0; // 데이터 초기화 x
		
		int result = value +10; //??? +10
		System.out.println(result);
		
		//변수 사용
		int hour =3;
		int minute = 5;
		
		System.out.println(hour + "시간" + minute + "분");
		
		//시간 -> 분으로 변경
		int totalMinute = (hour*60) + minute;
		
		System.out.println("총" + totalMinute + "분");
		
		//변수 복사
		int x = 3;
		int y ;
		
	//	System.out.println("바꾸기 전 :" x + y );
		
		//y = 3
		y = x;
		
	//	System.out.println("바꾼 후 :" + x y );
		
		//swap
		//x와 y의 값을 바꾼다.
		//x = y -> x의 값과 y의 값이 같다.
		//대신 담아둘 수 있는 변수 => z
		x=3;
		y=5;
		int z = 0;
		z = x; //1) x -> z 
		x = y; //2) y -> x (
		y = z; //3) y -> z ( y = 5 -> 3)
		
		//변수의 사용 범위
		int v1  = 15;
		if (v1 > 10) {
			int v2;
			v2 = v1 - 10;
		}
//		int v3 = v1 + v2 +5;
		
		
		
	}
}
