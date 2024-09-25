package hello.hello_spring.controller;

public class MemberForm {
    private String name;

    public String getName() {
        return name;
    }

    //스프링이 알아서 setName을 해준다.
    public void setName(String name) {
        this.name = name;
    }
}
