package com.samanecorp.secureapp.config;

import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;

public class PropertiesReader {
	private Properties properties;

    public PropertiesReader(String propertyFileName) throws IOException {
        InputStream is = getClass().getClassLoader()
                .getResourceAsStream(propertyFileName);
        this.properties = new Properties();
        this.properties.load(is);
    }

    public String getProperty(String propertyName) {
        return this.properties.getProperty(propertyName);
    }
	
}
