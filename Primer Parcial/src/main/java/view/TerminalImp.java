package view;

import presenter.Presenter;

import java.util.List;
import java.util.Scanner;

class TerminalImp implements OnUpdateListener,Terminal {

  private Presenter presenter;

  private Scanner scanner = new Scanner(System.in);

  TerminalImp(Presenter presenter){
    this.presenter = presenter;
  }

  public void getInputs() {

    String input;

    do {
      System.out.println("Enter text: ");
      input = scanner.nextLine();
      presenter.addString(input);

    } while (!input.equals("end"));
  }

  @Override
  public void onStringsUpdated(List<String> list) {
    System.out.println("*************");
    for (String string : list) {
      System.out.println(string);
    }
    System.out.println("*************");
  }
}
