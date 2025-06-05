package com.pcwk.ehr.ed01;

//import 정리 단축키 : ctrl+shift + o
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	static final Logger Log = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
		// FATAL > ERROR > WARM > INFO > DEBUG > TRACE (로그 레벨 설정)
		Log.debug("Hello, worlds!");
		Log.info("info");
		Log.warn("warn");
		Log.error("error");
		Log.fatal("fatal");

	}

}
