/**
 * Ed03Example05.java<br/>
 * 2025-03-26<br/>
 */
package com.pswk.ehr.ed05;

public class Ed03Example05 {

	public static void main(String[] args) {
		// 4x+5y = 60, for
		// 1. for x (1<=10)
		for (int x = 1; x <= 10; x++) {
			// 2.for y (1<=10)
			for (int y = 1; y <= 10; y++) {
				// 3. 조건 : 4x+5y == 60
				if (4 * x + 5 * y == 60) {
					// 4. 출력 : (x,y)
					System.out.printf("(%d,%d)", x, y);

				} // if end

			} // for x end
		} // for y end

	}

}
