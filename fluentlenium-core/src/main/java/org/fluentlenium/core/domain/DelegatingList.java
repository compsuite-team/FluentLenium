package org.fluentlenium.core.domain;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * List that delegates to another list
 *
 * @param <T> the type of elements in this list
 */
public class DelegatingList<T> implements List<T> {
    protected final List<T> list;

    /**
     * Creates a new delegating list
     *
     * @param list underlying list
     */
    public DelegatingList(List<T> list) {
        super();
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void clear() {
        getList().clear();
    }

    public void forEach(Consumer<? super T> action) {
        getList().forEach(action);
    }

    public <T> T[] toArray(IntFunction<T[]> generator) {
        return getList().toArray(generator);
    }

    public boolean isEmpty() {
        return getList().isEmpty();
    }

    public boolean removeIf(Predicate<? super T> filter) {
        return getList().removeIf(filter);
    }

    public Spliterator<T> spliterator() {
        return getList().spliterator();
    }

    public T set(int index, T element) {
        return getList().set(index, element);
    }

    public boolean containsAll(Collection<?> c) {
        return getList().containsAll(c);
    }

    public List<T> subList(int fromIndex, int toIndex) {
        return getList().subList(fromIndex, toIndex);
    }

    public boolean add(T e) {
        return getList().add(e);
    }

    public boolean remove(Object o) {
        return getList().remove(o);
    }

    public int size() {
        return getList().size();
    }

    public ListIterator<T> listIterator() {
        return getList().listIterator();
    }

    public boolean contains(Object o) {
        return getList().contains(o);
    }

    public Object[] toArray() {
        return getList().toArray();
    }

    public void sort(Comparator<? super T> c) {
        getList().sort(c);
    }

    public boolean retainAll(Collection<?> c) {
        return getList().retainAll(c);
    }

    public int lastIndexOf(Object o) {
        return getList().lastIndexOf(o);
    }

    public <T> T[] toArray(T[] a) {
        return getList().toArray(a);
    }

    public boolean removeAll(Collection<?> c) {
        return getList().removeAll(c);
    }

    public T remove(int index) {
        return getList().remove(index);
    }

    public Stream<T> parallelStream() {
        return getList().parallelStream();
    }

    public boolean addAll(Collection<? extends T> c) {
        return getList().addAll(c);
    }

    public int indexOf(Object o) {
        return getList().indexOf(o);
    }

    public void add(int index, T element) {
        getList().add(index, element);
    }

    public T get(int index) {
        return getList().get(index);
    }

    public ListIterator<T> listIterator(int index) {
        return getList().listIterator(index);
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        return getList().addAll(index, c);
    }

    public Stream<T> stream() {
        return getList().stream();
    }

    public Iterator<T> iterator() {
        return getList().iterator();
    }

    public void replaceAll(UnaryOperator<T> operator) {
        getList().replaceAll(operator);
    }
}
