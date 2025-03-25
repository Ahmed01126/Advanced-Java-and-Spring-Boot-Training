package com.example.demo.di;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Tire {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tire tire = (Tire) o;
        return size == tire.size;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(size);
    }

    @Override
    public String toString() {
        return "Tire{" +
                "size=" + size +
                '}';
    }
}
