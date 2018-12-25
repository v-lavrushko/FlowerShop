public class DecoratedCart implements ShoppingCart {
    public ShoppingCart cart;

    public DecoratedCart(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public Bouquet chooseBouquet(String input){
        return this.cart.chooseBouquet(input);
    }
}
