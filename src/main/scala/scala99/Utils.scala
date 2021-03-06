package scala99

object Utils {
    def elapsedTime[R](block: => R): (Long, R) = {
        val s = System.nanoTime()
        val result = block
        val e = System.nanoTime()
        (e - s, result)
    }

    def toStringOrNull(o: Object): Any =
        if (o == null)
            null
        else
            o.toString
}
