/**
 * Created by Zou on 2016/10/18.
 */
public class Test {
    public static void main(String[] args) {
        produceRedRocker();
    }

    private static void produceRedRocker() {
        Human mLingXiao=new Human("学姐，是一种特殊的属性");
        mLingXiao.setAge(18);//好吧你要18就18吧QAQ
        mLingXiao.setName("凌霄学姐");
        mLingXiao.introduce();

        Human mXueZhang=new Human("男");
        mXueZhang.setAge(18);
        mXueZhang.setName("曾名扬");
        mXueZhang.introduce();
        mXueZhang.setName("曹越");
        mXueZhang.introduce();
        mXueZhang.setName("郑昱旋");
        mXueZhang.introduce();
        mXueZhang.setName("徐书展");
        mXueZhang.introduce();
        mXueZhang.setName("吴随");
        mXueZhang.introduce();

        Human mXueJie=new Human("女");
        mXueJie.setAge(18);
        mXueJie.setName("冬梅");
        mXueJie.introduce();
        //似乎没有什么不对23333333333
    }
}
