/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.org.apache.xml.internal.serializer.utils.Messages;
import java.util.Locale;
import java.util.ResourceBundle;


public class Lang {
    public static void main(String[] args) {
        String language = "en-US";
        String country = "US";
        
        Locale locale = new Locale(language, country);
        ResourceBundle messages = ResourceBundle.getBundle("messages", locale);
        System.out.print(messages.getString("hello") + " ");
        System.out.println(messages.getString("world"));
    }
}