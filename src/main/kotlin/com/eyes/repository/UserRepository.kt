package com.eyes.repository

import com.eyes.entity.Content
import com.eyes.entity.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.math.BigInteger

@Repository
interface UserRepository : CrudRepository<User, Long> {


}

@Repository
interface ContentRepository : CrudRepository<Content, Long> {
    fun findByUserId(userId : BigInteger) : List<Content>
}