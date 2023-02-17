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

        public String decryptCode(String morseCode) {
            String[] a = null;
            String b = "";
            a = morseCode.split("/");
            for (int i = 0; i < a.length; i++) {
                b = b + decryptMorseCode(a[i]);
            }
            return b;
        }
/////////////////////////////////////////////////////////
        public static String encryptionMorseCode(String code){
            String morseCode = "";
            if (code.equals("a")){
                morseCode="._";
            }
            if (code.equals("b")){
                morseCode="_...";
            }
            if (code.equals("c")){
                morseCode="_._.";
            }
            if (code.equals("d")){
                morseCode="_..";
            }
            if (code.equals("e")){
                morseCode=".";
            }
            if (code.equals("f")){
                morseCode="..-.";
            }
            if (code.equals("g")){
                morseCode="__.";
            }
            if (code.equals("h")){
                morseCode="....";
            }
            if (code.equals("i")){
                morseCode="..";
            }
            if (code.equals("j")){
                morseCode=".___";
            }
            if (code.equals("k")){
                morseCode="_._";
            }
            if (code.equals("l")){
                morseCode="._..";
            }
            if (code.equals("m")){
                morseCode="__";
            }
            if (code.equals("n")){
                morseCode="_.";
            }
            if (code.equals("o")){
                morseCode="___";
            }
            if (code.equals("p")){
                morseCode=".__.";
            }
            if (code.equals("q")){
                morseCode="__._";
            }
            if (code.equals("r")){
                morseCode="._.";
            }
            if (code.equals("s")){
                morseCode="...";
            }
            if (code.equals("t")){
                morseCode="_";
            }
            if (code.equals("u")){
                morseCode=".._";
            }
            if (code.equals("v")){
                morseCode="..._";
            }
            if (code.equals("w")){
                morseCode=".__";
            }
            if (code.equals("x")){
                morseCode="_.._";
            }
            if (code.equals("y")){
                morseCode="_.__";
            }
            if (code.equals("z")){
                morseCode="__..";
            }
            if (code.equals("1")){
                morseCode=".____";
            }
            if (code.equals("2")){
                morseCode="..___";
            }
            if (code.equals("3")){
                morseCode="...__";
            }
            if (code.equals("4")){
                morseCode="...._";
            }
            if (code.equals("5")){
                morseCode=".....";
            }
            if (code.equals("6")){
                morseCode="_....";
            }
            if (code.equals("7")){
                morseCode="__...";
            }
            if (code.equals("8")){
                morseCode="___..";
            }
            if (code.equals("9")){
                morseCode="____.";
            }
            if (code.equals("0")){
                morseCode="_____";
            }
            return morseCode;
        }
        public String encryptionCode(String code){
            String morseCode = "";
            for (int i = 0;i < code.length();i++){
                morseCode = morseCode + encryptionMorseCode(code.substring(i,i+1));
            }
            return morseCode;
        }

}
