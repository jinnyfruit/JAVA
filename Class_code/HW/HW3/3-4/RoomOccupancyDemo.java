public class RoomOccupancyDemo {
    public static void main(String[] args)
    {
        RoomOccupancy r = new RoomOccupancy();
        r.RoomOccupancy(101,2);
        RoomOccupancy s = new RoomOccupancy();
        s.RoomOccupancy(102,3);
        System.out.println("total number: "+ RoomOccupancy.getTotal());

        r.addOneToRoom();
        r.addOneToRoom();
        s.removeOneFromRoom();

        System.out.println("room number: 101 peopleInRoom: "+r.getPeopleInRoom());
        System.out.println("room number: 102 peopleInRoom: "+s.getPeopleInRoom());
        System.out.println("total in all rooms is  "+RoomOccupancy.getTotal());
    }
}