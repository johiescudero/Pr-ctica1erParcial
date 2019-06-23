package model;

import model.rules.RulesFactoryModule;
import presenter.Presenter;

public class ModelModule {

    private static ModelModule instance = null;


    private ModelModule(){

    }

    public static ModelModule getInstance() {
        if (instance == null) {
            instance = new ModelModule();
        }
        return instance;
    }
    public Model getModel(Presenter presenter){

        return new ModelImp(presenter,
                            RulesFactoryModule.getInstance().getRulesFactory(),
                            new LoggerImp());
    }

}
