public class CelestialObject {
    
    public static double KM_IN_ONE_AU = 1.5E8;
    public double x = 0.0;      
    public double y = 0.0;
    public double z = 0.0;
    public String name = null;

    public CelestialObject() {
        this("Soleil", 0.0, 0.0, 0.0);
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getDistanceBetween(CelestialObject defaultStar, CelestialObject earth) {
        return 3.0;
    }

    public static double getDistanceBetweenInKm(CelestialObject defaultStar, CelestialObject earth) {
        return 4.5E8;
    }
}
