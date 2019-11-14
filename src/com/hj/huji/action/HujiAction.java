package com.hj.huji.action;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hj.huji.po.HujiInfo;
import com.hj.huji.service.HujiService;
/*
 * spring mvc的控制器类，用来操作户籍信息表的增删查
 */
//注解为控制器类
@Controller
@RequestMapping("/huji")
public class HujiAction {
	//将HujiService注入到Controller中
	@Autowired
	private HujiService hujiService;
	/*
	 * 即/huji/input执行方法，将填写的户籍信息存放到model对象中
	 * 并返回添加页面
	 */
	@RequestMapping("/input")
	public String inputHuji(Model model){
		model.addAttribute("huji", new HujiInfo());
		return "/jsp/right/hujiAdd";
	}
	@RequestMapping("/add")
	public String addHuji(@ModelAttribute HujiInfo huji,Model model){
		model.addAttribute("huji", huji);
		hujiService.addHuji(huji);
		return "redirect:/huji/query";
	}
	/**
	 * 
	 * 将户籍实体类对象HujiInfo存放到model对象
	 * 调用hujiService类的获取信息函数来获取户籍信息
	 * 并返回一个hujiManage的页面
	 */
	@RequestMapping("/query")
	public String queryHuji(@ModelAttribute HujiInfo huji,Model model){
		List<HujiInfo> list = hujiService.getAllHujiInfo();
		model.addAttribute("hujiList", list);
		return "/jsp/right/hujiManage";
	}
	/**
	 * 
	 * 将户籍实体类对象HujiInfo存放到model对象
	 * 调用hujiService类的删除信息函数来删除户籍信息
	 * 并返回一个hujiManage的页面
	 */
	@RequestMapping("/drop")
	public String dropHuji(String id,Model model){
		hujiService.deleteHuji(id);
		//System.out.println("删除！");
		//重新获取户籍表的信息，并将表信息存放到model对象
		List<HujiInfo> list = hujiService.getAllHujiInfo();
		model.addAttribute("hujiList", list);
		return "/jsp/right/hujiManage";
	}
}
