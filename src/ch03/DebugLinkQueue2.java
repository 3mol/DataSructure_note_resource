package ch03;

/**
 * 
 * 对链队列类(采用带头结点的循环链表来表示队列)及其基本操作进行调试
 * 
 */
public class DebugLinkQueue2 {
	public static void main(String[] args) throws Exception {
		LinkQueue2 Q = new LinkQueue2();
		// 初始化队列中的元素，其中元素个数为10
		for (int i = 1; i <= 10; i++)
			Q.offer(i);
		System.out.println("队列中各元素为(队首到队尾)： ");
		Q.display();// 打印队列中元素（队首到队尾）
		System.out.println();
		if (!Q.isEmpty())
			System.out.println("队列非空！");

		System.out.println("队列的长度为： " + Q.length());// 输出队列的长度
		System.out.println("队首元素为： " + Q.peek().toString());// 输出队首元素

		System.out.println("去除队首元素后，队列中各元素为(队首到队尾)：  ");
		Q.poll();// 删除元素
		Q.display();
		System.out.println();

		System.out.println("去除队列中剩余的所有元素！ 进行中。。。"); // 输出
		Q.clear(); // 清除队列中的元素

		if (Q.isEmpty())// 队列空，输出
			System.out.println("队列已清空!");
	}
}

// 调试结果：
// 队列中各元素为(队首到队尾)：
// 1 2 3 4 5 6 7 8 9 10
//
// 队列非空！
// 队列的长度为： 10
// 队首元素为： 1
// 去除队首元素后，队列中各元素为(队首到队尾)：
// 2 3 4 5 6 7 8 9 10
//
// 去除队列中剩余的所有元素！ 进行中。。。
// 队列已清空!


