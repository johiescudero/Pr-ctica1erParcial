import presenter.PresenterModule;
import view.TerminalModule;

public class Main {

  public static void main(String[] args) {

    TerminalModule.getInstance().getTerminal(PresenterModule.getInstance().getPresenter()).getInputs();
  }
}
