package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String[] mBoard = new String[9];

    private boolean userTurn = true;
    private boolean computerTurn = true; //will be set to false when there is a winner
    private TextView status;
    private Button newGameBTN;
    private Button cell0;
    private Button cell1;
    private Button cell2;
    private Button cell3;
    private Button cell4;
    private Button cell5;
    private Button cell6;
    private Button cell7;
    private Button cell8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();
        checkForWinner();
        newGameBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newGame();
            }
        });
        cell0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userTurn == true && mBoard[0] == null){
                    cell0.setText("X");
                    mBoard[0] = "X";

                    checkForWinner();
                    userTurn = false;
                    computerMove();
                }

            }
        });
        cell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userTurn == true && mBoard[1] == null){
                    cell1.setText("X");
                    mBoard[1] = "X";

                    checkForWinner();
                    userTurn = false;
                    computerMove();
                }

            }
        });
        cell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userTurn == true && mBoard[2] == null){
                    cell2.setText("X");
                    mBoard[2] = "X";

                    checkForWinner();
                    userTurn = false;
                    computerMove();
                }

            }
        });
        cell3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userTurn == true && mBoard[3] == null){
                    cell3.setText("X");
                    mBoard[3] = "X";

                    checkForWinner();
                    userTurn = false;
                    computerMove();
                }

            }
        });
        cell4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userTurn == true && mBoard[4] == null){
                    cell4.setText("X");
                    mBoard[4] = "X";

                    checkForWinner();
                    userTurn = false;
                    computerMove();
                }

            }
        });
        cell5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userTurn == true && mBoard[5] == null){
                    cell5.setText("X");
                    mBoard[5] = "X";

                    checkForWinner();
                    userTurn = false;
                    computerMove();
                }

            }
        });
        cell6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userTurn == true && mBoard[6] == null){
                    cell6.setText("X");
                    mBoard[6] = "X";

                    checkForWinner();
                    userTurn = false;
                    computerMove();
                }

            }
        });
        cell7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(userTurn == true && mBoard[7] == null){
                    cell7.setText("X");
                    mBoard[7] = "X";

                    checkForWinner();
                    userTurn = false;
                    computerMove();
                }

            }
        });
        cell8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(userTurn == true && mBoard[8] == null) {
                    cell8.setText("X");
                    mBoard[8] = "X";

                    checkForWinner();
                    userTurn = false;
                    computerMove();
                }
            }
        });
    }
    private void setupUIViews(){
        cell0 = (Button)findViewById(R.id.cell0);
        cell1 = (Button)findViewById(R.id.cell1);
        cell2 = (Button)findViewById(R.id.cell2);
        cell3 = (Button)findViewById(R.id.cell3);
        cell4 = (Button)findViewById(R.id.cell4);
        cell5 = (Button)findViewById(R.id.cell5);
        cell6 = (Button)findViewById(R.id.cell6);
        cell7 = (Button)findViewById(R.id.cell7);
        cell8 = (Button)findViewById(R.id.cell8);
        newGameBTN = (Button)findViewById((R.id.newGame));
        status = (TextView)findViewById((R.id.status));
    }

        private void newGame(){
            for(int i = 0; i <= 8; i++){
                mBoard[i] = null;
            }
            cell0.setText("");
            cell1.setText("");
            cell2.setText("");
            cell3.setText("");
            cell4.setText("");
            cell5.setText("");
            cell6.setText("");
            cell7.setText("");
            cell8.setText("");

            status.setText("Tic Tac Toe");
            userTurn = true;
            computerTurn = true;
        }
    private void computerMove(){

        //this needs to be here to exit the method in case there is a tie
        if(mBoard[0] != null && mBoard[1] != null && mBoard[2] != null
                && mBoard[3] != null && mBoard[4] != null && mBoard[5] != null
                && mBoard[6] != null && mBoard[7] != null && mBoard[8] != null){
            return;
        }

        //lazy random ai to play tic tac toe against - uses random numbers
        Random r = new Random();
        int randomNum = r.nextInt(9);
        while(mBoard[randomNum] != null){

            randomNum = r.nextInt(9);
        }
        //change the value of the array and the text on the buttons per random number generated
        if(mBoard[randomNum] == null && computerTurn == true){
            mBoard[randomNum] = "O";
            //String buttonID = "cell" + randomNum;
            //int resID = getResources().getIdentifier(buttonID,"id",getPackageName());
            if(randomNum == 0 ){
                cell0.setText("O");
            }
            if(randomNum == 1){
                cell1.setText("O");
            }
            if(randomNum == 2){
                cell2.setText("O");
            }
            if(randomNum == 3){
                cell3.setText("O");
            }
            if(randomNum == 4){
                cell4.setText("O");
            }
            if(randomNum == 5){
                cell5.setText("O");
            }
            if(randomNum == 6){
                cell6.setText("O");
            }
            if(randomNum == 7){
                cell7.setText("O");
            }
            if(randomNum == 8){
                cell8.setText("O");
            }
            userTurn = true;
            checkForWinner();
        }

    }

    //Method to check if the user or the computer won
    private void checkForWinner(){
        //horiz

        if(mBoard[0] == "X" && mBoard[1] == "X" && mBoard[2] == "X"){
            status.setText("You won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[0] == "O" && mBoard[1] == "O" && mBoard[2] == "O"){
            status.setText("The computer won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[3] == "X" && mBoard[4] == "X" && mBoard[5] == "X"){
            status.setText("You won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[3] == "O" && mBoard[4] == "O" && mBoard[5] == "O"){
            status.setText("The computer won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[6] == "X" && mBoard[7] == "X" && mBoard[8] == "X"){
            status.setText("You won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[6] == "O" && mBoard[7] == "O" && mBoard[8] == "O"){
            status.setText("The computer won!");
            userTurn = false;
            computerTurn = false;
        }

        //vert
        else if(mBoard[0] == "X" && mBoard[3] == "X" && mBoard[6] == "X"){
            status.setText("You won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[0] == "O" && mBoard[3] == "O" && mBoard[6] == "O"){
            status.setText("The computer won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[1] == "X" && mBoard[4] == "X" && mBoard[7] == "X"){
            status.setText("You won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[1] == "O" && mBoard[4] == "O" && mBoard[7] == "O"){
            status.setText("The computer won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[2] == "X" && mBoard[5] == "X" && mBoard[8] == "X"){
            status.setText("You won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[2] == "O" && mBoard[5] == "O" && mBoard[8] == "O"){
            status.setText("The computer won!");
            userTurn = false;
            computerTurn = false;
        }

        //diag
        else if(mBoard[0] == "X" && mBoard[4] == "X" && mBoard[8] == "X"){
            status.setText("You won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[0] == "O" && mBoard[4] == "O" && mBoard[8] == "O"){
            status.setText("The computer won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[6] == "X" && mBoard[4] == "X" && mBoard[2] == "X"){
            status.setText("You won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[6] == "O" && mBoard[4] == "O" && mBoard[2] == "O"){
            status.setText("The computer won!");
            userTurn = false;
            computerTurn = false;
        }
        else if(mBoard[0] != null && mBoard[1] != null && mBoard[2] != null
                && mBoard[3] != null && mBoard[4] != null && mBoard[5] != null
                && mBoard[6] != null && mBoard[7] != null && mBoard[8] != null){
            status.setText("Tie!");
            userTurn = false;
            computerTurn = false;
        }
    }
}
