package com.example.oogieboogieservice.services;

public class Event
{
        private String eventinput;
        private String fname;
        private String lname;
        private String date;
        private String einfo;

        // constructer.
        public Event(String eventinput, String fname, String lname,  String date,  String einfo)
        {
            this.einfo = einfo;
            this.fname = fname;
            this.lname = lname;
            this.date = date;
            this.eventinput = eventinput;
        }

        // Method Getter.
        public String getEventinput() { return eventinput;}
        public String getFname() { return fname; }
        public String getLname() { return lname; }
        public String getDate() { return date; }
        public String getEinfo(){ return einfo; }

}
