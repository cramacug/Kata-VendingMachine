import Code.*

enum class Product(s: String, a01: Code, d: Double) {
    SMARTY("Smart", A01, 0.60),
    CARAMAC_BAR("Caramac Bar", A02, 0.60),
    DAIRY_MILK("Dairy Milk", A03, 0.65),
    FREDDO("Freddo", A04, 0.25)
}

enum class Coin(value: Double) {
    FIVE_CENTS(.05),
    TEN_CENTS(.10),
    TWENTY_CENTS(.2),
    FIFTY_CENTS(.5),
    DOLLAR(1.0)
}

enum class Code { A01, A02, A03, A04 }

class Item(val product: Product, val quantity: Int)

