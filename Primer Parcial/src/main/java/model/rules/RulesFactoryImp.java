package model.rules;

class RulesFactoryImp implements RulesFactory {

    public Rule getRule(String string)
    {
        // RulesFactory
        if (string.startsWith(UpperRule.KEY)) {
            return new UpperRule();
        } else if (string.startsWith(VowelsRule.KEY)) {
           return new VowelsRule();
        } else if (string.startsWith(ENrule.KEY)) {
            return new ENrule();
        } else if (string.equals(EndRule.KEY)){
            return new EndRule();
        } else {
            return new NoRule();
        }
    }
}
