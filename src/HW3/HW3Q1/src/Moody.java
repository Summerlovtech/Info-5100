import java.lang.String;
public abstract class Moody {

    public Moody(){}

        protected abstract String getMood();

        public abstract void expressFeelings();

        public void queryMood(){
            System.out.println("I feel "+getMood()+" today!!");

        }

    }
