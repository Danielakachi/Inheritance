



// Here inheritance(base class) inherits form calculation(super class)
// both the addition and subtraction

class calculation{
    int z;

    public void addition(int x, int y) {
        z=x+y;
        System.out.println("The sum of the given numbers: "+z);
    }

    public void Subtraction(int x, int y) {
        z=x-y;
        System.out.println("The difference between the given numbers: "+z);
    }
}


 public class inheritance extends calculation{
    public void multiplication(int x,int y){
        System.out.println("The product of the given numbers:"+z);
    }
    
    public static void main(String[] args) 
    {
     int a=3; int b=5;   
        inheritance i=new inheritance();
        i.addition(a, b);
        i.Subtraction(a,b);
        i.multiplication(a,b);
        
    }
}