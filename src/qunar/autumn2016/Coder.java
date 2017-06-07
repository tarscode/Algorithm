package qunar.autumn2016;

/**
 * 【工程】: Algorithm 包名: qunar.autumn2016 类名: Coder
 * 【作者】: liuyang
 * 【时间】: 17/6/7 下午7:33
 * 【题目】: 寻找Coder
 * 【内容】: 请设计一个高效算法，再给定的字符串数组中，找到包含"Coder"的字符串(不区分大小写)，并将其作为一个新的数组返回。
 * 结果字符串的顺序按照"Coder"出现的次数递减排列，若两个串中"Coder"出现的次数相同，则保持他们在原数组中的位置关系。
 * 给定一个字符串数组A和它的大小n，请返回结果数组。保证原数组大小小于等于300,其中每个串的长度小于等于200。同时保证一定存
 * 在包含coder的字符串。
 * 【版本】: V1.0
 * 【运行时间】:
 * 【时间复杂度】:
 * 【空间复杂度】:
 * 【备注】:
 * 【思路】:
 */
public class Coder {

    public String[] findCoder(String[] A, int n) {
        int[] num = new int[n]; //记录每个字符串Coder的次数
        char[] targetA = {'c', 'o', 'd', 'e', 'r'};
        char[] targetB = {'C', 'O', 'D', 'E', 'R'};
        int count = 0; //包含“coder”的字符串数目
        for (int i = 0; i < n; i++) {
            int cur = 0; //当前字符串“coder”的数量
            char[] arr = A[i].toCharArray();
            for (int j = 0; j < arr.length - 4; j++) {
                if (arr[j] == targetA[0] || arr[j] == targetB[0]) { //找到'c'或者'C'
                    for (int k = j + 1, l = 1; l <= 4; k++, l++) {
                        if (arr[k] != targetA[l] && arr[k] != targetB[l]) { //匹配“coder”{
                            break;
                        }
                        if (l == 4) {
                            cur++;//包括一个coder
                        }
                    }
                }
            }
            num[i] = cur;//记录当前字符串包含“coder”的个数
            count = cur != 0 ? count + 1 : count;
        }
        int[] index = new int[n];
        sort(num, index);
        String[] res = new String[count];//输出结果
        for (int i = 0; i < count; i++) {
            res[i] = A[index[i]];
        }
        return res;
    }

    //两数组排序
    private static void sort(int[] arr, int[] index) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    exch(arr, j, j + 1);
                    exch(index, j, j + 1);
                }
            }
        }
    }

    //交换
    private static void exch(int[] arr, int i, int j) {
        int tempA = arr[i];
        arr[i] = arr[j];
        arr[j] = tempA;
    }

    public static void main(String[] args) {
        Coder t = new Coder();
        String[] arr = {"i am a coder code", "Coder Coder", "Coder"};
        String[] arr2 = {"quvnkcoderoscoderspxqcoderboxlscoderxtzhcoderxdnccoderqjwcoderduhcoderfewpwcoderlhwlcoderrkexcoderqmmbcoderfbcoderuscoderocoderdhgvpcoderuoocoderiwircoder",
                "yngfcodervcoderrazxcoderwwbcoderxxkqvcoderiruzmcoderbxcoderchcoderddutcoderecoderkbmcoderzcoderhcoderfoocoder",
                "focoderqbnacoderkmnuicoderimdcoderwkcoderqsyhcoderfuzqcoderzsncodersigocoder",
                "lhkscoder",
                "uscodersupcoderwuxlhcoderbzcodersskcoderaycoderlpcmcoderzgvcodertcodergcoderiqdcoderthpcoderkahzlcoderfucodericodervcoderywzlzcoderddcoder",
                "jwywpcoderssmcoderdcpcodertubucoderitmucoder",
                "oqvcodermrcoderoyecodertkecodergacoderlscoderrmcoderyuvccoderxcoderrnzmmcoderacoderhcoderijcoderjycoderkgycoder",
                "scwpcoderbuffcoderdacoderfnacoderycodervjcoderkzcoderbcodertavphcoder",
                "lxtcoderdgnjcoderyljvacodernwvcoderxdcodertmjgcoderjrvtcoderacoscodereqcoderdevjcoderdskhbcodertcoderccoder",
                "xqoaxcoderwcoderrxcucoderplcodermmsjwcoderyfcoderscodervnacoder",
                "vqicoderlcoderecoder",
                "ccoderqeufcoderioozcoderkdtcoderyfojcodertfhicodervcoderqcoderdacoderapghcodervwscfcodernttcoderltbncoderecodermwcgcoderhqhtcoder",
                "rcoderqyzgcoderyfdfcodermycoderibbfcoderqbescoderftoqocoderufblcodertcoderlbtkcoderutcoderbcoderwecoderdzpcoderrbmpcoderdcoderdcodericoderdlcoder",
                "mvhncodervccoderczzcoderouajqcoderpcoderldcoderiuhmncoderwzdjcoderzocoderpcodergtfccoderocoderohipqcoderaveqccodertrgcoder",
                "rqcoderygnpqcoderwwcodertjiikcodertmsghcoderacoderocoderrvyfxcoderyibaqcoderfvscodervocoderrwezocoderwecoderbefcoderqavcoderncoderaemvcoderyguncoder",
                "pgicodergcoderfocoderefdhcoderdksdacoderwvnccoderuwscoderdzveccoderyvcodertmcoder",
                "qmcoderfaqhcodercfcoderdcodercvrjmcoderixnykcoderzunsmcoderkwzcoderjdwcoderzacodervaglccoder",
                "ncodersdnpcoderldcoderuzcodervqtdxcodertwcoderscoderecoderynntcodervalcoderdmacoderocoderbpkcoderfpvwtcoderjcoderpobscoder",
                "shmcoderbimcoderuecoderfgzhxcodermcoderkuhhcodertlqcoderrcoderlrcoderhiehcoderbjxvlcoderycodercczlucoderizgdqcoderhcodersjcoderejwycoderwcodermocoderdcoder",
                "pscodernvtwgcoder",
                "kcodereewcoderrcoderzccoderkacodermbqaccoder",
                "nbcodervzhscodergcoderanlwtcoderaepldcoderycciwcoderrorezcodermdcucoderxscoderryceecoderrlppcoderjncokcoderulccodergwcoderquvcoderhcoderhtcoderphyfcoderdobzcoder",
                "kcoderxdqtcoder"};
        System.out.println(t.findCoder(arr2, arr2.length));
    }
}