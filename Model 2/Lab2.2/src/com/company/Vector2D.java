package com.company;

import java.util.Locale;

public class Vector2D {

    double vX, vY;
    static int count = 0;
    public Vector2D() {
        this.vX = 1;
        this.vY = 1;
        count++;
    }
    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }
    public Vector2D(Vector2D v) {
        this(v.vX, v.vY);
    }

    public void print() {
        System.out.println(String.format(Locale.US,"(%.2f, %.2f)", this.vX, this.vY));
    }
    public double  length()
    {
        return  Math.sqrt(this.vX * this.vX  + this.vY * this.vY);
    }
    public void add(Vector2D v)
    {
        this.vX += v.vX;
        this.vY += v.vY;
    }
    public void sub(Vector2D v)
    {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }
    public void scale(double scaleFactor)
    {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }
    public void normalized()
    {
        double len = this.length();
        this.vX /= len;
        this.vY /= len;
    }
    public double dotProduct(Vector2D v)
    {
        return  this.vX * v.vX + this.vY * v.vY;
    }
}