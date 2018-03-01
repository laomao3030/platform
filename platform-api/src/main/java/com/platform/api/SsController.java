package com.platform.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.utils.R;


@RestController
@RequestMapping("/ssContr/dddd")
public class SsController {

	@RequestMapping("/ttt")
    public R register(String mobile, String password) {
		System.out.println("aaaaaaaaaaaa");
        return R.ok();
    }

}
