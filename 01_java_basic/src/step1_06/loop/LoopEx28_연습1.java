package step1_06.loop;

// 2024-02-19 19:40 ~
// # 삼각형 그리기

public class LoopEx28_연습1 {
	
	public static void main(String[] args) {
		
		
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		
		for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		System.out.println();
		/*
		 * 문제 2)
		 *   #	2
		 *  ##	1
		 * ###	0
		 */
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3-(i+1); j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
			
		}
		System.out.println();
		
		/*
		 * 문제 3)
		 * ###  0
		 * ##   1
		 * #    2 
		 */
		System.out.println("문제 3)");
		for (int i = 0; i < 3; i++) {
			
			for (int j = 3; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}

		
		/*
		 * 문제 4)
		 * ###  
		 *  ##
		 *   #
		 */
		System.out.println("문제 4)");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 3; j > i; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */

		System.out.println("문제 5)");
		
		//for (int i = 0; i < 3; i++) {
		//	for (int j = 0; j < 0; j++) {
		//}
		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */

		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */

		
		
	}
}
