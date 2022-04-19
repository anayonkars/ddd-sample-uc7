package com.ddd_bootcamp.domain;

import java.math.BigDecimal;
import java.util.Currency;

public class Price implements ValueObject<Price> {
    private BigDecimal value;
    private Currency currency;

    public Price(BigDecimal value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Price price = (Price) o;

        if (!value.equals(price.value)) return false;
        return currency.equals(price.currency);
    }

    @Override
    public int hashCode() {
        int result = value.hashCode();
        result = 31 * result + currency.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Price{" +
                "value=" + value +
                ", currency=" + currency +
                '}';
    }

    @Override
    public boolean sameValueAs(Price other) {
        if (this == other) return true;
        if (!value.equals(other.value)) return false;
        return currency.equals(other.currency);
    }
}