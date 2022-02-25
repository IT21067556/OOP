import java.lang.Math;

public class PointApp {
    public static void main(String args[]) {
        Point3D point1 = new Point3D(1, 1, 1);
        Point3D point2 = new Point3D(2, 2, 2);

        System.out.println(point2.distance() - point1.distance());
    }
}

class Point3D {
    private float coord1;
    private float coord2;
    private float coord3;

    Point3D(float coord1, float coord2, float coord3) {
        this.coord1 = coord1;
        this.coord2 = coord2;
        this.coord3 = coord3;
    }

    float distance() {
        return (float)Math.sqrt(Math.pow(coord1, 2) + Math.pow(coord2, 2)
                + Math.pow(coord3, 2));
    }
}

