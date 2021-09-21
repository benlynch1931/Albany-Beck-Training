class FindExceptionType1 {

  public static void main(String[] args) {

    // throw new ArithmeticException("DIVIDE by ZERO");

    try {
      throw new ClassNotFoundException();
    }
    catch(ClassNotFoundException ce) {

    }
  }
}

// Delaying the exception -> Don't have the resources
// Manager: "Do this, if you can't, let me know"

class FindExceptionType2 {

  public static void main(String[] args) {

    try {
      process(); // Caller
    }
    catch(Exception e) {

    }

  }

  public static void process() throws ClassNotFoundException, FileNotFoundException { // Listener

      throw new ClassNotFoundException(); // I'm not handling this, I'm passing it back to the caller

  }
}
