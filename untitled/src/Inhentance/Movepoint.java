package Inhentance;



    public class Movepoint  extends Point{
        private float xSpeed;
        private float ySpeed;

        public Movepoint (){
        }

        public Movepoint (float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public Movepoint (float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public float getxSpeed() {
            return xSpeed;
        }

        public void setxSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }

        public float getySpeed() {
            return ySpeed;
        }

        public void setySpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }

        public void setSpeed(float xSpeed, float ySpeed){
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public float[] getSpeed(){
            float [] arr = {getxSpeed(),getySpeed()};
            return arr;
        }

        @Override
        public String toString() {
            return super.toString()+ ".Speed=("+getxSpeed()+","+getySpeed()+ "}";
        }

        public  Movepoint  move(){
            x+=xSpeed;
            y+=ySpeed;
            return this;
        }
    }

