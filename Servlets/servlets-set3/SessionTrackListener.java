package com.nkxgen.listeners;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class SessionTrackListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent sessionEvent) {
    	System.out.println("Session Created:: ID="+sessionEvent.getSession().getId());
    }

    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
    	System.out.println("Session Destroyed:: ID="+sessionEvent.getSession().getId());
    }
	
}