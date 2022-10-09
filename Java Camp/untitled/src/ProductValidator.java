public class ProductValidator {//Main class cant be a static class in java
    static {
        System.out.println("Static contructor method is executed");
    }

    public ProductValidator(){
        System.out.println("Constructor method is executed");
    }
    public static boolean isValid(Product product){


        if (product.price>0&&!product.name.isEmpty()){
            return true;

        }
        else {
            return false;
        }

    }
    public static class AnotherClass{//Inner class
        public static void Delete(){

        }
    }
}
