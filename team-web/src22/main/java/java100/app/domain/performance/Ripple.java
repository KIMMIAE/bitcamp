package java100.app.domain.performance;

import java.util.Date;

import java100.app.domain.member.Member;

public class Ripple {

    protected int no;
    protected int performanceNo;
    protected Member writer;
    protected String ripple;
    protected Date regDate;
    
    @Override
    public String toString() {
        return "Ripple [no=" + no + ", performanceNo=" + performanceNo + ", writer=" + writer + ", ripple=" + ripple
                + ", regDate=" + regDate + "]";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getPerformanceNo() {
        return performanceNo;
    }

    public void setPerformanceNo(int performanceNo) {
        this.performanceNo = performanceNo;
    }

    public Member getWriter() {
        return writer;
    }

    public void setWriter(Member writer) {
        this.writer = writer;
    }

    public String getRipple() {
        return ripple;
    }

    public void setRipple(String ripple) {
        this.ripple = ripple;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
    
}
