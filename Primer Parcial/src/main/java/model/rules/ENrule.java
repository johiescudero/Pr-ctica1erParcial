package model.rules;

class ENrule implements Rule {

    static final String KEY ="EN";

    public String applyRule(String string){
        string = string.replace(KEY, "")
                .replaceAll("the", "el")
                .replaceAll("cat", "park")
                .replaceAll("is", "está")
                .replaceAll("in", "en")
                .replaceAll("park", "parque")
        ;
        return string;
    }
}
