public enum DayOfWeek {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    public boolean isWeekend() {
        return this == Saturday || this == Sunday;
    }
}
