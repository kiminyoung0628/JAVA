package object.equals;

public class UserV2 {
    private String id;
    public UserV2(String id){
        this.id = id;
    }
    @Override
    public boolean equals(Object obj){
        UserV2 user = (UserV2) obj; //다운 캐스팅
        return id.equals(user.id);
    }
}
