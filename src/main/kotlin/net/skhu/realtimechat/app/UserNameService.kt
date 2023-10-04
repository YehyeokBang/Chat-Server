package net.skhu.realtimechat.app

import org.springframework.stereotype.Service

@Service
class UserNameService(
    private val userNameList: MutableList<String> = mutableListOf()
) {

    fun isUserNameDuplicated(userName: String): Boolean {
        return if (userNameList.contains(userName)) {
            true
        } else {
            userNameList.add(userName)
            false
        }
    }

}