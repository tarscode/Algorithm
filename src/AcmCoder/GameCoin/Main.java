package AcmCoder.GameCoin;

import java.util.Scanner;

/**
 * 【工程】: Algorithm 包名: AcmCoder.GameCoin 类名: Main
 * 【作者】: liuyang
 * 【时间】: 17/3/17 下午7:07
 * 【题目】: 游戏币
 * 【内容】: 小赛酷爱游戏，在他卧室的抽屉里有n个游戏币，总面值m，游戏币的设置有1分的，2分的，5分的，而在小赛所拥有的游戏币中有些面值的游戏币可能没有，求一共有多少种可能的游戏币组合方式？
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】: 暴力求解
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        int num = 0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                for(int k=0;k<=n;k++){
                    if(i+2*j+5*k==m&&i+j+k==n){
                        num++;
                    }
                }
            }
        }
        System.out.print(num);
    }
}