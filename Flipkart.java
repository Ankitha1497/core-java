class Flipkart {

  public boolean login(String email, String password) {
    System.out.println("Login using email: " + email + " password: " + password);

    String regEmail = "Ankit@gmail.com";
    String regPassword = "Ankit@123";

    return email.equals(regEmail) && password.equals(regPassword);
  }

  public String login(long phone, int otp) {
    System.out.println("Login using phone: " + phone + " otp: " + otp);

    if (phone == 9876543210L;int regotp=7666) {
      return "Login Successful";
    }
    return "Login Failed";
  }

  public String search(String product) {
    return "Product available: " + product;
  }

  public String search(String product, String brand) {
    return product + " of brand " + brand + " available";
  }

  public String search(String product, String brand, int price) {
    return product + " under price " + price + " available";
  }
}