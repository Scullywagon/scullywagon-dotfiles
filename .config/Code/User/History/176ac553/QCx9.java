public class ChristmasGift 
{
    String name, recipient;
    int price;

    public ChristmasGift(String name, String recipient, int price) {
        this.name = name;
        this.recipient = recipient;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
