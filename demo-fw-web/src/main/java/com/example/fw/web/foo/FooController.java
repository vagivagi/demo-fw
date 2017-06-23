package com.example.fw.web.foo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.fw.Foo;

@Controller
public class FooController {

	@GetMapping(path = "foo")
	public String foo(Model model) {
		model.addAttribute("hello", Foo.hello());
		return "foo";
	}
}
