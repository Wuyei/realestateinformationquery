package cn.bdqn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.bdqn.pojo.RealEstate;
import cn.bdqn.service.Service;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private Service service;
    
    @RequestMapping("/main.html")
    public ModelAndView main() {
        List<RealEstate> reList = service.getRealEstateList();
        ModelAndView mv = new ModelAndView("main");
        mv.addObject("reList", reList);
        return mv;
    }
}
