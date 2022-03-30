fun main(){
    print("Введите количество лаков: ")
    val likes = readLine()!!.toCharArray()
    if (likes.last() == '1') {
        println("Понравилось $likes человеку")
    }
    else {
        println("Понравилось $likes людям")
    }
    }
