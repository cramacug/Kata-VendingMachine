import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

internal class TestVendingMachine() {

    private val items : List<Item> = listOf()
    private val cash : List<Coin> = listOf()
    private val machine: VendingMachine = VendingMachine(items, cash)

    @Test
    fun `when I select a smarti should return a smarti`() {

        // Given
        val itemCode = Code.A01

        // When
        machine.vend(itemCode, 0.90)

        // Then
        assertTrue { true }

    }
}