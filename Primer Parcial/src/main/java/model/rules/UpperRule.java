package model.rules;

class UpperRule implements Rule {

   static final String KEY ="upper";

    public String applyRule(String string){

        return string.replace(KEY, "").toUpperCase();
    }
}
