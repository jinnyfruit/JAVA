```java
/*
 file name: 3-3
 author: Ji woo Kim
 modified: 05.24
*/
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class ConcertPromoter
{
    String name;
    int Capacity;
    int numberOfTicket;
    int phoneNum;
    int ConcertNum;
    int totalSale = 0;

    void ConcertPromoter(String name,int Capacity,int numberOfTicket,int phoneNum,int ConcertNum)
    {
        this.name = name;
        this.Capacity = Capacity;
        this.numberOfTicket = numberOfTicket;
        this.phoneNum = phoneNum;
        this.ConcertNum = ConcertNum;
    }
    void addPhone(int num)
    {
        numberOfTicket += num;
        totalSale += phoneNum * num;
        System.out.println("number of tickets sold: " + numberOfTicket + " total sale amount: "+ totalSale);
    }
    void deletePhone(int num){
        numberOfTicket -=num;
        totalSale -= phoneNum * num;
        System.out.println("number of tickets sold: " + numberOfTicket + " total sale amount: "+ totalSale);
    }

    void addConcert(int num)
    {
        numberOfTicket += num;
        totalSale += ConcertNum * num;
        System.out.println("number of tickets sold: " + numberOfTicket + " total sale amount: "+ totalSale);

    }

    int getNumberOfTicket()
    {
        return numberOfTicket;
    }

    int getRemainTicket()
    {
        return Capacity-numberOfTicket;
    }

    int getTotalSale()
    {
        return totalSale;
    }

}

```