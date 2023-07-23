package org.example.ClassInstagram.Repository;


import org.example.ClassInstagram.Model.Follow;
import org.example.ClassInstagram.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFollowRepo extends JpaRepository<Follow,Integer> {
    List<Follow> findByCurrentUserAndCurrentUserFollower(User targetUser, User follower);
}
