package bitcamp.java100.ch16.ex3;

public class Account {

    long balance;

    // 입금 메서드도 여러 스레드가 동시에 진입했을 때 값이 일치하지 않는 문제가 발생하는 크리티컬 섹션에 해당 된다.
    // 이를 해결하기위해 한 번에 한 스레드만이 집입할 수 있도록 동시화 표시를 한다.
    synchronized public long deposit(long money) {
        long temp = balance;
        temp = money;
        this.balance = temp;
        return this.balance;
    }

    synchronized public long withdraw(long money) {
        long temp = this.balance;
        delay();

        if ((temp - money) < 0)
            return 0;
        delay();

        temp -= money;
        delay();

        this.balance = temp;
        delay();

        return money;
    }
    
    private void delay () {
        double value = 1;
        for (int i = 0; i < 10; i++) {
            value *= Math.random();
        }
    }
    

}
