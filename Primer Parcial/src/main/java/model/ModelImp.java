package model;
import model.rules.Rule;
import model.rules.RulesFactory;
import presenter.Presenter;

import java.util.ArrayList;
import java.util.List;

class ModelImp implements Model{

  private final RulesFactory rulesFactory;
  private final Logger logger;

  private Presenter presenter;

  public static  List<String> List = new ArrayList<>();

  public ModelImp(Presenter presenter, RulesFactory rulesFactory, Logger logger) {
    this.presenter = presenter;
    this.rulesFactory = rulesFactory;
    this.logger = logger;
   }


  public void addString(String string) {

    string = applyRule(string);

    logger.logString(string);

    addStringToList(string);

    notifyListener(string);
  }

  private String applyRule(String string){
        Rule regla = rulesFactory.getRule(string);
        return regla.applyRule(string);
  }

  private void addStringToList(String string){

    List.add(string);
  }

   private void notifyListener(String string){
    presenter.updateView(List);
  }


}
