public enum Gender {
    MALE{
        @Override
        public String toString() {
            return "Мужской пол";
        }
    },
    FEMALE{
        @Override
        public String toString() {
            return "Женский пол";
        }
    }
}
