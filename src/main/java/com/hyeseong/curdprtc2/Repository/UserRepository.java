package com.hyeseong.curdprtc2.Repository;

import com.hyeseong.curdprtc2.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
