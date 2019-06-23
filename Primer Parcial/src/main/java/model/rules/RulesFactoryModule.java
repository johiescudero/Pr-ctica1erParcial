package model.rules;

public class RulesFactoryModule {

    private static RulesFactoryModule instance;
    private RulesFactoryImp rulesFactoryImp;
    private RulesFactoryModule(){
        rulesFactoryImp = new RulesFactoryImp();
    }

    public static RulesFactoryModule getInstance(){
        if (instance==null)
            instance = new RulesFactoryModule();
        return instance;
    }

    public RulesFactory getRulesFactory(){
        return rulesFactoryImp;
    }
}
