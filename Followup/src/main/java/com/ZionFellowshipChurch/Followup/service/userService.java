package com.ZionFellowshipChurch.Followup.service;

import com.ZionFellowshipChurch.Followup.ModelClasses.User;
import com.ZionFellowshipChurch.Followup.ModelClasses.followupPerson;
import com.ZionFellowshipChurch.Followup.repository.followUpPersonRepo;
import com.ZionFellowshipChurch.Followup.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Lenovo on 17-03-2020.
 */
@Service
public class userService {

    @Autowired
    private userRepository userRepository;

    @Autowired
    private followUpPersonRepo followUpPersonRepo;

    public User save(User user)
    {

        return userRepository.save(user);
    }



    public List<User> getAllpersons()
    {
        return userRepository.findAll();
    }


    public List<User> getAllPersonsByPersonId(Integer personId)
    {
        return userRepository.findByPersonId(personId);
    }

    public void delete(Long id)
    {
        userRepository.deleteById(id);
    }

    public User update(Long id,User user)
    {
        user.setId(id);
       return userRepository.save(user);
    }



    @Transactional(readOnly = true)
    public List<User> findUsersByCustomer(Integer personId) {
        return (List<User>) userRepository.findByPersonId(personId);
    }

}
