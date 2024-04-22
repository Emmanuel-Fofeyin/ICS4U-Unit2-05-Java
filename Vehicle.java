/*
* Class that defines a vehicle.
*
* @author  Emmanuel FN
* @version 1.0
* @since   2024-04-21
*/

/**
* The Vehicle() class.
*/
public class Vehicle {
    /**
     * The color of the vehicle.
     */
    private String color;

    /**
     * The license plate of the vehicle.
     */
    private String licencePlate;

    /**
     * The number of doors of the vehicle.
     */
    private final int numberOfDoors;

    /**
     * The maximum speed of the vehicle.
     */
    private final int maxSpeed;

    /**
     * The current speed of the vehicle.
     */
    private int speed;

    /**
     * Constructor.
     *
     * @param color         The color of the vehicle.
     * @param licencePlate  The license plate of the vehicle.
     * @param numberOfDoors The number of doors of the vehicle.
     * @param maxSpeed      The maximum speed of the vehicle.
     */
    public Vehicle(String color, String licencePlate,
        int numberOfDoors, int maxSpeed) {
        this.color = color;
        this.licencePlate = licencePlate;
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
        this.speed = 0;
    }

    /**
     * Getter for color.
     *
     * @return The color of the vehicle.
     */
    public String getColor() {
        return color;
    }

    /**
     * Getter for license plate.
     *
     * @return The license plate of the vehicle.
     */
    public String getLicencePlate() {
        return licencePlate;
    }

    /**
     * Getter for speed.
     *
     * @return The speed of the vehicle.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Setter for color.
     *
     * @param color The color to set for the vehicle.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Setter for license plate.
     *
     * @param licencePlate The license plate to set for the vehicle.
     */
    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    /**
     * Method to display the status of the vehicle.
     */
    public void status() {
        System.out.println(" -> Speed: " + speed);
        System.out.println(" -> Max Speed: " + maxSpeed);
        System.out.println(" -> Number Of Doors: " + numberOfDoors);
        System.out.println(" -> Licence Plate: " + licencePlate);
        System.out.println(" -> Color: " + color);
    }

    /**
     * Method to accelerate the vehicle.
     *
     * @param accelerationPower The power of acceleration.
     * @param accelerationTime  The time duration for acceleration.
     */
    public void accelerate(int accelerationPower, int accelerationTime) {
        speed = (accelerationPower * accelerationTime) + speed;
        // Check if speed exceeds max speed
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
    }

    /**
     * Method to apply brakes to the vehicle.
     *
     * @param breakPower The power of the brake.
     * @param breakTime  The time duration for braking.
     */
    public void brake(int breakPower, int breakTime) {
        speed = speed - (breakPower * breakTime);
        // Check if speed is less than 0
        if (speed < 0) {
            speed = 0;
        }
    }
}
