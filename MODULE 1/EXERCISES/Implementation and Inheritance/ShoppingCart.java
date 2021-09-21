interface Printable {
  void printItem(String message);
}
interface Returnable {
  void returnItem();
}

// ------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------

class Item {

  private double price;
  private String productName;
  private String productCategory;
  private int productNo;
  private boolean printedOn;

  Item(int productNo, double price) {

    this.productNo = productNo;
    this.price = price;
    this.printedOn = false;

    // Find item name using productNo -> i.e. Database
    this.productName = "Polo Shirt";
  }

  Item(int productNo, double price, String productCategory) {

    this.productNo = productNo;
    this.price = price;
    if ((this.productNo != 718201) & (this.productNo != 718200)) {
      this.printedOn = false;
    }

    this.productCategory = productCategory;
  }

  public void setPrintedOn(boolean bool) {
    this.printedOn = bool;
  }

  public boolean getPrintedOn() {
    return this.printedOn;
  }

  public String getProductCategory() {
    return this.productCategory;
  }

}

// ------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------

class Shirt extends Item implements Printable, Returnable {
  private String size;

  Shirt (int productNo, double price, String size) {
    super(productNo, price);
    this.size = size;

  }

  @Override
  public void printItem(String message) {
    setPrintedOn(true);
    System.out.println(String.format("Printing '%s' on item...", message));
  }

  @Override
  public void returnItem() {
    if (getPrintedOn() == true) {
      System.out.println("Cannot return item that has been printed on...");
    }
    else {
      System.out.println("Item returned! Refund processed within 3-5 days.");
    }
  }
}

// ------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------

class Jeans extends Item implements Returnable {

  private int waist;
  private int leg;

  Jeans(int productNo, double price, int waist, int leg) {
    super(productNo, price, "Jeans");

    this.waist = waist;
    this.leg = leg;
  }

  @Override
  public void returnItem() {
    System.out.println(String.format("%s/%s %s returned! Refund processed within 3-5 days.", this.waist, this.leg, getProductCategory()));
  }

}

// ------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------------------------

class ShoppingCart {

  public static void main(String[] args) {

    Shirt redShirt = new Shirt(413098, 9.99, "XS");
    Shirt bluePolo = new Shirt(413101, 12.99, "XS");
    Jeans blackJeans = new Jeans(718200, 21.99, 28, 28);
    Jeans blueJeans = new Jeans(718201, 21.99, 30, 32);


    redShirt.printItem("Coding is Cool");
    redShirt.returnItem();

    System.out.println("-------------");

    bluePolo.returnItem();

    System.out.println("-------------");

    blackJeans.returnItem();

    System.out.println("-------------");

    blueJeans.returnItem();

  }

}
