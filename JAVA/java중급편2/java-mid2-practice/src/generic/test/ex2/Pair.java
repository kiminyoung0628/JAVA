package generic.test.ex2;

public class Pair <X,Y> {
    private X data1;
    private Y data2;
    public void setFirst(X data1){
        this.data1 = data1;
    }
    public void setSecond(Y data2){
      this.data2 = data2;
    }
    public X getFirst(){
        return data1;
    }
    public Y getSecond(){
        return data2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "data1=" + data1 +
                ", data2=" + data2 +
                '}';
    }
}
