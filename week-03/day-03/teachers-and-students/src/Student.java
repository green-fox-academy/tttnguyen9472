public class Student {
    String learn;

    public void learn() {
        System.out.println("I learned something new.");
    }

    public void question(Teacher teacher) {
        teacher.answer();
    }
}
