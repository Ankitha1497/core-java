class Ajio {

  public boolean login(String email, String password) {
    return email.equals("Ajio@gmail.com") && password.equals("Ajio@123");
  }

  public String login(long phone, int otp) {
    if (phone == 1234509876L && otp == 1234) {
      return "Login Success";
    }
    return "Login Failed";
  }

  public String search(String product) {
    return "Available: " + product;
  }

  public String search(String product, String color) {
    return product + " in color " + color + " available";
  }

  public String search(String product, String color, int price) {
    return product + " under " + price + " available";
  }
}