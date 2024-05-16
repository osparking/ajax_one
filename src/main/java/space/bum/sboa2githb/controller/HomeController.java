package space.bum.sboa2githb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
  @GetMapping("/")
  public String showHome() {
    return "change_content.html";
  }

  @PostMapping("/greet_customer")
  @ResponseBody
  public String greets() throws InterruptedException {
    return "<h3>Hello 동기적 AJAX 요청</h3>";
  }
}
