package mate.academy

// implement the `getMiddleString()` function, which takes a string
// and returns middle character (or characters) as a string

fun getMiddleString(originalString: String): String {
    val length = originalString.length

    if (length == 0) {
        return ""
    }

    val startIndex: Int
    val count: Int

    if (length % 2 != 0) {
        startIndex = length / 2
        count = 1
    } else {
        startIndex = (length / 2) - 1
        count = 2
    }

    return originalString.substring(startIndex, startIndex + count)
}


