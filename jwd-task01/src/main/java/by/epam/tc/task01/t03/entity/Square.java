package by.epam.tc.task01.t03.entity;

public class Square {
    private double a;

    public Square(int a) {
        setA(a);
    }

    public Square(double a) {
        setA(a);
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        if (a > 0) {
            this.a = a;
        }
    }

    public void setA(double a) {
        if (a > 0) {
            this.a = a;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("a=").append(a);
        sb.append('}');
        return sb.toString();
    }
}
