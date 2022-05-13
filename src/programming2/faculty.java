package programming2;
// constructor invoking
public class faculty extends employee{
    public faculty()
    {
        print();
    }
    public static void main(String[] args) {
        new faculty();
    }
    @Override
    public void print()
    {
        System.out.println("faculty class");
    }
}
/*class employee extends person{
    public employee(){
        this("2-employee everloaded constractor");
        System.out.println("3-employee");
        }
        public employee(String s)
        {
            System.out.println(s);
        }
}
class person{
    public person(){
        System.out.println("1-person class");
    }
}*/
class employee{
    public void print()
    {
        System.out.println("employee class");
    }
}