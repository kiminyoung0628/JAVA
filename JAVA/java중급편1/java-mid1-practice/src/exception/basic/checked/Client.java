package exception.basic.checked;

public class Client {
    public void call() throws MYCheckedException{

        //문제 상황
        throw new MYCheckedException("ex");
    }
}
