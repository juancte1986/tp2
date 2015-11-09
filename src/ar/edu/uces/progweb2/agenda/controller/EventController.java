package ar.edu.uces.progweb2.agenda.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import ar.edu.uces.progweb2.agenda.dto.MeetingDTO;
import ar.edu.uces.progweb2.agenda.dto.PrivateEventDTO;

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
	
	@RequestMapping(value="/newEvent")
	public String initNewEvent(@RequestParam("event") String event, ModelMap model){
		if(event.equals("meeting")){
			model.addAttribute("formMeeting", new MeetingDTO());
			return "/jsp/meeting.jsp";
		}
		else if(event.equals("privateEvent")){
			model.addAttribute("formPrivateEvent", new PrivateEventDTO());
			return "/jsp/privateEvent.jsp";
		}else{
			model.addAttribute("error",true);
			return "/jsp/calendar.jsp";
		}
	}
	
	@RequestMapping(value="/saveMeeting")
	public String saveMeeting(@ModelAttribute("formMeeting") MeetingDTO metting){
		return "/jsp/calendar.jsp";
	}
	
	@RequestMapping(value="/savePrivateEvent")
	public String savePrivateEvent(@ModelAttribute("formPrivateEvent") PrivateEventDTO privateEvent){
		return "/jsp/calendar.jsp";
	}
	
	public String detailEvent(){
		return null;
	}
	
	public String updateMeeting(){
		return "/jsp/calendar.jsp";
	}
	
	public String updatePrivateEvent(){
		return "/jsp/calendar.jsp";
	}
	
}
