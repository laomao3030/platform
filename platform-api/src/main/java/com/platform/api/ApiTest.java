package com.platform.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.platform.utils.R;


@Controller
@RequestMapping("/api/testtt22")
public class ApiTest {

	@RequestMapping("/ttt2")
    public R register(String mobile, String password) {
		System.out.println("aaaaaaaaaaaabbb");
        return R.ok();
    }

}
