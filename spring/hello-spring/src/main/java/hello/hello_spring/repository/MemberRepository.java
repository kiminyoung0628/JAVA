package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;

import java.util.Optional;
import java.util.List;

public interface MemberRepository {
    Member save(Member member); //save 하면 저장소에 저장이 된다.
    Optional<Member> findById(Long id); //이 저장소에서 Id로 찾거나
    Optional<Member> findByName(String name); //이 저장소에서 Name으로 찾아올 수 있다.
    List<Member> findAll(); //모든 회원 리스트를 반환해준다.
}
