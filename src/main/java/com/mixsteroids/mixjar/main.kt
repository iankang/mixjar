package com.mixsteroids.mixjar

import com.mixsteroids.mixjar.network.Network
import com.mixsteroids.mixjar.services.MixCloudServiceImpl

fun main(){
    val mixCloudServiceImpl = MixCloudServiceImpl()
//    mixCloudServiceImpl.getShow("spartacus","party-time")
    mixCloudServiceImpl.getUser("spartacus")
}