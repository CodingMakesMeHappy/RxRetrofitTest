package com.example.hp.rxretrofittest.model;


import java.util.List;

public class TableBean {

    /**
     * date : 20170519
     * stories : [{"images":["https://pic1.zhimg.com/v2-4f3ece1c510671dd51cdb0d3d73bc1b4.jpg"],"type":0,"id":9429464,"ga_prefix":"051916","title":"吃货真的能解决生物入侵吗？"},{"images":["https://pic2.zhimg.com/v2-032e5b55e205b600df1641b4da0d29d9.jpg"],"type":0,"id":9429416,"ga_prefix":"051915","title":"哐嚓一下电梯开始往下掉的概率很小，但是万一发生了\u2026\u2026"},{"title":"走，我们去老铁山看「超凶」的鸟","ga_prefix":"051913","images":["https://pic1.zhimg.com/v2-42a6ccb94d689d2cdbd5c10c367242dc.jpg"],"multipic":true,"type":0,"id":9427065},{"images":["https://pic1.zhimg.com/v2-5ce92900ee72c1cbe11bd2701f800fd0.jpg"],"type":0,"id":9429042,"ga_prefix":"051912","title":"两场西部决赛，两次争议垫脚，NBA 应该是这样的吗？"},{"images":["https://pic2.zhimg.com/v2-4dbaa473fa861761bfdc95e2815b5739.jpg"],"type":0,"id":9428130,"ga_prefix":"051912","title":"大误 · 午睡前的爽朗小故事"},{"images":["https://pic1.zhimg.com/v2-f40a853210f253e72ab66a6dc6e03fa8.jpg"],"type":0,"id":9428781,"ga_prefix":"051910","title":"「输液」是怎么被发明出来的？"},{"images":["https://pic3.zhimg.com/v2-3b0c73c026afbebb5ddd8f481d356f52.jpg"],"type":0,"id":9427497,"ga_prefix":"051909","title":"从现在起，Google 的每一个比特，都是人工智能"},{"images":["https://pic2.zhimg.com/v2-ec70dc71e9fd101aea8104de7d132ffd.jpg"],"type":0,"id":9428540,"ga_prefix":"051908","title":"手动挡和自动挡，你喜欢开哪种？"},{"images":["https://pic4.zhimg.com/v2-fa320acfb8124615b9c0937a6d709537.jpg"],"type":0,"id":9423171,"ga_prefix":"051907","title":"- 有哪些简短而激励人心的话？ - 今天周五"},{"images":["https://pic2.zhimg.com/v2-3bc1c33017d3df8bc45dde83d8822d51.jpg"],"type":0,"id":9428478,"ga_prefix":"051907","title":"臭氧污染要来了，常规手段防不住，但也不用太担心"},{"images":["https://pic1.zhimg.com/v2-ea1eb90aaef1cf4312ed26c048a991e4.jpg"],"type":0,"id":9428510,"ga_prefix":"051907","title":"不要把公积金当负担，这是福利啊"},{"images":["https://pic2.zhimg.com/v2-252c1aad88e01d6640ab9f520959bb79.jpg"],"type":0,"id":9427620,"ga_prefix":"051906","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"image":"https://pic2.zhimg.com/v2-c5c2c9a63f384cfc9a7ecff7c669b59d.jpg","type":0,"id":9429042,"ga_prefix":"051912","title":"两场西部决赛，两次争议垫脚，NBA 应该是这样的吗？"},{"image":"https://pic1.zhimg.com/v2-773fd5cd8bb84657148ede88c04bbd38.jpg","type":0,"id":9427497,"ga_prefix":"051909","title":"从现在起，Google 的每一个比特，都是人工智能"},{"image":"https://pic4.zhimg.com/v2-318bb3b3320942f3075d3b61e6d39caf.jpg","type":0,"id":9428510,"ga_prefix":"051907","title":"不要把公积金当负担，这是福利啊"},{"image":"https://pic1.zhimg.com/v2-0439996d6da41b66ea544db59d5b36ac.jpg","type":0,"id":9428478,"ga_prefix":"051907","title":"臭氧污染要来了，常规手段防不住，但也不用太担心"},{"image":"https://pic4.zhimg.com/v2-9cefd8baab0e69e346ee3362a67ff9f3.jpg","type":0,"id":9427389,"ga_prefix":"051814","title":"还记得初中课本说的可燃冰吗？它终于被中国首次成功开采"}]
     */

    public String date;
    public List<StoriesBean> stories;
    public List<TopStoriesBean> top_stories;

    public static class StoriesBean {
        /**
         * images : ["https://pic1.zhimg.com/v2-4f3ece1c510671dd51cdb0d3d73bc1b4.jpg"]
         * type : 0
         * id : 9429464
         * ga_prefix : 051916
         * title : 吃货真的能解决生物入侵吗？
         * multipic : true
         */

        public int type;
        public int id;
        public String ga_prefix;
        public String title;
        public boolean multipic;
        public List<String> images;
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic2.zhimg.com/v2-c5c2c9a63f384cfc9a7ecff7c669b59d.jpg
         * type : 0
         * id : 9429042
         * ga_prefix : 051912
         * title : 两场西部决赛，两次争议垫脚，NBA 应该是这样的吗？
         */

        public String image;
        public int type;
        public int id;
        public String ga_prefix;
        public String title;
    }
}
