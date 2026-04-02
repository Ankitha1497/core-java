class FlipkartRunner {
  public static void main(String[] args) {

    Flipkart f = new Flipkart();

    System.out.println(f.login("Ankit@gmail.com", "Ankit@123"));
    System.out.println(f.login(9876543210L, 7666));

    System.out.println(f.search("Laptop"));
    System.out.println(f.search("Laptop", "HP"));
    System.out.println(f.search("Laptop", "HP", 50000));
  }
}