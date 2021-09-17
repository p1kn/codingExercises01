package com.company;

import java.awt.geom.Point2D;

public class Point {

    private int x;
    private int y;

    public Point () {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        double xB = 0;
        double yB = 0;
        double xA = (double) x;
        double yA = (double) y;
        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
    }

    public double distance (int x, int y) {
        double xB = (double) x;
        double yB = (double) y;
        double xA = (double) this.x;
        double yA = (double) this.y;
        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
    }

    public double distance (Point another) {

        int x = another.getX();
        int y = another.getY();
        return distance(x,y);
    }






}
