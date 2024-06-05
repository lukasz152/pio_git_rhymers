package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class IntLinkedListJUnitTest {

    @Test
    public void testPush() {
        IntLinkedList list = new IntLinkedList();
        list.push(10);
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(10, list.top());
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertTrue(list.isEmpty());
        list.push(5);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testIsFull() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertFalse(list.isFull());
    }

    @Test
    public void testTopWhenEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertEquals(IntLinkedList.getIfEmpty(), list.top());
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        list.push(5);
        Assert.assertEquals(5, list.top());
        list.push(10);
        Assert.assertEquals(10, list.top());
    }

    @Test
    public void testPopWhenEmpty() {
        IntLinkedList list = new IntLinkedList();
        Assert.assertEquals(IntLinkedList.getIfEmpty(), list.pop());
    }

    @Test
    public void testPop() {
        IntLinkedList list = new IntLinkedList();
        list.push(5);
        list.push(10);
        Assert.assertEquals(10, list.pop());
        Assert.assertEquals(5, list.pop());
        Assert.assertEquals(IntLinkedList.getIfEmpty(), list.pop());
    }
}
