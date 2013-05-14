package springmvc.one.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hellOne.act")
public class HelloOneAction {

	@RequestMapping
	public String handleRequest(String user, Model model) {
		System.out.println("�û�����" + user); // GET/POST�����
		model.addAttribute("user", user); // ͨ��Session���ص�����ĳ���
		model.addAttribute("helloWord", "Hello");

		return "hellouser";
	}
}