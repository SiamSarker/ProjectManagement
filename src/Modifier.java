class Modifier{
    void updateId(Product p,
                  String newId){
        p.productId = newId;
    }
    void updatePrice(double curPrice,
                     double newPrice){
        curPrice = newPrice;
    }
    void updateIdV2(Product p,
                    String newId){
        p = new Product(newId, p.price);
    }
    void updatePriceV2(Product p,
                       double newPrice){
        p.price = newPrice;
    }
}