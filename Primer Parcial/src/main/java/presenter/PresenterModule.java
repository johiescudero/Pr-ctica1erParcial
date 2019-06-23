package presenter;

import model.Model;
import model.ModelModule;
import view.Terminal;
import view.TerminalModule;

public class PresenterModule {

    private static PresenterModule instance = null;

    private PresenterModule(){
    }

    public static PresenterModule getInstance(){
        if (instance==null)
            instance= new PresenterModule();
        return instance;
    }

    public Presenter getPresenter(){
        PresenterImp presenterImp = new PresenterImp();
        Model modelImp = ModelModule.getInstance().getModel(presenterImp);
        presenterImp.setModel(modelImp);
        Terminal terminalImp = TerminalModule.getInstance().getTerminal(presenterImp);
        presenterImp.setView(terminalImp);
        return presenterImp;
    }
}
