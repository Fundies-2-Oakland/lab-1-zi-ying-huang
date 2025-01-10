/**
 * Question 1:
 */
public class Vector3D  {
    double x;
    double y;
    double z;

    public static void main(String[] args) {
        Vector3D vector = new Vector3D(3.0,4.5,2.1);
        System.out.println("X-Cord: " + vector.getX());
        System.out.println("Y-Cord: " + vector.getY());
        System.out.println("Z-Cord: " + vector.getZ());
    }

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    /**
     * Question 2:
     */
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}