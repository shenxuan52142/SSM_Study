package com.sx.service.impl;

import com.sx.mapper.LuckSignMapper;
import com.sx.pojo.FamousQuotes;
import com.sx.pojo.LuckSign;
import com.sx.pojo.YiJI;
import com.sx.service.LuckSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LuckSignServiceImpl implements LuckSignService {
   @Autowired
    LuckSignMapper luckSignMapper;

    public void addLuckSign(LuckSign luckSign) {
        luckSignMapper.addLuckSign(luckSign);
    }

    public void addFamousQutos(FamousQuotes famousQuotes) {
       luckSignMapper.addFamousQutos(famousQuotes);
    }

    public void addyi(LuckSign luckSign) {
        luckSignMapper.addyi(luckSign);
    }

    public void addji(LuckSign luckSign) {
        luckSignMapper.addji(luckSign);
    }

    public void addLuckSignTwo(LuckSign luckSign) {
        luckSignMapper.addLuckSignTwo(luckSign);
    }

    public void addFinalLuckSign(YiJI yiJI) {
        luckSignMapper.addFinalLuckSign(yiJI);
    }
}
