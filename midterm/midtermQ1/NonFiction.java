public class NonFiction extends Book implements iBorrowable{
        private int borrowDay = 0;
        private int returnDay = 0;
        public NonFiction(String title, double price, String publishYear) {
            super(title, price, publishYear);
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

        @Override
        String description() {
            return super.getTitle() + " all events are true and based on real facts.";
        }
    }

