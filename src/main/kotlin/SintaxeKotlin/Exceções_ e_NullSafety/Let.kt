package SintaxeKotlin.`Exceções_ e_NullSafety`

fun main() {
    // let e um if..else disfarçado
    val str: String? = null

    if (str != null){
        str.lowercase()
        str.length
    }

    str?.let {
        it.lowercase()
        it.length
    }
}