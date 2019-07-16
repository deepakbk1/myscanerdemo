package org.opencv.core;

//javadoc:TermCriteria
public class TermCriteria {

    /*Deepak*/
    public static final int COUNT = 1;
    /*Deepak*/
    public static final int MAX_ITER = COUNT;
    /*Deepak*/
    public static final int EPS = 2;

    public int type;
    public int maxCount;
    public double epsilon;

    /*Deepak*/
    public TermCriteria(int type, int maxCount, double epsilon) {
        this.type = type;
        this.maxCount = maxCount;
        this.epsilon = epsilon;
    }

    /*Deepak*/
    public TermCriteria() {
        this(0, 0, 0.0);
    }

    public TermCriteria(double[] vals) {
        set(vals);
    }

    public void set(double[] vals) {
        if (vals != null) {
            type = vals.length > 0 ? (int) vals[0] : 0;
            maxCount = vals.length > 1 ? (int) vals[1] : 0;
            epsilon = vals.length > 2 ? (double) vals[2] : 0;
        } else {
            type = 0;
            maxCount = 0;
            epsilon = 0;
        }
    }

    public TermCriteria clone() {
        return new TermCriteria(type, maxCount, epsilon);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(type);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(maxCount);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(epsilon);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof TermCriteria)) return false;
        TermCriteria it = (TermCriteria) obj;
        return type == it.type && maxCount == it.maxCount && epsilon == it.epsilon;
    }

    @Override
    public String toString() {
        return "{ type: " + type + ", maxCount: " + maxCount + ", epsilon: " + epsilon + "}";
    }
}
