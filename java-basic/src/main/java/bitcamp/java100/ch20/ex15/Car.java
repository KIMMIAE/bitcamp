package bitcamp.java100.ch20.ex15;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tico") // 스프링 IoC 컨테이너에게 이 클래스의 객체를 만들어 달라고 요청.
public class Car {
    private String model;
    private String color;
    private int capacity;
    
    //@Resource(name="e2")
    @Autowired
    private Engine engine;
    
    private Map<String, String> options;
    
    
    
    
    
   
	public Car() {
    	System.out.println("Car()");
    }






	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", capacity=" + capacity + ", engine=" + engine
				+ ", options=" + options + "]";
	}






	public String getModel() {
		return model;
	}






	public void setModel(String model) {
		this.model = model;
		
		System.out.println("setModel()");
	}






	public String getColor() {
		return color;
	}






	public void setColor(String color) {
		this.color = color;
		System.out.println("setColor()");
	}






	public int getCapacity() {
		return capacity;
	}






	public void setCapacity(int capacity) {
		this.capacity = capacity;
		System.out.println("setCapacity()");
	}



	public Map<String, String> getOptions() {
		return options;
	}






	public void setOptions(Map<String, String> options) {
		this.options = options;
		System.out.println("setOptions()");
	}
    







}