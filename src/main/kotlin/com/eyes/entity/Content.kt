package com.eyes.entity

import java.math.BigInteger
import java.util.*
import javax.persistence.*

@Entity
@Table(name="CONTENT")
class Content(
        @Id
        @Column(name="ID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id : Long,
        @Column(name="TYPE")
        val type : String,
        @Column(name="WIDTH")
        val width : Int?,
        @Column(name="HEIGHT")
        val height : Int?,
        @Column(name="DATA")
        val data : String,
        @Column(name="CREATED_DATE")
        val createdDate : Date,
        @Column(name="USER_ID")
        val userId : BigInteger
)