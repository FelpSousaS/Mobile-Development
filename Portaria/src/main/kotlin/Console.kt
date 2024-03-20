package org.example

class Console {
    fun readInt(msg: String): Int{
        print(msg)
        val info = readLine()

        if(info != null && info != ""){
            return info.toInt()
        }

        return 0
    }
}