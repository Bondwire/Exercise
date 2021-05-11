package zjava.dzien1.TestThis;

//To make this @Test method pass, we have to create a new constructor in User, this time a
//constructor which takes two parameters, the username and password we want to assign to
//the User. This constructor is shown below:
//public User(String username, String password) {
//this.username = username;
//this.password = password;
//}
//Note that the constructor now has two parameters: String username and String
//password.
//Because these parameters have the same name as the fields, I have to use the this
//keyword in the method, when I want to access the username and password field on the
//current object. If I did not add this. then Java would not be able to distinguish between
//the field and the parameter.

public class KlasaMain02 {
    private String IBU;
    private double percentage;

    public void setPercentage(double percentage) {
        if ((percentage<0) || (percentage>100 )) {
            System.out.println("nie można ustawić poniżej zera ani powyżej 100");
        }
        else {
            System.out.println("ok");
        }
        this.percentage = percentage;
    }
    public void setIBU(String IBU) {
        this.IBU = IBU;
    }

    // pole IBU będzie dostępne z zewnątrz
    public String getIBU() {
        return ("IBU wynosi :" + this.IBU);
    }
}
