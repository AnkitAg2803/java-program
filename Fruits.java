public class Fruits {
    String Name;
    int price;
   
    public Fruits(String Name, int price) {
        this.Name = Name;
        this.price = price;
    }
    public static void main(String args[]) {
        Fruits f1 = new Fruits("Apple", 120);
        Fruits f2 = new Fruits("banana", 60);
        Fruits f3 = new Fruits("Watermelon", 45);
        Fruits f4 = new Fruits("Muskmelon", 90);
        Fruits f5= new Fruits("Papaya", 75);
        System.out.println(f1.Name);
        System.out.println(f1.price);
        System.out.println(f2.Name);
        System.out.println(f2.price);
        System.out.println(f3.Name);
        System.out.println(f3.price); 
        System.out.println(f4.Name);
        System.out.println(f4.price); 
        System.out.println(f5.Name);
        System.out.println(f5.price); 

    }
}
