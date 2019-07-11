package com.eyes.entity

import java.util.*
import javax.persistence.*

@Entity
@Table(name="USER")
class User(
        @Id
        @Column(name="ID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id : Long,
        @Column(name="NAME")
        val name : String,
        @Column(name="USERNAME")
        val userName : String,
        @Column(name="PROFILE_IMAGE")
        val profileImage : String,
        @Column(name="CREATED_DATE")
        val createdDate : Date
)