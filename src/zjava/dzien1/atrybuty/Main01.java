package zjava.dzien1.atrybuty;

public class Main01 {

    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.protectedAttribute = "public";
        testAttribute.protectedAttribute = "protected";
   //     testAttribute.privateAttribute = "x"; nie da się go stąd ustawić;
    }
}
