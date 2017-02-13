package com.lidan;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lidan on 2017/2/10.
 */
public class sudoku {

    private ArrayList<Integer> randomList;
    private int[][] seedArray={
            {9,7,8,3,1,2,6,4,5},
            {3,1,2,6,4,5,9,7,8},
            {6,4,5,9,7,8,3,1,2},
            {7,8,9,1,2,3,4,5,6},
            {1,2,3,4,5,6,7,8,9},
            {4,5,6,7,8,9,1,2,3},
            {8,9,7,2,3,1,5,6,4},
            {2,3,1,5,6,4,8,9,7},
            {5,6,4,8,9,7,2,3,1}
    };

    public int[][] finall;

    /**
     * <p>产生一个1-9的不重复长度为9的一维数组 </p>
     */
    private void creatNineRondomArray()
    {
        ArrayList <Integer>list = new ArrayList<Integer>();
        Random random=new Random();
        for (int i = 0; i < 9; i++) {
            int randomNum=random.nextInt(9)+1;
            while (true) {
                if (!list.contains(randomNum)) {
                    list.add(randomNum);
                    break;
                }
                randomNum=random.nextInt(9)+1;
            }

        }
        this.randomList = list;
    }


    /**
     *<p>通过一维数组和原数组生成随机的数独矩阵</p>
     *<p>
     *遍历二维数组里的数据，在一维数组找到当前值的位置，并把一维数组
     *当前位置加一处位置的值赋到当前二维数组中。目的就是将一维数组为
     *依据，按照随机产生的顺序，将这个9个数据进行循环交换，生成一个随
     *机的数独矩阵。
     *</p>
     */
    private void creatSudokuArray()
    {
        int flag=1;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    if(this.seedArray[i][j]==this.randomList.get(k))
                    {
                        this.seedArray[i][j]=this.randomList.get((k+1)%9);
                        break;
                    }
                }
            }
        }
        this.finall = this.seedArray;
    }

    public void gensudoku() {
        this.creatNineRondomArray();
        this.creatSudokuArray();
    }

}
