package com.example.oogieboogieservice.controllers;

import com.example.oogieboogieservice.services.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class FormExample
{

        ArrayList<Event> eventList = new ArrayList<>();

        @GetMapping("/index") // @GetMapping tager imod en getrequest fra browseren.
        public String index()
        {
            return "index"; // index er den html fil der returneres.
        }

        @GetMapping("/form") // createWeekendEvents er den html fil der returneres (get).
        public String form()
        {
            return "form";
        }

        @PostMapping("/submitform")
        public String submitform(@RequestParam("eventinput") String eventinput, @RequestParam("fname") String fname, @RequestParam("lname") String lname, @RequestParam("date") String date, @RequestParam("einfo") String einfo)
        {
            Event eventlist = new Event(eventinput, fname, lname, date, einfo);
            eventList.add(eventlist);
            return "redirect:/succes";
        }

        @GetMapping("/succes")
        public String succes(Model model)
        {
            model.addAttribute("event", eventList.get(eventList.size()-1));
            return "succes";
        }

        @GetMapping("/dashboard")
        public String dashboard(Model model)
        {
            model.addAttribute("events", eventList);
            return "dashboard";
        }

}
