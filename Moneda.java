import java.util.Objects;

public final class Moneda {
    private final ConversionRates conversion_rates;

    public Moneda(ConversionRates conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    public ConversionRates conversion_rates() {
        return conversion_rates;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Moneda) obj;
        return Objects.equals(this.conversion_rates, that.conversion_rates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conversion_rates);
    }

    @Override
    public String toString() {
        return "Moneda[" +
                "conversion_rates=" + conversion_rates + ']';
    }

}
