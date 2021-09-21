class EmailException extends Exception {

  private String message;

  public EmailException(String message) {
    this.message = message;
  }

  public String toString() {
    return this.message;
  }
}

class UserDefinedException {

  public static void main(String[] args) {

      String email = args[0];

      try {
        if (email.indexOf("@") < 0) {
          throw new EmailException("Invalid email ID");
        }
      }
      catch (EmailException e) {
        System.out.println(e);
      }
  }
}
