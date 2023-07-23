package org.example.ClassInstagram.Repository;


import org.example.ClassInstagram.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<Comment,Integer> {
}
