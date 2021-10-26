public class Sad extends Moody {

   public Sad(){
   }

    @Override
    protected String getMood() {return "Sad";}

    @Override
    public void expressFeelings(){
        System.out.println("'waah' 'boo boo' 'weep' 'sob'");
    }

    @Override
    public String toString(){return "Subject cries a lot";}
}
