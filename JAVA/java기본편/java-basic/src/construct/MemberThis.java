package construct;

public class MemberThis {
    String nameField;
    void initMember(String nameParameter){
        nameField = nameParameter; //이런 경우에는 앞에 this가 생략
    }
}
