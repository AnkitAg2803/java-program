interface Bank
{  
    float rateOfInterest();  
    }  
    class CBI implements Bank
    {  
    public float rateOfInterest()
    {
        return 8.5f;
    }  
    }  
    class HDFC implements Bank
    {  
    public float rateOfInterest()
    {
        return 9.7f;
    }  
    }  
    class Interface
    {  
    public static void main(String[] args)
    {  
    Bank b=new CBI(); 
    Bank a= new HDFC(); 

    System.out.println("ROI: "+b.rateOfInterest());  
    System.out.println("ROI: "+a.rateOfInterest());
    }
}
