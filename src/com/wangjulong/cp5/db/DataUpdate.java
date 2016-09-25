package com.wangjulong.cp5.db;


import com.wangjulong.cp5.InitDataOkhttp;

/**
 * Created by Administrator on 2016/9/25.
 */
public class DataUpdate {

    public static void update() {
        InitDataOkhttp initDataOkhttp = new InitDataOkhttp();
        int[][] temp = initDataOkhttp.initData();

        for (int[] aTemp : temp) {

            System.out.print(aTemp[0] + " ");
            System.out.print(aTemp[1] + " ");
            System.out.print(aTemp[2] + " ");
            System.out.print(aTemp[3] + " ");
            System.out.print(aTemp[4] + " ");
            System.out.print(aTemp[5] + " ");
            System.out.println(aTemp[6]);
        }

    }
}
