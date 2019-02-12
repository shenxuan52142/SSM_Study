package com.sx.mapper;

import com.sx.pojo.FamousQuotes;
import com.sx.pojo.LuckSign;
import com.sx.pojo.YiJI;

public interface LuckSignMapper {
  void addLuckSign(LuckSign luckSign);
  void addFamousQutos(FamousQuotes famousQuotes);
  void addyi(LuckSign luckSign);
  void addji(LuckSign luckSign);
  void addLuckSignTwo(LuckSign luckSign);

  void addFinalLuckSign(YiJI yiJI);

}
