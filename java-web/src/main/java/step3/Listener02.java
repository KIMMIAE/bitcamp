package step3;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

//@WebListener // <= 따로 url 지정 하지 않음.

public class Listener02 implements ServletRequestListener {
	
	@Override
	public void requestInitialized(ServletRequestEvent sce) {
	System.out.println("Listener02.requestInitialized()");	
	
	
	}
	@Override
	public void requestDestroyed(ServletRequestEvent sce) {
	System.out.println("Listener02.requestDestroyed()");	
	}
	
	
	
	

}
