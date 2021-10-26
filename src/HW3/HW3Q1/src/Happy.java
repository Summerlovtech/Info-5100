public class Happy extends Moody {

    public Happy(){
    }
    @Override
    protected String getMood() {
        return "Happy";
    }
    @Override
    public void expressFeelings() {
        System.out.println("heeehee...hahahah...HAHAHA!!");
    }

    @Override
    public String toString(){
      return "Subject laughs a lot";
    }
}
