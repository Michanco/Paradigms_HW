package homework3;

import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private char currentPlayer;

    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != '-') {
            System.out.println("Некорректный ход. Попробуйте еще раз.");
            return false;
        }

        board[row][col] = currentPlayer;
        return true;
    }

    private boolean checkWin() {
        // Проверка по горизонтали и вертикали
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }

        // Проверка по диагоналям
        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
               (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        do {
            System.out.println("Текущее состояние доски:");
            printBoard();

            int row, col;


            do {
                System.out.print("Игрок " + currentPlayer + ", введите номер строки (1-3): ");
                row = scanner.nextInt() - 1;
                System.out.print("Игрок " + currentPlayer + ", введите номер столбца (1-3): ");
                col = scanner.nextInt() - 1;
                count ++;
            } while (!makeMove(row, col));

            if (checkWin()) {
                System.out.println("Игрок " + currentPlayer + " победил!");
                break;
            } else if (count == 9) {
                System.out.println("Ничья!");
                break;
            }

            // Переключение текущего игрока
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';

        } while (true);

        scanner.close();
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
