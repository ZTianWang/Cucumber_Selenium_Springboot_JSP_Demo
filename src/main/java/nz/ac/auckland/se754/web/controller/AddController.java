package nz.ac.auckland.se754.web.controller;

import nz.ac.auckland.se754.web.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/test")
@SessionAttributes("result")
public class AddController {

    @Autowired
    AddService service;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddPage(Model model){
        return "add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String getResult(Model model, @RequestParam String num1,@RequestParam String num2){
        int result = service.add(Integer.parseInt(num1),Integer.parseInt(num2));
//        model.addAttribute(result);
        model.addAttribute("result",String.valueOf(result));
        return "add";
    }

    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public String showPage(Model model){
//        model.getAttribute("result");
        return "page";
    }
}

