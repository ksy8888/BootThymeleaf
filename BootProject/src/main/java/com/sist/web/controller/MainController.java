package com.sist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.web.dao.StoreDAO;
import com.sist.web.entity.StoreEntity;

import java.util.*;
@Controller
public class MainController {

	@Autowired
	private StoreDAO dao;
	
    @GetMapping("/")
    public String main_page(Model model) {
    	
    	List<StoreEntity> list = dao.storeSaleData();
    	model.addAttribute("list", list);
    	model.addAttribute("main_html", "main/home");
    	return "main";
    }
    
    
}
