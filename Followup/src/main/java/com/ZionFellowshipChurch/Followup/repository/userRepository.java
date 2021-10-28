package com.ZionFellowshipChurch.Followup.repository;

import com.ZionFellowshipChurch.Followup.ModelClasses.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lenovo on 17-03-2020.
 */
@Repository
public interface userRepository extends JpaRepository<User,Long> {

    List<User> findByPersonId(Integer personId);

}
