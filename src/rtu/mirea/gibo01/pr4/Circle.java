package rtu.mirea.gibo01.pr4;

import java.lang.*;

public class Circle {
        private int x;
        private int y;
        private int r;

        public Circle(int x, int y, int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public  void setY(int y) {
            this.y = y;
        }

        public int getR() {
            return r;
        }

        public  void setR(int r) {
            this.r = r;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "x=" + x +
                    ", y=" + y +
                    ", r=" + r +
                    '}';
        }
        public double getLength() {
            double l = 2 * Math.PI * this.r;
            return l;
        }
        public double getS() {
            double s = Math.PI * Math.pow(r,2);
            return s;
        }
}
