package com.deshan.fullstackbackend.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.deshan.fullstackbackend.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    
}
