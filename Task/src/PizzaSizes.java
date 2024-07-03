public enum PizzaSizes {
    SMALL{
        @Override
        public String toString() {
            return "Маленькая пицца";
        }
    },
    MEDIUM{
        @Override
        public String toString() {
            return "Средняя пицца";
        }
    },
    BIG{
        @Override
        public String toString() {
            return "Большая пицца";
        }
    }
}
