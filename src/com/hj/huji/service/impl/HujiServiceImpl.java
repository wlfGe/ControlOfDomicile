package com.hj.huji.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hj.huji.dao.HujiDao;
import com.hj.huji.po.HujiInfo;
import com.hj.huji.service.HujiService;
//spring mvc的业务类HujiService，对户籍数据的操作
/*
 * 将HujiService注解为一个服务
 */
@Service
public class HujiServiceImpl implements HujiService{
	private HujiDao hujiDao = new HujiDao();
	@Override
	public void addHuji(HujiInfo huji) {
		// TODO Auto-generated method stub
		if(huji != null){
			hujiDao.addHuji(huji);
		}else{
			System.out.println("添加户籍失败");
		}
	}

	@Override
	public void updateHuji(HujiInfo huji) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<HujiInfo> getAllHujiInfo() {
		// TODO Auto-generated method stub
		List<HujiInfo> list = hujiDao.getAllHujiInfo();
		return list;
	}

	@Override
	public void deleteHuji(String id) {
		// TODO Auto-generated method stub
		hujiDao.deleteHujiInfo(id);
	}

}
