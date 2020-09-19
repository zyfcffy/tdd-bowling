public class BowlingGame {
    public int getScore(int[] score) throws Exception {
        int scores = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 10 || score[i] < 0) {
                throw new Exception("分数不符合规定");
            }
            if (score.length < 12  ) {
                throw new Exception("输入的分数不能完成10轮");
            }
            if(score.length > 21){
                throw new Exception("输入的分数超过10轮");
            }
        }
        return scores;
    }
}
