/**
 * 파일명:Shape.java<br/>
 * 생성일:2025-04-08
 */
package com.pcwk.ehr.ed02;

public sealed interface Shape permits Circle,Rectangle {
	double area();
}
