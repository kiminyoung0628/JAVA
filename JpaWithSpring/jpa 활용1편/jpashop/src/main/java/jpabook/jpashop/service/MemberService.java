package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepositoryOld;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
//JPA는 웬만하면 트랜잭션 안에서 실행돼야함 -> spring이 제공하는 트랜잭션
//readOnly를 true로 두면 조금 더 성능이 최적화 된다.(이것을 넣으면 변경은 안된다.)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepositoryOld memberRepositoryOld;
    /*
    * 회원가입
    */
    @Transactional //변경
    public Long join(Member member){
        validateDuplicateMember(member);
        memberRepositoryOld.save(member);
        return member.getId();

    }
    private void validateDuplicateMember(Member member){
        List<Member> findMembers =
                memberRepositoryOld.findByName(member.getName());
        if(!findMembers.isEmpty()){
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }
    /*
    * 회원 수정
    */
    @Transactional
    public void update(Long id, String name){
        Member member = memberRepositoryOld.findOne(id);
        member.setName(name);
    }

    /*
    * 전체 회원 조회
     */
    public List<Member> findMembers(){
        return memberRepositoryOld.findAll();
    }
    public Member findOne(Long memberId){
        return memberRepositoryOld.findOne(memberId);
    }

}
