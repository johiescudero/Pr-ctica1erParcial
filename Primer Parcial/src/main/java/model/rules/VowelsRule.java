package model.rules;

class VowelsRule implements Rule {

   static final String KEY = "vowels";

    public String applyRule(String string){

        string = string.replace(KEY, "")
                .replaceAll("a", "4")
                .replaceAll("e", "3")
                .replaceAll("i", "1")
                .replaceAll("o", "0")
                .replaceAll("u", "7")
        ;
        return string;
    }
}
