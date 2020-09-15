public class BowlingGame {
    public int getScore(int[] score) throws Exception {
        int scores = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 10 || score[i] < 0) {
                throw new Exception("分数不符合规定");
            }
            if (score.length < 12 || score.length > 21) {
                throw new Exception("输入的分数不能满足10轮");
            }
            int oneScore = 0;
            if (score[i] == 10 && i < score.length - 2) {
                oneScore = 10 + score[i + 1] + score[i + 2];
                if (i == score.length - 3) {
                    i += 2;
                }
            } else if ((score[i] + score[i + 1] == 10) && i < score.length - 2) {
                oneScore = 10 + score[i + 2];
                if (i == score.length - 3) {
                    i += 1;
                }
                i++;
            } else {
                oneScore = score[i] + score[i + 1];
                i++;
            }
            scores += oneScore;
        }
        return scores;
    }
}
