fun main(){
    //นี่คือ Hippo ของฉัน
    var myhippo = Hippo()
    myhippo.eat()
    myhippo.roam()
    myhippo.makeNoise()
    myhippo.sleep()

    //สร้างแมวของเรา
    var mycat = Cat()
    mycat.eat()
    mycat.roam()
    mycat.makeNoise()
    mycat.sleep()
}

open class Animal {
    open val image = ""
    open val food = ""
    open val habitat =""
    val hunger = 10

    open fun makeNoise () {
        println("The animal is making a noise")
    }

    open fun eat () {
        println("The Animal is eating")
    }

    open fun roam () {
        println("The Animal is roaming")
    }

    fun sleep () {
        println("The Animal is sleeping")
    }
}

class Hippo : Animal() {
    //สร้างคลาส Hippo แต่ยังไม่ได้ทำอะไร
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Geunt!")
}

    override fun eat() {
        print("The Hippo is eating $food")
        }
}

class Cat : Animal() {
    override val image = "cat.jpg"
    override val food = "หนู"
    override val habitat = "บ้าน"

    override fun makeNoise() {
        println("Meow! Meow!")
}

    override fun eat() {
        print("The cat is eating $food")
    }
}