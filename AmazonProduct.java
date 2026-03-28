class AmazonProduct
{
    static String productNames[] = {
        "HP Pavilion Laptop",
        "Apple iPhone 13",
        "OnePlus Nord CE 3",
        "LG Washing Machine",
        "Sony Bluetooth Speaker",
        "Mi Smart Watch",
        "Canon DSLR Camera"
    };

    static float productPrice[] = {
        65999.5f, 58999.9f, 24999.0f, 32999.8f, 8999.5f, 4999.9f, 74999.0f
    };

    static double productRatings[] = {
        4.5, 4.7, 4.4, 4.3, 4.6, 4.2, 4.8
    };

    public static void getAmazonProductDetails()
    {
        for(int i = 0; i < productNames.length; i++)
        {
            System.out.println("Product Name : " + productNames[i]);
            System.out.println("Product Price : " + productPrice[i]);
            System.out.println("Product Rating : " + productRatings[i]);
            System.out.println();
        }
    }
}