// https://exercism.org/tracks/kotlin/exercises/scrabble-score

object ScrabbleScore {
    private val lettersByValue = mapOf(
        1 to listOf('A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'),
        2 to listOf('D', 'G'),
        3 to listOf('B', 'C', 'M', 'P'),
        4 to listOf('F', 'H', 'V', 'W', 'Y'),
        5 to listOf('K'),
        8 to listOf('J', 'X'),
        10 to listOf('Q', 'Z'),
    )

    private val valueByLetter: MutableMap<Char, Int> = mutableMapOf()

    fun scoreLetter(c: Char): Int {
        if (valueByLetter.isEmpty()) {
            createValueByLetterMap()
        }

        return valueByLetter.getOrElse(c.uppercaseChar()) { 0 }
    }

    fun scoreWord(word: String): Int {
        if (valueByLetter.isEmpty()) {
            createValueByLetterMap()
        }

        return word.sumOf {
            scoreLetter(it)
        }
    }

    private fun createValueByLetterMap() {
        lettersByValue.forEach { lettersByValue ->
            lettersByValue.value.forEach { letter ->
                valueByLetter[letter] = lettersByValue.key
            }
        }
    }
}