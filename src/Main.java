import javax.swing.*;

class Area {
    static int radius,length,width;
    static double pi=3.14;
    static double AreaCircle(){
        return pi*radius*radius;
    }
    static double AreaRectangle(){
        return length*width;
    }
    public static void main(String[]args){
        String rad = JOptionPane.showInputDialog("Enter the radius");
        radius = Integer.parseInt(rad);
        JOptionPane.showMessageDialog(null,"The area of the circle is: "+AreaCircle());
        String l = JOptionPane.showInputDialog("Enter the length");
        length = Integer.parseInt(l);
        String w = JOptionPane.showInputDialog("Enter the width");
        width = Integer.parseInt(w);
        JOptionPane.showMessageDialog(null,"The area of the rectangle is: "+AreaRectangle());
    }
}

