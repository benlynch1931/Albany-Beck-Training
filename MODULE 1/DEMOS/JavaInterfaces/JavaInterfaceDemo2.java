interface Bridge {

  // These methods are abstract AND public by default
  void designService();
  void constructionService();

}

abstract class Architect implements Bridge {

  @Override
  public void designService() {
    System.out.println("Design in Progress.......");
  }

}

class ConstructionCrew extends Architect {

  @Override
  public void constructionService() {
    System.out.println("Construction in Progress.......");
  }
}


public class JavaInterfaceDemo2 {

  public static void main(String[] args) {
    ConstructionCrew c1 = new ConstructionCrew();

    c1.designService();
    c1.constructionService();
  }
}
