package com.hj.huji.service;

import java.util.List;
import com.hj.huji.po.HujiInfo;
//spring mvc的业务类HujiService，对户籍数据的操作
public interface HujiService {
	public void addHuji(HujiInfo huji);
	public List<HujiInfo> getAllHujiInfo();
	public void updateHuji(HujiInfo huji);
	public void deleteHuji(String id);
}
