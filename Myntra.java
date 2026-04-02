class Myntra {

  public boolean login(String username, String password) {
    System.out.println("Login using username: " + username);

    return username.equals("Manu") && password.equals("Manu@123");
  }

  public String login(long phone, int otp) {
    if (phone == 7865905678L && otp == 2233) {
      return "Login Successful";
    }
    return "Login Failed";
  }

  public String search(String item) {
    return "Item available: " + item;
  }

  public String search(String item, String brand) {
    return item + " " + brand + " available";
  }

  public String search(String item, String brand, String size) {
    return item + " size " + size + " available";
  }
}