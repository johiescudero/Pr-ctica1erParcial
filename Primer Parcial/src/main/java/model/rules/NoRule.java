package model.rules;

class NoRule implements Rule {

    public String applyRule(String string){

        return "No rule " +string;
    }
}
