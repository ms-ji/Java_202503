/**
 * Package Name : com.pcwk.ehr.ed06 <br/>
 * Class Name: Button.java <br/>
*/
package com.pcwk.ehr.ed06;

public class Button {
	@FunctionalInterface
	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clicklistener;
	public void setClickListener(ClickListener clickListener) {
		this.clicklistener = clickListener;
	}
	public void click() {
		this.clicklistener.onClick();
	}
}
