public class BowlingGame {
    public int getScore(int[] score) throws Exception {
        int scores = 0;
        int round = 0;
        for (int index = 0; index < score.length; index++) {
            if(score[index] >10||score[index]<0){
                throw new Exception("分数不符合规定");
            }
            if(score.length<12||score.length>20){
                throw new Exception("输入的分数不能满足10轮");
            }
            int oneScore = 0;
            if (score[index] == 10 && index < score.length - 2) {
                oneScore = 10 + score[index + 1] + score[index + 2];
                if (index == score.length - 3) {
                    index += 2;
                }
            } else if ((score[index] + score[index + 1] == 10) && index < score.length - 2) {
                oneScore = 10 + score[index + 2];
                if (index == score.length - 3) {
                    index += 1;
                }
                index++;
            } else {
                oneScore = score[index] + score[index + 1];
                index++;
            }
            round++;
            scores += oneScore;

        }
        return scores;
    }
}
