import java.util.ArrayList;

class StartupTestDrive {
  
  public static void main(String[] args) {
    
    Startup testStartup = new Startup();
    ArrayList<String> fakeLocation = new ArrayList<String>();
    fakeLocation.add("A0");
    fakeLocation.add("A1");
    fakeLocation.add("A3");
    testStartup.setLocationCells(fakeLocation);
 
    String fakeUserGuess = "A1";
    String result = testStartup.checkYourself(fakeUserGuess);

    if(result.equals("hit")) {
      System.out.println("passed");
    }else { 
      System.out.println("failed");
    }

  }
}
