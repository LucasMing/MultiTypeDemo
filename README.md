MultiType 就是一个多类型列表视图的中间分发框架，它能帮助你快速并且清晰地开发一些复杂的列表页面。
比如微博列表页面，有纯文本的、带转发原文的、带图片的、带视频的、带文章的等等，甚至穿插一条可以横向滑动的好友推荐条目。
如果把代码都写到一个adapter里，代码十分混乱，一旦需求有变，从庞大的代码中修改比较繁琐，使用MultiType避免这个问题；

MultiType 的特性
轻盈，整个类库只有 10 个类文件，aar 或 jar 包大小只有 10KB
周到，支持 局部类型池 和 全局类型池，并支持二者共用，当出现冲突时，以局部的为准
灵活，几乎所有的部件(类)都可被替换、可继承定制，面向接口/抽象编程
纯粹，只负责本分工作，专注多类型的列表视图 类型分发
高效，没有性能损失，内存友好，最大限度发挥 RecyclerView 的复用性
可读，代码清晰干净、设计精巧，极力避免复杂化，可读性很好，为拓展和自行解决问题提供了基础

demo参考博客地址：https://blog.csdn.net/u012808234/article/details/55048867