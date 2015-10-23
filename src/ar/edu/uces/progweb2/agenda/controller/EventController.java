package ar.edu.uces.progweb2.agenda.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("user")
@Controller
public class EventController {
	
	// asincronicos
	@RequestMapping(value = "getEvents")
	public @ResponseBody Map<String, Object> getEvents(@RequestBody Date date){
		//la lista de eventos del day 1
		//la lista de eventos del day 2
		//la lista de eventos del day 3
		//la lista de eventos del day 4
		//la lista de eventos del day 5
		//la lista de eventos del day 6
		//la lista de eventos del day 7
		return null;
	}
	
	//droppable
	@RequestMapping(value = "detailEvent/{id}/")
	public @ResponseBody Map<String, Object> detailEvents(@PathVariable("id") long id){
		return null;
	}
	
	
	@RequestMapping(value = "eventSwitchTime/{id}/")
	public @ResponseBody Map<String, Object> eventSwitchTime(@PathVariable("id") long id){
		return null;
	}
	
	// sincronicos
	
	public String initNewEvent(){
		return null;
	}
	
	public String saveNewEvent(){
		return "/jsp/calendar.jsp";
	}
	
	public String initEvent(){
		return null;
	}
	
	public String updateEvent(){
		return "/jsp/calendar.jsp";
	}
	
}
