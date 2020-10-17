package com.fengkuang.java.异常处理10.异常处理机制102;

import java.io.*;

public class Gobang {
    // 定义一个二维数组来充当棋盘
    private String[][] board;
    // 定义棋盘的大小
    private static int BOARD_SIZE = 15;

    public void initBoard() {
        // 初始化棋盘数组
        board = new String[BOARD_SIZE][BOARD_SIZE];
        // 把每个元素赋为"╋"，用于在控制台画出棋盘
        for (var i = 0; i < BOARD_SIZE; i++) {
            for (var j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = "╋";
            }
        }
    }

    // 在控制台输出棋盘的方法
    public void printBoard() {
        // 打印每个数组元素
        for (var i = 0; i < BOARD_SIZE; i++) {
            for (var j = 0; j < BOARD_SIZE; j++) {
                // 打印数组元素后不换行
                System.out.print(board[i][j]);
            }
            // 每打印完一行数组元素后输出一个换行符
            System.out.print("\n");
        }
    }

    public static void main(String[] args) throws Exception {
        var gb = new Gobang();
        gb.initBoard();
        gb.printBoard();
        // 这是用于获取键盘输入的方法
        var br = new BufferedReader(
                new InputStreamReader(System.in));
        String inputStr = null;
        // br.readLine()：每当在键盘上输入一行内容按回车，
        // 用户刚刚输入的内容将被br读取到。
        while ((inputStr = br.readLine()) != null) {
            try {
                // 将用户输入的字符串以逗号作为分隔符，分解成2个字符串
                String[] posStrArr = inputStr.split(",");
                // 将2个字符串转换成用户下棋的坐标
                var xPos = Integer.parseInt(posStrArr[0]);
                var yPos = Integer.parseInt(posStrArr[1]);
                // 把对应的数组元素赋为"●"。
                if (!gb.board[xPos - 1][yPos - 1].equals("╋")) {
                    System.out.println("您输入的坐标点已有棋子了，"
                            + "请重新输入");
                    continue;
                }
                gb.board[xPos - 1][yPos - 1] = "●";
            } catch (Exception e) {
                System.out.println("您输入的坐标不合法，请重新输入，"
                        + "下棋坐标应以x,y的格式");
                continue;
            }

            gb.printBoard();
            System.out.println("请输入您下棋的坐标，应以x,y的格式：");
        }
    }
}
