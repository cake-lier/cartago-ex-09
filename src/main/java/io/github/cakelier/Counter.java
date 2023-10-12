package io.github.cakelier;

/** A simple counter class. */
public class Counter {
    private int count;

    /** Default constructor, starting the count at 0. */
    public Counter() {
        this.count = 0;
    }

    /** Constructor starting the count from the value given.
     *
     * @param count the value from which startìng the count
     */
    public Counter(final int count) {
        this.count = count;
    }

    /** Increments the current count value by the amount given.
     *
     * @param step the amount by which incrementing the current count value
     */
    public void increment(final int step) {
        this.count += step;
    }

    /** Returns the current count value.
     *
     * @return the current count value
     */
    public int getCount() {
        return this.count;
    }

    /** Returns the name of this class.
     *
     * @return the name of this class
     */
    public static String getClassName() {
        return "Counter";
    }
}
