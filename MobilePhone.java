public class MobilePhone {
    String brand,model;
    int price;
    MobilePhone(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    void display(){
        System.out.println("Brand of the mobile is "+this.brand);
        System.out.println("model of the mobile is "+this.model);
        System.out.println("price of the mobile is "+this.price);
    }

    public static void main(String[] args) {
        MobilePhone m=new MobilePhone("Iqoo","Z3",20000);
        m.display();
    }
}
