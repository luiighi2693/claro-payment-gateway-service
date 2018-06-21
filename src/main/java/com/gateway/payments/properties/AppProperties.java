
package com.gateway.payments.properties;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import org.apache.log4j.Logger;

final public class AppProperties {

    private static final String APP_BUNDLE_NAME = "app";
    
    private ResourceBundle bundle;
    
    private static final AppProperties APP_PROPERTY = new AppProperties();
    
    private static final Logger log = Logger.getLogger(AppProperties.class);
    

    private AppProperties() {
        try {
            bundle = ResourceBundle.getBundle(APP_BUNDLE_NAME);
        } catch (Throwable ex) {
            String errorNo = "";
            String errorMessage = "Error getting a resource bundle using the following base name:'app'";
            
        }
    }

    public static String getString(String key) {
        
        try {            
            return APP_PROPERTY.bundle.getString(key);          
        } catch (MissingResourceException ex) {
            
        }
        return null;
    }

    public static String getString(String key, Boolean activeAppMode) {
        
        try {
            
            
            return APP_PROPERTY.bundle.getString(key);

        } catch (MissingResourceException ex) {
            
        }
        
        return null;
    }
    
    public static Double getDouble(String key) {
      
        try {
            return Double.parseDouble(APP_PROPERTY.bundle.getString(key));
        } catch (MissingResourceException ex) {
           
        }
        
        return null;
    }    

    public static Long getLong(String key) {
      
        try {
            return Long.parseLong(APP_PROPERTY.bundle.getString(key));
        } catch (MissingResourceException ex) {
           
        }
        
        return null;
    }

    public static Long getLong(String key, Boolean activeAppMode) {

        try {

            
            return Long.parseLong(APP_PROPERTY.bundle.getString(key));

        } catch (MissingResourceException ex) {
            
        }
        return null;
    }
    
    public static Integer getInt(String key) {
      
        try {
            return Integer.parseInt(APP_PROPERTY.bundle.getString(key));
        } catch (MissingResourceException ex) {
            
        }
        
        return null;
    }

    public static Integer getInt(String key, Boolean activeAppMode) {

        try {

            
            return Integer.parseInt(APP_PROPERTY.bundle.getString(key));

        } catch (MissingResourceException ex) {
            
        }
        return null;
    }

    public static Boolean getBoolean(String key) {
      
        try {
            return Boolean.parseBoolean(APP_PROPERTY.bundle.getString(key));
        } catch (MissingResourceException ex) {
            
        }
        
        return null;
    }

    public static Boolean getBoolean(String key, Boolean activeAppMode) {

        try {

            
            return Boolean.parseBoolean(APP_PROPERTY.bundle.getString(key));

        } catch (MissingResourceException ex) {
            
        }
        return null;
    }    
}