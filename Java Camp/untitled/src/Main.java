public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.id=1;
        product.name="Glass";
        product.price=200;

        ProductManager productManager=new ProductManager();
        productManager.add(product);

        //Inner Class
        DatabaseHelper.Connection.CreateConnection();
        DatabaseHelper.Crud.Delete();
    }
}
