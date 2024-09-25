package jpabook.jpashop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.ArrayList;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String name;

    @Embedded
    private Address address;

    @JsonIgnore //OrderSimpleApiController 에서 Order와
                //연결된 곳은 무한루프를 막기위해 끊어줘야 함
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
