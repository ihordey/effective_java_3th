package chapter2.item2.pizza;

import lombok.ToString;

@ToString(callSuper = true)
public class Calzone extends Pizza {
    private final boolean sauseInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauseInside = false;

        public Builder souceInside() {
            this.sauseInside = true;
            return this;
        }

        @Override
        Pizza build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        this.sauseInside = builder.sauseInside;

    }
}
