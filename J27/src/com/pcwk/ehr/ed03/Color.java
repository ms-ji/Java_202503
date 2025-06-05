package com.pcwk.ehr.ed03;

public enum Color {
	RED("#FF0000"),BLUE("#00FF00"),GREEN("#0000FF");
	
	private final String hexCode;

	/**
	 * @param hexCode
	 */
	private Color(String hexCode) {
		this.hexCode = hexCode;
	}

	public String getHexCode() {
		return hexCode;
	}
	
}
