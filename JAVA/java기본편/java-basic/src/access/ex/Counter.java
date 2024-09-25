package access.ex;

public class Counter {
    private int max;
    private int count;
    public Counter(int max){
        this.max = max;
    }
    public void increment(){
        if(isMax()){
            this.count++;
        }
    }
    public int getCount(){
        return this.count;
    }
    private boolean isMax(){
        if(this.max <= this.count){
            System.out.println("최대값을 초과할 수 없습니다.");
            return false;
        }else{
            return true;
        }
    }
}
