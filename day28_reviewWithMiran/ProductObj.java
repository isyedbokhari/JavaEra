package day28_reviewWithMiran;

public class ProductObj {

	public static void main(String[] args) {
		
Product iphone = new Product();
        
        iphone.name = "Iphone 14";
        iphone.price = 1200;
        iphone.quantity = 5;
        iphone.serialNumber = 83947;
        
        iphone.getProductDetails();
        iphone.decreaseQuantity(2);
        System.out.println("------------------------");
        iphone.getProductDetails();
        iphone.decreaseQuantity(8);
        System.out.println("------------------------");
        iphone.getProductDetails();
        
        
        System.out.println("------------------------");

        Product product2 = new Product("Apple Watch", 600, 394397, 9);
        
        product2.getProductDetails();
        
        System.out.println("------------------------");

        Product product3 = new Product("Galaxy", 1100,394734, 20);
        
        System.out.println("TOTAL PRICE: " + product3.calculateTotalPrice());
        System.out.println("isAvailable: " + product3.isAvailable());
        
        Product product4 = new Product("Macbook pro", 1100,394434, 0);
        System.out.println("isAvailable: " + product4.isAvailable());

        Product products[] = new Product[4];
        products[0] = iphone;
        products[1] = product2;
        products[2] = product3;
        products[3] = product4;
        
        
        for(int i = 0; i < products.length; i++) {
            System.out.println("Array Product :" + (i+1)+": ");
            products[i].getProductDetails();
            System.out.println();
        }

    }
		
		
		
	

}
