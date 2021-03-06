package com.dev.web.mobile.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * @author JETHER ROIS
 *
 */
public final class PropertyUtil {	
	private static final PropertyUtil INSTANCE = new PropertyUtil();
	
	private PropertyUtil() {
	}
	
	public static final PropertyUtil getInstance() {
		return INSTANCE;
	}
	
	public Properties readFromClasspath(String filename) throws IOException {
		final InputStream stream = getClass().getClassLoader().getResourceAsStream(filename);
		if(stream == null) {
			return null;
		}
		try {
			Properties props = new Properties();
			props.load(stream);
			return props;
		} finally {
			stream.close();
		}
		
		
	}

	public Properties loadPropertieFile(String fileInClassPath) throws IOException, FileNotFoundException {
		final Properties props = PropertyUtil.getInstance().readFromClasspath(fileInClassPath);
		if(props == null) {
			throw new FileNotFoundException(String.format("It was not possible to find the db-config file: '%s'.", fileInClassPath));
		}
		return props;
	}
}
