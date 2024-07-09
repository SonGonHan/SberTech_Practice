package HelpToFigures;

public enum Color {
    RED{
        @Override
        public String toString() {
            return "Красный";
        }
    },
    BLUE{
        @Override
        public String toString() {
            return "Синий";
        }
    },
    GREEN{
        @Override
        public String toString() {
            return "Зеленый";
        }
    },
    YELLOW{
        @Override
        public String toString() {
            return "Желтый";
        }
    },
    ORANGE{
        @Override
        public String toString() {
            return "Оранжевый";
        }
    },
    PURPLE{
        @Override
        public String toString() {
            return "Фиолетовый";
        }
    }
}
