package com.learn.saurabh.examples.generics.sub.genericMethodOrConstructor;

/**
 * Created by saurabhagrawal on 04/03/17.
 */
public class Dimension<T> {
    private T length;
    private T width;
    private T height;

    //Generic Constructor
    public Dimension(T length, T width, T height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dimension)) return false;

        Dimension<?> dimension = (Dimension<?>) o;   //see genric here

        if (!length.equals(dimension.length)) return false;
        if (!width.equals(dimension.width)) return false;
        return height.equals(dimension.height);

    }

    @Override
    public int hashCode() {
        int result = length.hashCode();
        result = 31 * result + width.hashCode();
        result = 31 * result + height.hashCode();
        return result;
    }
}
