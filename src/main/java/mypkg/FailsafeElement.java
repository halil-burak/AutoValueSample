package mypkg;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class FailsafeElement<OriginalT, CurrentT> {
    public abstract String name();
    public abstract OriginalT originalPayload();
    public abstract CurrentT currentPayload();

    public static <OriginalT, CurrentT> Builder<OriginalT, CurrentT> builder() {
        return new AutoValue_FailsafeElement.Builder<>();
    }

    @AutoValue.Builder
    public abstract static class Builder<OriginalT, CurrentT> {
        public abstract Builder<OriginalT, CurrentT> setName(String name);
        public abstract Builder<OriginalT, CurrentT> setOriginalPayload(OriginalT originalPayload);
        public abstract Builder<OriginalT, CurrentT> setCurrentPayload(CurrentT currentPayload);
        public abstract FailsafeElement<OriginalT, CurrentT> build();
    }
}
