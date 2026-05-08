class Circle {
    double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double diameter () {
        return 2*this.radius;
    }

    public double perimeter () {
        return 2 * Math.PI * this.radius;
    }

    public double area () {
        return this.radius * this.radius * Math.PI;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double getRadius () {
        return this.radius;
    }
}