/*
 file name: Practice 6.1
 author: Ji woo Kim
 modified: 05.24
*/
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
public class RoomOccupancy
{
    private int roomNumber;
    private int peopleInRoom;
    static int totalNumber = 0;

    void RoomOccupancy(int roomNum, int people_InRoom)
    {
        this.roomNumber = roomNum;
        this.peopleInRoom = people_InRoom;
        totalNumber += people_InRoom;

        System.out.println("roomNumber: "+ roomNumber + " peopleInRoom: "+ peopleInRoom);
    }

    void addOneToRoom()
    {
        peopleInRoom++;
        totalNumber++;
        System.out.println("room number: "+ roomNumber+" peopleInRoom: "+ peopleInRoom + " totalNumber: "+ totalNumber);
    }

    void removeOneFromRoom()
    {
        if(peopleInRoom>0 && totalNumber>0)
        {
            peopleInRoom--;
            totalNumber--;
            System.out.println("room number: "+ roomNumber+" peopleInRoom: "+ peopleInRoom + " totalNumber: "+ totalNumber);
        }
        else
            System.out.println("Error!");
    }

    int getNumber()
    {
        return roomNumber;
    }

    int getPeopleInRoom()
    {
        return peopleInRoom;
    }

    static int getTotal()
    {
        return totalNumber;
    }
}
