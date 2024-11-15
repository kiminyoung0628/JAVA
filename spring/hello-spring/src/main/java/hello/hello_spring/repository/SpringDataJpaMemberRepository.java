package hello.hello_spring.repository;

import hello.hello_spring.domain.Member;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.Optional;
import java.util.function.Function;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>,
        MemberRepository {
    @Override
    Optional<Member> findByName(String name);
}
