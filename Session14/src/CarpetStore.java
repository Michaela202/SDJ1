public class CarpetStore
{
  public static void main(String[] args)
  {
    RoomDimension roomDimension = new RoomDimension(1,5.5);
    RoomCarpet roomCarpet =new RoomCarpet(roomDimension, 7.5);
    System.out.println(roomCarpet.getTotalCost());
  }
}
