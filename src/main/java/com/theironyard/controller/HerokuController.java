package com.theironyard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by melaniejohnson on 9/26/16.
 */

@Controller
public class HerokuController {

    @RequestMapping(path = "/")
    public String HerokuHome(Model model, String name) {

        return "HerokuHome";
    }

//    @RequestMapping(path = "/HerokuHome", method = RequestMethod.POST)
//    public String newHerokuPost(Integer from, Integer to, Model model)
//    {
//        int randomNumber = new HerokuController().nextInt(to - from)+ from;
//        model.addAttribute("from", from);
//        model.addAttribute("to", to);
//        model.addAttribute("randomNumber", randomNumber  );
//        return "random";
//
//    }
//
//    private Integer nextInt(int i) {
//        return null;
//    }

//    @RequestMapping(path = "/random", method = RequestMethod.GET)
//    public String showForm()
//    {
//        return "randomForm";
//
//    }
//
//    @RequestMapping(path = "/random", method = RequestMethod.POST)
//    public String generatedRandomNumber(Integer from, Integer to, Model model)
//    {
//        int randomNumber = new Random().nextInt(to - from)+ from;
//        model.addAttribute("from", from);
//        model.addAttribute("to", to);
//        model.addAttribute("randomNumber", randomNumber  );
//        return "random";
//
//    }
}
