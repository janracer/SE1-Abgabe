package org.hbrs.s1.ws22.uebung1.control;

import com.sun.java.accessibility.util.Translator;

public class TranslatorFactory {
     public static GermanTranslator createGermanTranslator(){
         return new GermanTranslator();
    }
}
