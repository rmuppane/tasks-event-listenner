package com.redhat.internal.util;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SharedAssets  {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SharedAssets.class);
	
	public static HashMap<String, Object> sharedMap = new HashMap<String, Object>();
	
}
