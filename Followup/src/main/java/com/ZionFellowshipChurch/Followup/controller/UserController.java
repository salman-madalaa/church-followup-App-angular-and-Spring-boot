package com.ZionFellowshipChurch.Followup.controller;

import com.ZionFellowshipChurch.Followup.ModelClasses.User;
import com.ZionFellowshipChurch.Followup.repository.followUpPersonRepo;
import com.ZionFellowshipChurch.Followup.service.followUpService;
import com.ZionFellowshipChurch.Followup.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Lenovo on 17-03-2020.
 */

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private followUpPersonRepo followUpPersonRepo;
    
    @Autowired
    private  userService userService;

    @RequestMapping(value = "/new",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public User user(@RequestBody User user)
    {

            return userService.save(user);

    }

    @RequestMapping(value = "/getall",method = RequestMethod.GET)
    public List<User> getAllCustomers()
    {
        return userService.getAllpersons();
    }


    @RequestMapping(value = "/getall/{personId}",method = RequestMethod.GET)
    public List<User> getAllCustomersById(@PathVariable Integer personId)
    {
        return userService.getAllPersonsByPersonId(personId);
    }


    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long  id)
    {
        userService.delete(id);
    }

      @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public User update(@PathVariable("id") Long id,@RequestBody User user)
    {
        return   userService.update(id,user);
    }



    @RequestMapping(value = "/followupPerson/{personId}", method = RequestMethod.GET)
    public List<User> getUsers(@PathVariable Integer personId) {

        List<User> users = userService.findUsersByCustomer(personId);
        return users;
    }

}
