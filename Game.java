public class Game {

// private char[][] board;
//
//
//
// public Game() { //בנאי
//  board = new char[3][3];
//  for (int i = 0; i < 3; i++) {
//   for (int j = 0; j < 3; j++) {
//    board[i][j] = '-';
//   }
//  }
// }
//
// public void printBoard() {
//  for (int i = 0; i < 3; i++) {
//   for (int j = 0; j < 3; j++) {
//    System.out.print(board[i][j] + " ");
//   }
//   System.out.println();
//  }
// }

// public boolean makeMove(int row, int col, char player) {
//  System.out.println("שחקן "+ player + " השתמש בשורה " +(row+1) + " במיקום " + (col+1));
//
//  if (board[row][col] == '-') {
//   board[row][col] = player;
//   return true;
//  }
//
//  return false;
// }


// public boolean isDraw() {
//  for (int i = 0; i < 3; i++) {
//   for (int j = 0; j < 3; j++) {
//    if (board[i][j] == '-') {
//     return false; // עדיין יש מקום פנוי
//    }
//   }
//  }
//  return true; // אין מקומות פנויים → תיקו
// }
//
// public boolean checkWin(char player) {
//
//  // בדיקת שורות
//  for (int i = 0; i < 3; i++) {
//   if (board[i][0] == player &&
//           board[i][1] == player &&
//           board[i][2] == player) {
//    return true;
//   }
  //}


  // בדיקת עמודות
//  for (int j = 0; j < 3; j++) {
//   if (board[0][j] == player &&
//           board[1][j] == player &&
//           board[2][j] == player) {
//    return true;
//   }
//  }
//
//  // אלכסון ראשי
//  if (board[0][0] == player &&
//          board[1][1] == player &&
//          board[2][2] == player) {
//   return true;
//  }
//
//  // אלכסון שני
//  if (board[0][2] == player &&
//          board[1][1] == player &&
//          board[2][0] == player) {
//   return true;
//
//  }
//
//  return false;
// }
//


}


