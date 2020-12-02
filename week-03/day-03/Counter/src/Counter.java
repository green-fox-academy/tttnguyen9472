public class Counter {
//    Create Counter class
//      which has an integer field value
//      when creating it should have a default value 0 or we can specify it when creating
//      we can add(number) to this counter another whole number
//      or we can add() without parameters just increasing the counter's value by one
//      and we can get() the current value
//      also we can reset() the value to the initial value
//    Check if everything is working fine with the proper test
//      Download CounterTest.java and place it next to your solution
//      If you are unsure on how to get this running, you can watch a video tutorial
//      Other hints for running:
//          If something's red in it, ALT+Enter Add JUnit5 to classpath (5 aka JUnit FIVE not 4 or 3)
//          Then run the tests with the green play button before the lines (run all of them before the classname)

    int field;
    int resetField = field;

    public Counter() {

    }

    public Counter(int field) {
        this.field = field;
        resetField = field;
    }

    public void add(int number) {
        field = field + number;
    }

    public void add() {
        field = field + 1;
    }

    public int get() {
        return field;
    }

    public void reset() {
        resetField = field;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.add(50);
        counter1.get();

        counter1.add();
        counter1.get();

        counter1.add(70);

        counter1.reset();
        counter1.get();
    }
}
