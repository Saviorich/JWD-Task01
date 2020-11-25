package by.epam.tc.task01.t09.entity;

public class Circle {
    private double r;
    private double d;

    public Circle(double r) {
        this.r = r;
        this.d = r * 2;
    }

    public double getRadius() {
        return r;
    }

    public void setRadius(double r) {
        this.r = r;
        this.d = r * 2;
    }

    public double getDiameter() {
        return d;
    }

    public void setDiameter(double d) {
        this.d = d;
        this.r = d / 2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Circle circle = (Circle) obj;
        return this.r == circle.r && this.d == circle.d;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circle{");
        sb.append("r=").append(r);
        sb.append(", d=").append(d);
        sb.append("}");

        return sb.toString();
    }
}
