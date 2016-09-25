package com.wangjulong.cp5.analysis;

import com.wangjulong.cp5.PrintArr;

import java.util.List;
import java.util.Map;

/**
 * 号码分析类
 * Created by Administrator on 2016/9/18.
 */

public class NumberAnalysis {

    private LotteryAnalysisStep01Interface lotteryAnalysisStep01Interface;
    private int[][] arr;
    private int baseNumber;
    private int analysisNumber;

    /**
     * 用于存储数据
     * Map 包含的 key :
     * serial(Kjh中的serial),title(Kjh中的title)
     * cause01,cause02,cause03,cause04,cause05(因)
     */
    private static List<Map<String, Integer>> data;

    /**
     * 在构造函数中初始化成员变量
     */
    public NumberAnalysis(int[][] arrs, int baseNumbers, int analysisNumbers) {
        arr = arrs;
        baseNumber = baseNumbers;
        analysisNumber = analysisNumbers;

        lotteryAnalysisStep01Interface = new LotteryAnalysisStep01();
    }

    /**
     * 入口方法，管理分析流程的方法
     * 本方法调用类的其他方法处理分析数据
     */
    public void analysis() {

        // 测试数据
        PrintArr.printArrx2(arr);

        // 第一步：计算得到第一阶段的计算结果
        int[][] temp = lotteryAnalysisStep01Interface.generalDataStage01(arr, baseNumber, analysisNumber);


    }


}
