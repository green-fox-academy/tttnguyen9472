public class Bmi {
    public static void main(String[] args) {
        // Print the Body mass index (BMI) based on these values
        double massInKg = 81.2;
        double heightInM = 1.78;

        double bmi = massInKg / (heightInM * heightInM);
        System.out.println("BMI: " + bmi + "%");
    }
}
