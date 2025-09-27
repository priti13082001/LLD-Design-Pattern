
 class Marker{
     String name;
     String color;
     int price;
     int year;
      public Marker(String name,String color,int price, int year){
        this.name=name;
        this.color=color;
        this.price=price;
        this.year=year;
      }

}
 class Invoice{
    private Marker marker;
    private int quantity;
    private int total;
    
    public Invoice(Marker marker,int quantity){
         this.marker=marker;
         this.quantity=quantity;

    }
    public void calculateTotal(){
        System.out.println("Calculating total:");
        this.total=this.marker.price*this.quantity;
         System.out.println("Calculating total:"+ this.total);
    }


 }
 class InvoiceDao{
    Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice=invoice;
    }
    public void saveToDb(){
        System.out.println("invoice is saved into db");
    }
 }
public class SingleResponsibilityPrinciple{
      public static void main(String[] args){
         System.out.println("first SingleResponsibility Principle");
         Invoice invoice =new Invoice(new Marker("name","color",10,2001),10);
         InvoiceDao invoiceDao=new InvoiceDao(invoice);
         invoice.calculateTotal();
         invoiceDao.saveToDb();
      }

   

}