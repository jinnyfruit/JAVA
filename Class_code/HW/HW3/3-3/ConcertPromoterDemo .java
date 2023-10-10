public class ConcertPromoterDemo {
    public static void main(String[] args)
    {
        ConcertPromoter Big = new ConcertPromoter();
        Big.ConcertPromoter("jinny", 100,0,5000,10000);

        Big.addPhone(50);
        Big.addConcert(30);
        Big.deletePhone(30);
        Big.addConcert(30);
        System.out.println("number of remain tickets: "+ Big.getRemainTicket());
        System.out.println("number of sold tickets: "+ (Big.Capacity - Big.getRemainTicket()));
        System.out.println("total sale: "+ Big.getTotalSale());

    }
}