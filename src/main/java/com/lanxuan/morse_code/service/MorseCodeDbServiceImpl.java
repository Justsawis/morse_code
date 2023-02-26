package com.lanxuan.morse_code.service;

import com.lanxuan.morse_code.entity.Code;
import com.lanxuan.morse_code.mapper.CodeMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MorseCodeDbServiceImpl implements MorseCodeService{

    @Autowired
    CodeMapper codeMapper;

    @Override
    public String decryptCode(String morseCode) {
        String[] a = null;
        String b = "";
        //"/"html转译成"%2F"
        a = morseCode.split("%2F");
        for (int i = 0; i < a.length; i++) {
            b = b + codeMapper.getCodeByM(a[i]);
            System.out.println(a[i]);
        }
        return b;
    }

    /**
     *
     * input abc
     * out ._/_.../_._.
     * @param code
     * @return
     */
    @Override
    public String encryptionCode(String code) {
        String morseCode = "";
        for (int i = 0;i < code.length();i++){
            morseCode = morseCode + "/" + codeMapper.getCodeByC(code.substring(i,i+1));
        }
        return morseCode;
    }

    public void a(){
        char b = 'a';
        Code code=new Code();
        for (int i = 0;i<=26;i++){
            String c = String.valueOf((char)(b+i));
            code.setMcode(MorseCodeServiceImpl.encryptionMorseCode(c));
            code.setCcode(c);
            codeMapper.insert(code);
        }
    }
    public static void main(String[] args) {

        MorseCodeDbServiceImpl morseCodeDbService = new MorseCodeDbServiceImpl();

        morseCodeDbService.a();
    }
}
