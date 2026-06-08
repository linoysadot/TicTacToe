import java.util.Scanner;

public class TesterGame {
    public static void main(String[] args) {
        Game game = new Game();
        Game game1 = new Game();

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("ברוכים הבאים למשחק ❌⭕");
//
//        SoundPlayer.play("start.wav");
//        int line, col;
//        char player = 'X';
//
//        while (true) {
//            game.printBoard();
//            System.out.print("שחקן " + player + " הכנס שורה: ");
//            line = input.nextInt();
//            while (line < 1 || line > 3) {
//                System.out.print("לא חוקי, נסה שוב (1-3): ");
//                line = input.nextInt();
//            }
//            line--;
//
//            System.out.print("הכנס עמודה: ");
//            col = input.nextInt();
//            while (col < 1 || col > 3) {
//                System.out.print("לא חוקי, נסה שוב (1-3): ");
//                col = input.nextInt();
//            }
//            col--;
//
//            if (game.makeMove(line, col, player)) {
//                // בדיקת ניצחון
//                if (game.checkWin(player)) {
//                    game.printBoard();
//                    System.out.println("שחקן " + player + " ניצח! 🎉");
//
//                    //SoundPlayer.play("win.wav"); // <--- השמעת קול ניצחון
//                    break;
//                }
//                // בדיקת תיקו
//                if (game.isDraw()) {
//                    game.printBoard();
//                    System.out.println("תיקו! 🤝");
//                    SoundPlayer.play("src/drow.wav"); // <--- השמעת קול תיקו
//                    break;
//                }
//                // החלפת תור
//                player = (player == 'X') ? 'O' : 'X';
//            } else {
//                System.out.println("מקום תפוס, נסה שוב");
//            }
//        }
//
//        // מחכים קצת כדי לשמוע את הסאונד לפני סגירת התוכנית
//        try { Thread.sleep(10000); } catch (InterruptedException e) {}
//    }
    }
    }