package com.eyes.webservice

import com.eyes.entity.Content
import com.eyes.entity.User
import com.eyes.repository.ContentRepository
import com.eyes.repository.UserRepository
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RestController
import java.math.BigInteger


@RestController
class ContentController {
    @Autowired
    private val repository: ContentRepository? = null

    @RequestMapping(value = "/content", method = [RequestMethod.GET])
    internal fun findAll(@RequestParam(required = true) userId: BigInteger): ContentResults {
        return ContentResults(content=this.repository!!.findByUserId(userId=userId))
    }
}

class ContentResults(var content : List<Content>)