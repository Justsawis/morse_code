package com.lanxuan.morse_code.mapper;

import com.lanxuan.morse_code.entity.Code;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CodeMapper {
    Code getCodeByC(String ccode);
    Code getCodeByM(String mcode);
    void insert(Code code);
    List<Code> getCodeAll();
}
