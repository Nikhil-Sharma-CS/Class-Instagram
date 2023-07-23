package org.example.ClassInstagram.Repository;


import org.example.ClassInstagram.Model.AuthenticationToken;
import org.example.ClassInstagram.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {


    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);
}
