package programming2;
import javax.swing.JOptionPane;
public class recursion {
    public static void main(String[]args)
    {
        String intstring = JOptionPane.showInputDialog(
          "Please enter a  non-negative number:"
        );
        int n = Integer.parseInt(intstring);
        JOptionPane.showMessageDialog(null, "factorial of " + n + " is " + factorial(n));
    }
    static long factorial(int n)
    {
        if (n==0 ) return 1;
        else
            return n * factorial(n-1);
    }
}
