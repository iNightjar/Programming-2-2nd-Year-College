package programming2;

public class overrideVSoverloading {
    public static void main(String[] args) {
        //detectobject(new a());
        m(new graduate());
        m(new student());
        m(new person());
        m(new Object());

    }
    public static void m(Object x)
    {
        System.out.println(x.toString());
    }
    /*public static void detectobject(b object)
    {
        object.p();
    }*/
}
class graduate extends student{

}
class student extends person{
    @Override
    public  String toString()
    {
        return "student";
    }
}
class person{
    @Override
    public  String toString()
    {
        return "person";
    }
}

/*
    class b {
        public void p() {
            System.out.println("b class");
        }
    }

    class a extends b {
        //@Override
        public void p()
        {
            System.out.println("a class");
        }
    }*/