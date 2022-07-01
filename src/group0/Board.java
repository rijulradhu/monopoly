package group0;

public class Board {

    private final int TOTAL = 40;
    private Tile[] board;

    public Board(){
        board = new Tile[40];
        board[0] = new Start();
        board[1] = new Property("Mobile Repair",1,60,2,"brown");
        board[2] = new ChanceCom("Community Chest", 2);
        board[3] = new Property("BITS Sign",3,60,4,"brown");
        board[4] = new Tax("Sem Fee", 4, 200);
        board[5] = new FoodOutlet("Monginis", 5, 200, 25);
        board[6] = new Property("A Mess", 6, 100, 6, "blue");
        board[7] = new ChanceCom("Chance", 7);
        board[8] = new Property("A Hostel", 8, 100, 6, "blue");
        board[9] = new Property("A-Side Classes", 9, 120, 8, "blue");
        board[10] = new Quarantine();
        board[11] = new Property("DLTS", 11, 140, 10, "pink");
        board[12] = new Utility("Salon", 12, 150);
        board[13] = new Property("D Hostel", 13, 140, 10, "pink");
        board[14] = new Property("D Mess", 14, 160, 12, "pink");
        board[15] = new FoodOutlet("FoodKing", 25, 200, 25);
        board[16] = new Property("CNC", 16, 180, 14, "orange");
        board[17] = new ChanceCom("Community Chest", 17);
        board[18] = new Property("ANC", 18, 180, 14, "orange");
        board[19] = new Property("DNC", 19, 200, 16, "orange");
        board[20] = new GoToFreeParking("Parking", 20);
        board[21] = new Property("LT Lawns", 21, 220, 18, "red");
        board[22] = new ChanceCom("Chance", 22);
        board[23] = new Property("LT-S", 23, 220, 18, "red");
        board[24] = new Property("B-Dome", 24, 240, 20, "red");
        board[25] = new FoodOutlet("Gaja", 25, 200, 25);
        board[26] = new Property("C Hostel", 26, 260, 22, "yellow");
        board[27] = new Property("C Mess", 27, 260, 22, "yellow");
        board[28] = new Utility("Laundry", 28, 150);
        board[29] = new Property("CC", 29, 280, 24, "yellow");
        board[30] = new GoToFreeParking("Go to Quarantine", 30);
        board[31] = new Property("Malakar", 31, 300, 26, "green");
        board[32] = new Property("SBI", 32, 300, 26, "green");
        board[33] = new ChanceCom("Community Chest", 33);
        board[34] = new Property("Central Lawns", 34, 320, 28, "green");
        board[35] = new FoodOutlet("Ice & Spice", 35, 200, 25);
        board[36] = new ChanceCom("Chance", 36);
        board[37] = new Property("Visitor's Guest House", 37, 350, 35, "dark blue");
        board[38] = new Tax("Disco Fee", 38, 100);
        board[39] = new Property("Main Gate", 39, 400, 50, "dark blue");
    }

    public Tile getTile(int position){
        return board[position];
    }

    public Tile[] getBoard(){
        return board;
    }
}
