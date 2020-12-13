package com.iterator;

/**
 * 所有集合的顶级接口，此接口规定，我们创建的集合必须带有iterator
 */
public interface Aggregate {
    Iterator iterator();
}
