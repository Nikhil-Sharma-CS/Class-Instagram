package org.example.ClassInstagram.Repository;


import org.example.ClassInstagram.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}
