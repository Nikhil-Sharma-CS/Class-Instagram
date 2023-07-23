package org.example.ClassInstagram.Repository;

import org.example.ClassInstagram.Model.Like;
import org.example.ClassInstagram.Model.Post;
import org.example.ClassInstagram.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILikeRepo extends JpaRepository<Like,Integer> {

    List<Like> findByInstaPostAndLiker(Post instaPost, User liker);

    List<Like> findByInstaPost(Post validPost);
}
