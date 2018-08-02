package com.chrismyung.main;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.chrismyung.services.GoogleClientService;


@ApplicationPath("/rest")
public class MainApp extends Application{

	private Set<Object> singletons = new HashSet<Object>();
	
	public MainApp() {
		singletons.add(new GoogleClientService());
	}
	
	@Override
	public Set<Object> getSingletons(){
		return singletons;
	}
	
}
