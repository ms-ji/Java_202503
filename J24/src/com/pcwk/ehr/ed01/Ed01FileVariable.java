/**
 * Package Name : com.pcwk.ehr.ed01 <br/>
 * Class Name: Ed01FileVariable.java <br/>
 * Description:  <br/>
 */
package com.pcwk.ehr.ed01;

import java.io.File;

public class Ed01FileVariable {

	public static void main(String[] args) {
		// 경로 구분자
		System.out.printf("File.pathSeparator: %s%n", File.pathSeparator);
		System.out.printf("File.pathSeparatorChar: %c%n", File.pathSeparatorChar);
		System.out.println("===========================");

		System.out.printf("File.separator: %s%n", File.separator);
		System.out.printf("File.separatorChar: %c%n", File.separatorChar);

	}

}
