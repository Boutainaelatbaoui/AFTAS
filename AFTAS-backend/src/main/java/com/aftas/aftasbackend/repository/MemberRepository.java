package com.aftas.aftasbackend.repository;

import com.aftas.aftasbackend.model.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    boolean existsByName(String name);

    @Query("SELECT MAX(m.num) FROM Member m")
    Optional<Integer> findMaxNum();
    boolean existsByFamilyName(String familyName);
    boolean existsByIdentityNumber(String identityNumber);
}

