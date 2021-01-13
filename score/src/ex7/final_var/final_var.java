package ex7.final_var;

import java.util.Scanner;

public class final_var {

	public static void main(String[] args) {

		// int kor1, kor2, kor3;
		// int[] kors = new int[3*3]; //1학년 국어1~3, 2학년 국어1~3, 3학년 국어1~3
		// int[][]kors = new int[3][3];
		final int SIZE = 3;
		int[] kors = new int[SIZE];
		int total = 0;
		float avg;
		int menu; // 1:INPUT 2:PRINT 3:EXIT
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3;

		Scanner scan = new Scanner(System.in);

		// kor1 = 0;
		// kor2 = 0;
		// kor3 = 0;

		for (int i = 0; i < SIZE; i++)
			kors[i] = 0;

		종료: // 라벨을 만들어줌
		while (true) {

			/*-----------------메인메뉴----------*/

			System.out.println(" -------\"메인메뉴\"-------");
			System.out.println("\t1.성적입력");
			System.out.println("\t2.성적출력");
			System.out.println("\t3.종료");
			System.out.println("\t>");
			menu = scan.nextInt(); // 메뉴 값을 입력받으면 선택된 번호 실행

			switch (menu) {

			case MENU_INPUT: // 메뉴에 1이 입력되면 실행
				/*-----------------성적입력----------*/

				System.out.println(" -------\"성적입력\"-------");

//				do {
//					System.out.println("국어1:");
//					kor1 = scan.nextInt();
//					
//					if(kor1<0 || 100<kor1)
//						System.out.println("성적범위(0~100)를 벗어났습니다.");
//					
//					
//				}while(kor1<0 || 100<kor1);
//				
//				
//				
//				do {
//					System.out.println("국어2:");
//					kor2 = scan.nextInt();
//					
//					if(kor2<0 || 100<kor2)
//						System.out.println("성적범위(0~100)를 벗어났습니다.");
//					
//					
//				}while(kor2<0 || 100<kor2);
//				
//				
//			
//				do {
//					System.out.println("국어3:");
//					kor3 = scan.nextInt();
//					
//					if(kor3<0 || 100<kor3)
//						System.out.println("성적범위(0~100)를 벗어났습니다.");
//					
//					
//				}while(kor3<0 || 100<kor3);

				for (int i = 0; i < SIZE; i++)
					do {
						System.out.printf("국어%d:", i + 1);
						kors[i] = scan.nextInt();

						if (kors[i] < 0 || 100 < kors[i])
							System.out.println("성적범위(0~100)를 벗어났습니다.");

					} while (kors[i] < 0 || 100 < kors[i]);

				break;

			case MENU_PRINT: // 메뉴에 2가 입력되면 실행
				/*-----------------성적출력----------*/

				System.out.println(" -------\"성적출력\"-------");

				for (int i = 0; i < SIZE; i++)

				// total = kor1 + kor2 + kor3;

				total += kors[i];
				avg = total / 3.0f;


				// for(int n=1; n<=3; n++) 1부터 시작할땐 n을 씀
				for (int i = 0; i < SIZE; i++)
					System.out.printf("\t국어%d : %3d\n", i + 1, kors[i]); // \t국어%d에i+1대입,%3d\n에 kor1대입
				// System.out.printf("\t국어%d : %3d\n", 3-i, kor1); //출력번호를 3->2->1로 할때

				System.out.printf("\t총점 : %3d\n", total);
				System.out.printf("\t평균 : %6.2f\n", avg); // 전체 4자리 중 둘째 소수점까지

				System.out.println(" \\--------------------\\");

			

				break;

			case MENU_EXIT:// 메뉴에 3이 입력되면 실행
				break 종료; // 라벨을 이용하여 switch문 빠져나감
			// System.exit(0); 프로그램 강제종료

			default:
				System.out.println("입력 오류 : 1~3까지만 입력할 수 있습니다.");

			}

		}

		System.out.println("good bye~");
	}

}
