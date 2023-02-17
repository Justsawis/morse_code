package com.lanxuan.morse_code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MorseCodeService {
    public static String decryptMorseCode(String morseCode){
        String code = "";
            if (morseCode .equals( "._")) {
                code = "a";
            }
            if (morseCode .equals( "_...")){
                code = "b";
            }
            if (morseCode .equals( "_._.")){
                code = "c";
            }
            if (morseCode .equals( "_..")){
                code = "d";}
            if (morseCode .equals( ".")){
                code = "e";}
            if (morseCode .equals( ".._.")){
                code = "f";}
            if (morseCode .equals( "__.")){
                code = "g";}
            if (morseCode .equals( "....")){
                code = "h"; }
            if (morseCode .equals( "..")){
                code = "i";}
            if (morseCode .equals( ".___")){
                code = "j"; }
            if (morseCode .equals( "_._")){
                code = "k"; }
            if (morseCode .equals( "._..")){
                code = "l";}
            if (morseCode .equals( "__")){
                code = "m";}
            if (morseCode .equals( "_.")){
                code = "n";}
            if (morseCode .equals( "___")){
                code = "o"; }
            if (morseCode .equals( ".__.")){
                code = "p";}
            if (morseCode .equals( "__._")){
                code = "q";}
            if (morseCode .equals( "._.")){
                code = "r"; }
            if (morseCode .equals( "...")){
                code = "s";}
            if (morseCode .equals( "_")){
                code = "t"; }
            if (morseCode .equals( ".._")){
                code = "u"; }
            if (morseCode .equals( "..._")){
                code = "v"; }
            if (morseCode .equals( ".__")){
                code = "w"; }
            if (morseCode .equals( "_.._")){
                code = "x"; }
            if (morseCode .equals( "_.__")){
                code = "y"; }
            if (morseCode .equals( "__..")){
                code = "z";}
            if (morseCode .equals( ".____")){
                code = "1"; }
            if (morseCode .equals( "..___")){
                code = "2"; }
            if (morseCode .equals( "...__")){
                code = "3"; }
            if (morseCode .equals( "...._")){
                code = "4"; }
            if (morseCode .equals( ".....")){
                code = "5"; }
            if (morseCode .equals( "_....")){
                code = "6"; }
            if (morseCode .equals( "__...")){
                code = "7"; }
            if (morseCode .equals( "___..")){
                code = "8"; }
            if (morseCode .equals( "____.")){
                code = "9";
            }
            if (morseCode .equals( "_____")){
                code = "0";
            }

            return code;
        }

        public String decryptCode(String morseCode){
            String[] a = null;
            String b = "";
            a = morseCode.split("/");
            for (int i = 0;i < a.length;i++){
                b = b + decryptMorseCode(a[i]);
            }
            return b;
        }

}
