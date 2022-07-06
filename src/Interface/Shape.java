package Interface;

import java.util.Scanner;

public interface Shape {

    double CalculateArea();

    class Reactangle implements Shape {
        int breath;
        int height;

        Reactangle(int breath, int height) {
            this.breath = breath;
            this.height = height;
        }

        @Override
        public double CalculateArea() {
            return 0;
        }
    }

    class circle implements Shape {
        int r = 5;

        public circle(int r) {
            this.r = r;
        }

        @Override
        public double CalculateArea() {
            return 0;

        }

        class saqure implements Shape {
            public saqure() {
                int a = 10;
            }

            @Override
            public double CalculateArea() {
                return 0;

            }
        }
    }


    class ShapeImpl {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int ch;

        }
    }
}
