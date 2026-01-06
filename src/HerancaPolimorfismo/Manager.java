package HerancaPolimorfismo;

public  non-sealed class Manager  extends  Empoloyee {
    private  String login;
    private String password;
    private double comisson;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComisson() {
        return comisson;
    }

    public void setComisson(double comisson) {
        this.comisson = comisson;
    }

}
