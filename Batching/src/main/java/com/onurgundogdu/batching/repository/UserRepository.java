package com.onurgundogdu.batching.repository;

import com.onurgundogdu.batching.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
