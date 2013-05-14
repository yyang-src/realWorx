package springmvc.one.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hellOne.act")
public class HelloOneAction {

	@RequestMapping
	public String handleRequest(String user, Model model) {
		System.out.println("用户名：" + user); // GET/POST的入参
		model.addAttribute("user", user); // 通过Session返回到界面的出参
		model.addAttribute("helloWord", "Hello");

		return "hellouser";
	}
}