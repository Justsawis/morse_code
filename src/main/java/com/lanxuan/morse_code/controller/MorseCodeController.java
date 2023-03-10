package com.lanxuan.morse_code.controller;

import com.lanxuan.morse_code.service.MorseCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class MorseCodeController {
    @Autowired
    MorseCodeService morseCodeService;
    @PostMapping("/decryptMorseCode")
    public @ResponseBody String decryptMorseCode(@RequestBody String morseCode){
        return morseCodeService.decryptCode(morseCode);
    }
    @PostMapping("/encryptionMorseCode")
    public @ResponseBody String encryptionMorseCode(@RequestBody String code){
       return morseCodeService.encryptionCode(code);
    }

//    @GetMapping("/test")
//    public @ResponseBody String test(){
//        return morseCodeService.test();
//    }
}
