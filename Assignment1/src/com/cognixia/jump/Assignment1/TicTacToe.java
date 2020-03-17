package com.cognixia.jump.Assignment1;

import java.util.Scanner;

public class TicTacToe {
	private static char[][] Board = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' },
			{ ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };

	private static String player1;
	private static String player2;

	public static void printBoard() {
		for (char[] row : Board) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

	public static void playGame() {

		Player1PickSpot();

	}

	public static void checkWinner() {

		if (Board[0][0] == 'X' && Board[0][2] == 'X' && Board[0][4] == 'X') {
			System.out.println(player1 + " Wins!");

			System.exit(0);
		} else if (Board[0][0] == 'X' && Board[2][0] == 'X' && Board[4][0] == 'X') {
			System.out.println(player1 + " Wins!");
			System.exit(0);
		} else if (Board[0][0] == 'X' && Board[2][2] == 'X' && Board[4][4] == 'X') {
			System.out.println(player1 + " Wins!");
			System.exit(0);
		} else if (Board[2][0] == 'X' && Board[2][2] == 'X' && Board[2][4] == 'X') {
			System.out.println(player1 + " Wins!");
			System.exit(0);
		} else if (Board[0][4] == 'X' && Board[2][2] == 'X' && Board[4][0] == 'X') {
			System.out.println(player1 + " Wins!");
			System.exit(0);
		} else if (Board[0][4] == 'X' && Board[2][4] == 'X' && Board[4][4] == 'X') {
			System.out.println(player1 + " Wins!");
			System.exit(0);
		}
		// **********O*********
		if (Board[0][0] == 'O' && Board[0][2] == 'O' && Board[0][4] == 'O') {
			System.out.println(player2 + " Wins!");
			System.exit(0);
		} else if (Board[0][0] == 'O' && Board[2][0] == 'O' && Board[4][0] == 'O') {
			System.out.println(player2 + " Wins!");
			System.exit(0);
		} else if (Board[0][0] == 'O' && Board[2][2] == 'O' && Board[4][4] == 'O') {
			System.out.println(player2 + " Wins!");
			System.exit(0);
		} else if (Board[2][0] == 'O' && Board[2][2] == 'O' && Board[2][4] == 'O') {
			System.out.println(player2 + " Wins!");
			System.exit(0);
		} else if (Board[0][4] == 'O' && Board[2][2] == 'O' && Board[4][0] == 'O') {
			System.out.println(player2 + " Wins!");
			System.exit(0);
		} else if (Board[0][4] == 'O' && Board[2][4] == 'O' && Board[4][4] == 'O') {
			System.out.println(player2 + " Wins!");
			System.exit(0);
		}

	}

	public static void Player2PickSpot() {
		System.out.println(player2 + " Pick a spot(1-9)");
		printBoard();
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();

		switch (pos) {
		case 1:
			if (Board[0][0] == ' ') {
				Board[0][0] = 'O';
				printBoard();
				checkWinner();
				Player1PickSpot();

			} else {
				System.out.println("Spot has been taken");
				Player2PickSpot();
			}
			break;
		case 2:
			if (Board[0][2] == ' ') {
				Board[0][2] = 'O';
				printBoard();
				checkWinner();
				Player1PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player2PickSpot();
			}
			break;
		case 3:
			if (Board[0][4] == ' ') {
				Board[0][4] = 'O';
				checkWinner();
				printBoard();
				Player1PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player2PickSpot();
			}

			break;
		case 4:
			if (Board[2][0] == ' ') {
				Board[2][0] = 'O';
				checkWinner();
				printBoard();
				Player1PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player2PickSpot();
			}
			break;
		case 5:
			if (Board[2][2] == ' ') {
				Board[2][2] = 'O';
				checkWinner();
				printBoard();
				Player1PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player2PickSpot();
			}
			break;
		case 6:
			if (Board[2][4] == ' ') {
				Board[2][4] = 'O';
				checkWinner();
				printBoard();
				Player1PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player2PickSpot();
			}
			break;
		case 7:
			if (Board[4][0] == ' ') {
				Board[4][0] = 'O';
				checkWinner();
				printBoard();
				Player1PickSpot();
			}
			break;
		case 8:
			if (Board[4][2] == ' ') {
				Board[4][2] = 'O';
				checkWinner();
				printBoard();
				Player1PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player2PickSpot();
			}
			break;
		case 9:
			if (Board[4][4] == ' ') {
				Board[4][4] = 'O';
				checkWinner();
				printBoard();
				Player1PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player2PickSpot();
			}
			break;
		default:
			break;
		}
	}

	public static void Player1PickSpot() {
		System.out.println(player1 + " Pick a spot(1-9)");
		printBoard();
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();

		switch (pos) {
		case 1:
			if (Board[0][0] == ' ') {
				Board[0][0] = 'X';
				checkWinner();
				printBoard();
				Player2PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player1PickSpot();
			}
			break;
		case 2:
			if (Board[0][2] == ' ') {
				Board[0][2] = 'X';
				checkWinner();
				printBoard();
				Player2PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player1PickSpot();
			}
			break;
		case 3:
			if (Board[0][4] == ' ') {
				Board[0][4] = 'X';
				checkWinner();
				printBoard();
				Player2PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player1PickSpot();
			}
			break;
		case 4:
			if (Board[2][0] == ' ') {
				Board[2][0] = 'X';
				checkWinner();
				printBoard();
				Player2PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player1PickSpot();
			}
			break;
		case 5:
			if (Board[2][2] == ' ') {
				Board[2][2] = 'X';
				checkWinner();
				printBoard();
				Player2PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player1PickSpot();
			}
			break;
		case 6:
			if (Board[2][4] == ' ') {
				Board[2][4] = 'X';
				checkWinner();
				printBoard();
				Player2PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player1PickSpot();
			}
			break;
		case 7:
			if (Board[4][0] == ' ') {
				Board[4][0] = 'X';
				checkWinner();
				printBoard();
				Player2PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player1PickSpot();
			}
			break;
		case 8:
			if (Board[4][2] == ' ') {
				Board[4][2] = 'X';
				checkWinner();
				printBoard();
				Player2PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player1PickSpot();
			}
			break;
		case 9:
			if (Board[4][4] == ' ') {
				Board[4][4] = 'X';
				checkWinner();
				printBoard();
				Player2PickSpot();
			} else {
				System.out.println("Spot has been taken");
				Player1PickSpot();
			}
			break;
		default:
			break;
		}

	}

	public static void playerInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 1 enter your name :");
		player1 = sc.nextLine();
		System.out.println("Player 2 enter your name");
		player2 = sc.nextLine();

		if (player1 != "" && player2 != "") {
			playGame();
		}
	}

	public static void main(String[] args) {

		// printBoard();
		Scanner sc = new Scanner(System.in);
		System.out.println("Play Game?(Yes/No)");

		String ans = sc.nextLine();

		if (ans.toLowerCase() == "no") {
			System.exit(0);
		} else {
			playerInfo();
		}
	}
}
