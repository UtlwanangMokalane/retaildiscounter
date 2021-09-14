package bean;

public class User {

    private double total_buying_amount;
    private String user_type;
    private double discount;
    //private double total_dollarbill;

    public double getTotal_buying_amount() {
        return total_buying_amount;
    }

    public void setTotal_buying_amount(double total_buying_amount) {
        this.total_buying_amount = total_buying_amount;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public double FindDiscount(){

        double finaldiscount = 0;
        double perdollar = total_buying_amount / 100;

        if(user_type == "employee"){

            finaldiscount = perdollar * 30;

        } else if(user_type == "customer"){

            finaldiscount = perdollar * 15;

        }else{

            finaldiscount = perdollar * 5;
        }

        return finaldiscount;
    }
}
