package run_zhao;

/**
 * Java类于 2022/9/17 16:09:17 创建
 *
 * @author 4
 */
public class Hi {

    // 这是一个函数定义，不许写在 main 里面 啪！一尺子
    public static void copy(String[] srcArray, String[] newArray){
        // 这里你的逻辑是正确的哦！很棒！将每一个数值赋给了新数组，不过再函数中要做的是封装逻辑，下面请看main
        for (int indexNum = 0; indexNum < newArray.length; indexNum ++ ){
            newArray[indexNum] = srcArray[indexNum];
        }
    }

    public static void main(String[] args) {
        System.out.println("这里的代码才会运行嗷！也就是说，这里只能调用函数，不能定义函数");
        String[] datas1 = new String[]{"123", "456", "789"}; // 需要被拷贝的数组
        String[] datas2 = new String[3]; // 拷贝的目标数据
        // 调用函数     将这俩数组按照函数的形参位置传进去
        copy(datas1, datas2); // datas1做srcArray  datas2做newArray
        // 查看datas2 是否有datas1的数据
        for (int indexNum = 0; indexNum < datas2.length; indexNum ++){
            System.out.println(datas2[indexNum]);
        }
    }
}
