package cn.ssh_springmvc.project;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestSpringMVC {

	@Resource
	private TestService testService;

	@RequestMapping("/test")
	public String test() {
		System.out.println("TestSpringMVC.test()");
		testService.saveTwoUsers();
		return "test";
	}
}
