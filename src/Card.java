public class Card {
    private String card_name;
    String user_full_name;
    String address;
    String phone_number;
    int cvv;
    double balance;

    Card(){}

    Card(String card_name,String user_full_name,String address,String phone_number,int cvv,double balance){
        this.card_name = card_name;
        this.user_full_name = user_full_name;
        this.address = address;
        this.phone_number = phone_number;
        this.cvv = cvv;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return card_name+"\n"+user_full_name+" "+address+" "+phone_number+"\n"+cvv+" "+balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getCard_name(){
        return card_name;
    }

    public static boolean makePayment(Card card, double money){

        if(card.card_name.equals("PayPal"))
           return PaypalAPI.makePayment(card,money);

        else
           return StripeAPI.makePayment(card,money);
    }
}
