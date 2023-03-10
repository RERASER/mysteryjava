package icu.samnyan.aqua.sega.maimai2.dao.userdata;

import icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail;
import icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author samnyan (privateamusement@protonmail.com)
 */
@Repository("Maimai2UserFriendSeasonRankingRepository")
public interface UserFriendSeasonRankingRepository extends JpaRepository<UserFriendSeasonRanking, Long> {

    List<UserFriendSeasonRanking> findByUser_Card_ExtId(long userId);

    Optional<UserFriendSeasonRanking> findByUserAndSeasonId(UserDetail user, int seasonId);

    Page<UserFriendSeasonRanking> findByUser_Card_ExtId(long userId, Pageable page);

    @Transactional
    void deleteByUser(UserDetail user);
}
