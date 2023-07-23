package org.example.ClassInstagram.Repository;

import org.example.ClassInstagram.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Integer> {
}
