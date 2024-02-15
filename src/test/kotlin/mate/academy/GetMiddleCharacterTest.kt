package mate.academy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GetMiddleCharacterTest {

    @Test
    fun getMiddleString_OddLengthString_ReturnsMiddleCharacter() {
        // given
        val input = "hello"

        // when
        val result = getMiddleString(input)

        // then
        assertEquals("l", result)
    }

    @Test
    fun getMiddleString_EvenLengthString_ReturnsMiddleTwoCharacters() {
        // given
        val input = "1234"

        // when
        val result = getMiddleString(input)

        // then
        assertEquals("23", result)
    }

    @Test
    fun getMiddleString_EmptyString_ReturnsEmptyString() {
        // given
        val input = ""

        // when
        val result = getMiddleString(input)

        // then
        assertEquals("", result)
    }

    @Test
    fun getMiddleString_SingleCharacter_ReturnsThatCharacter() {
        // given
        val input = "a"

        // when
        val result = getMiddleString(input)

        // then
        assertEquals("a", result)
    }

    @Test
    fun getMiddleString_SpecialCharacters_ReturnsMiddleCharacters() {
        // given
        val input = "(())"

        // when
        val result = getMiddleString(input)

        // then
        assertEquals("()", result)
    }
}
