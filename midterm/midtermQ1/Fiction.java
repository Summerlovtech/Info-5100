public class Fiction extends Book implements iBorrowable{
    private int borrowDay = 0;
    private int returnDay = 0;

    public Fiction(String title, double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    String description() {
        return super.getTitle() + " all events are imaginary and not based on real facts";
    }

    @Override
    public void setBorrowDate(int borrowDay) {
        this.borrowDay = borrowDay;
    }

    @Override
    public void setReturnDate(int returnDay) {
        this.returnDay = returnDay;
    }

    @Override
    public boolean isAvailable(int day) {
        if (day >= borrowDay && day <= returnDay) {
            return false;
        }
        return true;
    }
}
