package bitcamp.java100.ch20.ex15;

import org.springframework.stereotype.Component;

@Component("bitengine")
public class Engine {
    private String name;
    private int valve;
    private int cc;
     
    public Engine() {
        System.out.println("Engine()");
    }
    
    //Component라는 애노테이션을 처리해줄 객체를 스프링 프레임 워크에 꽂아줘야 된다.
    
    //파일 업로드를 처리하고 싶으면 그 파일 업로드를 처리해 줄 객체를 담아주세요
    // 스프링에 일을 시키고 싶으면 그 일을 할 놈을 생성(등록해줘야 된다)시켜줘야 된다.
    
    @Override
	public String toString() {
		return "Engine [name=" + name + ", valve=" + valve + ", cc=" + cc + "]";
	}



	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getValve() {
        return valve;
    }
    public void setValve(int valve) {
        this.valve = valve;
    }
    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
    
    

}
