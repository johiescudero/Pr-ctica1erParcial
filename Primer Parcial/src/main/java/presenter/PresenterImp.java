package presenter;

import model.Model;

import view.Terminal;

import java.util.List;

class PresenterImp implements Presenter {

  private Terminal view;
  private Model model;


  public void setView(Terminal view){
    this.view = view;
  }

  public void setModel(Model model){
    this.model = model;
  }

  public void updateView(List<String> List) {
    view.onStringsUpdated(List);
  }

  public void addString(String string) {

    model.addString(string);
  }


}
