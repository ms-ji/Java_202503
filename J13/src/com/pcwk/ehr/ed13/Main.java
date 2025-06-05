/**
 * 파일명 : Main.java <br/>
 * 생성일 : 2025-04-03
 */
package com.pcwk.ehr.ed13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	static final Logger LOG = LogManager.getLogger(Main.class);
	
	public static void main(String[] args) {
	//FATA > ERROR > WARM > INFO > DEBUG > TRACE
		
		LOG.debug("bebug");
		LOG.info("info");
		LOG.warn("warn");
		LOG.error("error");
		LOG.fatal("fatal");
     
	}

}
