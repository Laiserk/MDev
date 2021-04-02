package com.company;

public class Vector2D {

    public double vX, vY;

    public Vector2D()
    {
        vX = 1;
        vY = 1;
    }
    public Vector2D(double vX, double vY)
    {
        this.vX = vX;
        this.vY = vY;
    }
    public Vector2D(Vector2D v)
    {
        v.vX = this.vX;
        v.vY = this.vY;
    }

    public void print()
    {
        System.out.printf("%f, %f\n", this.vX, this.vY);
    }
}
