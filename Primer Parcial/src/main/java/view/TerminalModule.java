package view;
import presenter.Presenter;

public class TerminalModule {

    private static TerminalModule instance = null;

    private TerminalModule(){}

    public static TerminalModule getInstance(){
        if (instance==null)
            instance= new TerminalModule();
        return instance;
    }

    public Terminal getTerminal(Presenter presenter)
    {
        return new TerminalImp(presenter);
    }
}
