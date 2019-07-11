package com.eyes.webservice

import com.eyes.entity.User
import com.eyes.repository.UserRepository
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController {
    @Autowired
    private val repository: UserRepository? = null

    @RequestMapping(value = "/users", method = [RequestMethod.GET])
    internal fun findAll(): UserResults {
        return UserResults(users=this.repository!!.findAll().toList())
    }
}

class UserResults(var users : List<User>)