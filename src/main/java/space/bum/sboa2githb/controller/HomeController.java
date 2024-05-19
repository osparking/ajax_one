package space.bum.sboa2githb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
  @GetMapping("/")
  public String cdTableButton() {
    return "cd_collection.html";
  }

  @PostMapping("/greet_customer")
  @ResponseBody
  public String showHome(@RequestParam String lname,
      @RequestParam String fname) throws InterruptedException {
    return "<h3>Hello '" + lname + ", " + fname + "'</h3>";
  }
}
