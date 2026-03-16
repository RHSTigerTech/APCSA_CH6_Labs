package Shopping;

// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
  private ShoppingCart cart;

  @BeforeEach
  public void setUp() {
    cart = new ShoppingCart();
  }

  @Test
  public void testConstructor() {
    assertEquals(0.0, cart.getTotalPrice(), 0.01);
    // Assuming cart is private, we can't directly test size, but we can test
    // behavior
  }

  @Test
  public void testAddToCart() {
    Item item1 = new Item("milk", 3.56, 2);
    cart.addToCart(item1);
    assertEquals(7.12, cart.getTotalPrice(), 0.01);

    Item item2 = new Item("donuts", 0.47, 12);
    cart.addToCart(item2);
    assertEquals(12.76, cart.getTotalPrice(), 0.01);
  }

  @Test
  public void testGetTotalPrice() {
    assertEquals(0.0, cart.getTotalPrice(), 0.01);
    Item item = new Item("bread", 4.24, 1);
    cart.addToCart(item);
    assertEquals(4.24, cart.getTotalPrice(), 0.01);
  }

  @Test
    public void testMultipleItems() {
        cart.addToCart(new Item("milk", 3.56, 2));
        cart.addToCart(new Item("donuts", 0.47, 12));
        cart.addToCart(new Item("bread", 4.24, 1));
        cart.addToCart(new Item("oranges", 0.62, 5));
        assertEquals(20.10, cart.getTotalPrice(), 0.01);
    }
}