package ar.edu.uces.progweb2.agenda.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HallController {
	
	@RequestMapping( value =  "/getHalls" )
	public @ResponseBody Map<String, Object> getHalls(){
		Map<String, Object> map = new HashMap<>();
		return map;
	}
}
