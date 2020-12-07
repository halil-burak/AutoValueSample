package mypkg;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class MoneyWithBuilder {

    public abstract String currency();

    public abstract long amount();

    public static Builder builder() {
        return new AutoValue_MoneyWithBuilder.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setCurrency(String currency);
        public abstract Builder setAmount(long amount);
        public abstract MoneyWithBuilder build();
    }
}
