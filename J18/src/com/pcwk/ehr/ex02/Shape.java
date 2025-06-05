 /**
 * 파일명:Shape.java<br/>
 * 생성일:2025-04-10
 */
package com.pcwk.ehr.ex02;

public sealed interface Shape permits Circle,Rectangle{
	double area();
}
