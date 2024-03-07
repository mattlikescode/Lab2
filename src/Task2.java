public class Task2 {
    static float marsWeightMatthew;
        static float earthWeightMatthew = 83.0f;

        public static void main(String[] args) {

            marsWeightMatthew = earthWeightMatthew * 0.38f;
            System.out.println("70kg on Earth is " + marsWeightMatthew + "kg on Mars");

            double marsWeightDouble = marsWeightMatthew;
            System.out.printf("Kilograms on Mars displayed to four decimal Places: %.4f\n", marsWeightDouble);

            int marsWeightInt = (int) marsWeightDouble;
            System.out.println("Kilograms on Mars when casted to integer: " + marsWeightInt);

            char marsWeightChar = (char) marsWeightInt;
            System.out.println("The ASCII table equivalnet of the weight is: " + marsWeightChar);

            int updatedMarsWeightInt = marsWeightChar + 10; // Example math operation
            System.out.println("An example of a mathematical operation on the car type: " + updatedMarsWeightInt);
        }
    }