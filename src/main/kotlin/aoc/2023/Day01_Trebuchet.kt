https://adventofcode.com/2023/day/1

val intForWord = mapOf(
	"1" to 1,
    "2" to 2,
    "3" to 3,
    "4" to 4,
    "5" to 5,
    "6" to 6,
    "7" to 7,
    "8" to 8,
    "9" to 9,
    "one" to 1,
    "two" to 2,
    "three" to 3,
    "four" to 4,
    "five" to 5,
    "six" to 6,
    "seven" to 7,
    "eight" to 8,
    "nine" to 9,
)

fun main(input: Array<String>) {
    var sumPart1 = 0
    var sumPart2 = 0

    for (line in input) {
        sumPart1 += 10 * findFirstDigit(line) + findLastDigit(line)
		sumPart2 += 10 * findFirstAlphanumericDigit(line) + findLastAlphanumericDigit(line)
    }

    println("Part 1: " + sumPart1)
    println("Part 2: " + sumPart2)
}

fun findFirstDigit(string: String): Int {
    return getFirstDigit(string)
}

fun findLastDigit(string: String): Int {
    return getFirstDigit(string.reversed())
}

fun getFirstDigit(string: String): Int {
    for (char in string.iterator()) {
        val intOrNull = char.toString().toIntOrNull()
        
        if (intOrNull != null) {
            return intOrNull
        }
    }
    
    return 0
}

fun findFirstAlphanumericDigit(string: String): Int {
    val regex = getRegexFor(intForWord.keys)
    val value = regex.find(string)?.value
    
    return intForWord.getOrDefault(value, 0)
}

fun findLastAlphanumericDigit(string: String): Int {
    val reversedAlphanumericDigits = intForWord.keys.map { it.reversed() }
    
    val regex = getRegexFor(reversedAlphanumericDigits)
    val reversedValue = regex.find(string.reversed())?.value
   
    return intForWord.getOrDefault(reversedValue?.reversed(), 0)
}

fun getRegexFor(searchTerms: Collection<String>): Regex {
    val pattern = "(" + searchTerms.joinToString("|") + ")"
    
    return Regex(pattern)
}
