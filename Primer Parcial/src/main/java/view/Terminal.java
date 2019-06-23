package view;

import java.util.List;

public interface Terminal  {

    void getInputs();

    void onStringsUpdated(List<String> list);
}
