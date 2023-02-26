package com.lanxuan.morse_code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface MorseCodeService {
    public String decryptCode(String morseCode);
    public String encryptionCode(String code);

}
