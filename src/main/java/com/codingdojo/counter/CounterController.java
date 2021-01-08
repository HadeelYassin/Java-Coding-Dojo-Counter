package com.codingdojo.counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/your_server")
public class CounterController {
    @RequestMapping("")
public String welcome(HttpSession session){
        if (session.isNew()) {
            session.setAttribute("count", 0);
        }
        else {
            Integer count = (Integer) session.getAttribute("count");
            count+=1;
            session.setAttribute("count",count );
        }
        return ("welcome.jsp");
        }
        @RequestMapping("/counter")
    public String showCounter(){
        return "counter.jsp";

        }
    @RequestMapping("/reset")
    public String resetCount(HttpSession session){
        session.invalidate();
        return "redirect:/your_server";
    }




    }

