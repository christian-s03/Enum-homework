enum Planet {   // Mass i Radius wziete z neta
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getDensity() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return mass / volume;
    }

    public String toString() {
        return name() +
                " === mass: " + String.format("%.2e", mass) + " kg" +
                ", radius: " + String.format("%.2e", radius) + " m" +
                ", density: " + String.format("%.2f", getDensity()) + " kg/m³";
    }
}
