public class Practiceset_constructors {

    static class cylinder{
        private int rad;
        private int height;

        public void setRad(int rad){
            this.rad = rad;
        }
        public int getRad(){
            return rad;
        }
        public void setHeight(int height){
            this.height = height;
        }
        public int getHeight(){
            return height;
        }
    }
    static class circle extends cylinder{
        public void area(int r){
            System.out.println(3.14*r*r);
        }
    }
    public static void main(String[] args) {
        cylinder newCylinder = new cylinder();
        newCylinder.setHeight(50);
        newCylinder.setRad(50);
        System.out.println(newCylinder.getHeight());
        System.out.println(newCylinder.getRad());
        System.out.println("Volume - " + 3.14 * newCylinder.getRad() * newCylinder.getRad() * newCylinder.getHeight());
    }
}
