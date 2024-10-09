package com.cskaoyan._16collection._02list.linkedlist;

/**
 * @description:
 * @author: 景天
 * @date: 2024/1/25 14:48
 **/

public class APITest {
    // LinkedList具有Collection定义的方法
// LinkedList具有List定义的方法
// LinkedList具有Queue定义的方法(队列的api)
// LinkedList具有Deque定义的方法(双端队列,  栈)

// -----------------------------------------------
// -----------Collection:  -------------
//        boolean add(E e): 添加方法
//        boolean addAll(Collection<? extends E> c): 添加所有
//        boolean remove(Object o): 根据内容删除
//        boolean removeAll(Collection<?> c): 删除所有匹配数据
//        boolean contains(Object o): 查找
//        boolean containsAll(Collection<?> c): 查找是否都存在
//        boolean retainAll(Collection<?> c): 保留匹配数据

//        int size()
//        boolean isEmpty()
//        boolean equals(Object o): 重写了这个方法, 按照内容进行比较
//        int hashCode()
//        void clear()

//        Object[] toArray()
//        返回包含此 collection 中所有元素的数组。
//        <T> T[] toArray(T[] a)
//        返回包含此 collection 中所有元素的数组；返回与指定数组的运行时类型相同。
//        Iterator<E> iterator()
//        返回在此 collection 的元素上进行迭代的迭代器。


// -----------List:  -------------
//        void add(int index, E element): 根据下标的添加
//        boolean addAll(int index, Collection<? extends E> c): 根据下标添加所有
//        E remove(int index): 根据下标的删除
//        E get(int index): 根据下标获取下标位置存储的内容
//        int indexOf(Object o): 根据内容查找这个数据出现的第一次下标位置
//        int lastIndexOf(Object o): 根据内容查找这个数据出现的最后一次下标位置
//        E set(int index, E element): 根据修改下标位置存储的内容

//        ListIterator<E> listIterator()
//        ListIterator<E> listIterator(int index):

//        List<E> subList(int fromIndex, int toIndex)

// -----------Queue:  -------------
//        boolean offer(E e)
//        将指定元素添加到此列表的末尾（最后一个元素）。
//        E peek()
//        获取但不移除此列表的头（第一个元素）。
//        E poll()
//        获取并移除此列表的头（第一个元素）

// -----------Deque:  -------------
//        boolean offerFirst(E e)
//        在此列表的开头插入指定的元素。
//        boolean offerLast(E e)
//        在此列表末尾插入指定的元素。
//        E peekFirst()
//        获取但不移除此列表的第一个元素；如果此列表为空，则返回 null。
//        E peekLast()
//        获取但不移除此列表的最后一个元素；如果此列表为空，则返回 null。
//        E pollFirst()
//        获取并移除此列表的第一个元素；如果此列表为空，则返回 null。
//        E pollLast()
//        获取并移除此列表的最后一个元素；如果此列表为空，则返回 null。

//        E pop()
//        从此列表所表示的堆栈处弹出一个元素。
//        void push(E e)
//        将元素推入此列表所表示的堆栈。
}
