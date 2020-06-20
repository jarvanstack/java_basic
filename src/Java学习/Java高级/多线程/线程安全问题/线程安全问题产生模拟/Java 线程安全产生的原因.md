### 一、线程安全产生的原因。
#### 1.首先知道新建线程会新建一个栈空间，这是多线程的基本原理。
#### 此时我们把 main()的内存成为==主内存==，其他线程成为==工作内存==。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200501211801554.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2phcnZhbjU=,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200501212309130.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2phcnZhbjU=,size_16,color_FFFFFF,t_70)

#### 2.了解 i++;都经历了什么（结合上面的图)
```java
int i = 1;
i++;
```
1. 复制：复制一份主内存**共享变量**的int i = 1；到工作内存**共享变量的副本**中例如 （int i2 = 1;)
2. **计算**：计算 1 + 1 = 2 ;
3. 赋值给副本：2 的值赋值给副本 ( i2 = 2;)
4. 赋值给主内存： 把副本的值 2 取出来给 主内存的共享变量 ( i = 2;)
#### 3.线程安全问题产生的原因：
1. **CPU值参与了内存的计算，读写是和CPU无关的**
2. **多线程在其他时候比如读写时候，失去了对CPU的执行权力，**
3. **值被取出来后，还没有赋值回去，又被其他线程拿去用了，**
于是就出现了线程安全的问题。
### 二、拓展：储存结构图
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200503084524227.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2phcnZhbjU=,size_16,color_FFFFFF,t_70)

 参考来源[点击跳转](https://blog.csdn.net/allen215902/article/details/50423009)
 #### 备注：如有建议请评论或者私信.