package com.wangjulong.cp5;

import com.wangjulong.cp5.analysis.NumberAnalysis;
import com.wangjulong.cp5.db.DataUpdate;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws IOException, SQLException {
        System.out.println("Hello CP5");
        // 更新数据程序
//        DataUpdate.update();
        // 准备数据
        DatabaseAccess databaseAccess = new DatabaseAccess();
        int[][] allData = databaseAccess.getAllNumber();

        NumberAnalysis numberAnalysis = new NumberAnalysis(allData, 10, 80);
        numberAnalysis.analysis();

    }


}
