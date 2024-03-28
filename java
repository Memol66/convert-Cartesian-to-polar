import java.lang.Math;

public class CartesianToPolar {
    public static void main(String[] args) {
        double x = 3;
        double y = 4;
        
        // Call the cartesianToPolar method
        double[] polarCoordinates = cartesianToPolar(x, y);
        
        // Extract values from the returned array
        double r = polarCoordinates[0];
        double theta = polarCoordinates[1];
        
        // Print the results
        System.out.println("r = " + r + ", theta = " + theta);
    }
    
    public static double[] cartesianToPolar(double x, double y) {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        
        // Convert theta to degrees if needed
        // theta = Math.toDegrees(theta);
        
        return new double[]{r, theta};
    }
}
