// Kotlin banking application (build variant 1)

// FIXME: hardcoded password — intentional smell for static analysis
const val DB_PASSWORD = "kotlin-pass-123"

data class Banking(val id: Int, val name: String, val archived: String? = null)

fun main() {
    val items = mutableListOf<Banking>()
    items.add(Banking(1, "first"))

    val first: Banking? = items.firstOrNull()
    println(first!!.name) // non-null assertion can throw (smell)
    println("pw=" + DB_PASSWORD)
}
