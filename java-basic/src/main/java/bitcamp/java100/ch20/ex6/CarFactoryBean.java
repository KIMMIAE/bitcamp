package bitcamp.java100.ch20.ex6;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.config.AbstractFactoryBean;

import bitcamp.java100.ch07.ex5.A;

public class CarFactoryBean extends AbstractFactoryBean<Car> {
	
	public Tire[] tires;	
	private String model;
	
	

	public void setTires(Tire[] tires) {
		this.tires = tires;
	}
	
	
	
	public void setModel(String model) {
		this.model = model;
	}

	
	
	
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Car createInstance() throws Exception {
		//Spring IoC 컨테이너가 객체를 만들어 달라고 요청할 때 호출한다.
		Car car = null;
		
		
		switch (model) {
		case "티코" : 
			car = createTico();
			break;
		case "티코 골드" : car = createTicoGold(); break;
		case "소나타" : car = createSonata(); break;
		case "에쿠스" : car = createEquus(); break; 
		default: car = createBasic();
		}
		car.setTires(tires);
		return car;
	}

	private Car createBasic() {
		Car c = new Car();
		
		Engine engine = new Engine();
		engine.setCc(1500);
		engine.setName("비트엔진");
		engine.setValve(16);
		
		c.setEngine(engine);
		
		return c;
	}

	private Car createEquus() {
		Car c = new Car();
		
		Engine engine = new Engine();
		engine.setCc(3500);
		engine.setName("비트스페셜엔진");
		engine.setValve(32);
		
		c.setEngine(engine);
		
		return c;
	}

	private static Car createSonata() {
		Car c = new Car();
		
		Engine engine = new Engine();
		engine.setCc(1980);
		engine.setName("비트표준엔진");
		engine.setValve(16);
		
		c.setEngine(engine);
		
		return c;
	}

	private Car createTicoGold() {
		Car c = new Car();
		
		Engine engine = new Engine();
		engine.setCc(900);
		engine.setName("비트엔진");
		engine.setValve(16);
		
		c.setEngine(engine);
		Map<String, String> options = new HashMap<>();
		options.put("sunroof", "yes");
		options.put("airbag", "yes");
	    options.put("blackbox", "yes");
		
		return c;
	}

	private Car createTico() {
		Car c = new Car();
		
		Engine engine = new Engine();
		engine.setCc(900);
		engine.setName("비트엔진");
		engine.setValve(16);
		
		c.setEngine(engine);
		
		return c;
	}





}
