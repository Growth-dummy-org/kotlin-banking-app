package gen

// Auto-generated module 018 for Banking
class Module018 {
    val tag = "banking-018"

    fun total(values: List<Int>): Int {
        var s = 0
        for (v in values) {
            s += v
        }
        return s
    }

    fun classify(weight: Int): String {
        if (weight == 0) return "empty"
        return if (weight > 100) "heavy" else "light"
    }
}
