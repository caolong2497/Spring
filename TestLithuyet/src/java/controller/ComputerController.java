/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ComputerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Lab06
 */
@Controller
public class ComputerController {

    private ComputerDao computerDao;

    @Autowired
    @Qualifier(value = "computerDao")
    public void setProductDAO(ComputerDao computerDao) {
        this.computerDao = computerDao;
    }

    @RequestMapping(value = "/loadCombyId")
    public String loadCombyId(@RequestParam("comId") int comId,
            Model model) {
        model.addAttribute("com", computerDao.GetComById(comId));
        return "com";
    }
        @RequestMapping(value = "/loadAll",method = RequestMethod.GET)
    public String loadAll(Model model) {
        model.addAttribute("listcom", computerDao.GetAll());
        return "index";
    }
}
