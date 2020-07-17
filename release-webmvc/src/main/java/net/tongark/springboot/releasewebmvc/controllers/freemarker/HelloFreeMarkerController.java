package net.tongark.springboot.releasewebmvc.controllers.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/freemarker")
public class HelloFreeMarkerController {

    @RequestMapping("/hello")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("var","FreeMarker");
        return "freemarker/index";
    }
}
