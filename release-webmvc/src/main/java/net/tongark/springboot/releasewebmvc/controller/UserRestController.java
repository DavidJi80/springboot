package net.tongark.springboot.releasewebmvc.controller;

import net.tongark.springboot.releasewebmvc.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/users")
public class UserRestController {

    @RequestMapping(value = "/default_user",method = RequestMethod.GET)
    public User defaultUser(){
        return new User("您好，David",40);
    }

    @GetMapping("/t?st.html")
    public String uriWithQuestionMark(){
        return "带?的，t?st.html";
    }

    @GetMapping("/{name:[a-z]+}")
    public User uriWithName(@PathVariable String name){
        return new User("您好，"+name,40);
    }

    @PostMapping(path = "/add_user",consumes = "application/json")
    public User addUser(@RequestBody User user){
        return user;
    }

    /**
     * 必须有myParam参数，且必须等于myValue
     *
     * @param petId
     * @return
     */
    @GetMapping(path = "/petp/{petId}", params = "myParam=myValue")
    public User findPet(@PathVariable String petId) {
        return new User("find，"+petId,40);
    }

    /**
     * Headers中必须有myParam参数，且必须等于myValue
     *
     * @param petId
     * @return
     */
    @GetMapping(path = "/peth/{petId}", headers = "myHeader=myValue")
    public User findPetHeaders(@PathVariable String petId) {
        return new User("find，"+petId,40);
    }
}
