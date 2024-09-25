package thread.bounded;

public interface BoundedQueue {
    void put(String data); //생산자가 데이터 생산
    String take(); //소비자가 데이터 소비
}
