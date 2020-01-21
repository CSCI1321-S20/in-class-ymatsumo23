package graphics

object Game {
    def main(args: Array[String]): Unit = {
        println("Game running!")

        val e1 = new Entity(0, 0)
        val e2 = new Entity(5, 3)

        print(e1.intersects(e2))
        print(e2.intersects(e1))
    }
}