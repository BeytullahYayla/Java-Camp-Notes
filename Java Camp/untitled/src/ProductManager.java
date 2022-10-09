public class ProductManager {
    public void add(Product product){
        ProductValidator productValidator=new ProductValidator();
        if(productValidator.isValid(product)){
            System.out.println("Added");
        }
        else{
            System.out.println("Product Infos is not valid");
        }


    }
}
