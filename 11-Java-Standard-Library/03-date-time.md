# Date and Time

Work with dates and times using java.time package (Java 8+).

## 🎯 Learning Objectives

- Use LocalDate, LocalTime, LocalDateTime
- Format dates and times
- Calculate date differences
- Work with timezones

## LocalDate

```java
import java.time.LocalDate;

// Current date
LocalDate today = LocalDate.now();
System.out.println(today);  // 2024-12-18

// Specific date
LocalDate date = LocalDate.of(2024, 12, 25);

// Extract components
int year = today.getYear();
int month = today.getMonthValue();
int day = today.getDayOfMonth();

// Calculations
LocalDate tomorrow = today.plusDays(1);
LocalDate nextWeek = today.plusWeeks(1);
LocalDate nextMonth = today.plusMonths(1);
```

## LocalTime

```java
import java.time.LocalTime;

// Current time
LocalTime now = LocalTime.now();
System.out.println(now);  // 14:30:45.123

// Specific time
LocalTime time = LocalTime.of(14, 30);

// Extract components
int hour = now.getHour();
int minute = now.getMinute();
int second = now.getSecond();
```

## LocalDateTime

```java
import java.time.LocalDateTime;

// Current date and time
LocalDateTime now = LocalDateTime.now();

// Specific date and time
LocalDateTime dt = LocalDateTime.of(2024, 12, 25, 14, 30);
```

## Formatting

```java
import java.time.format.DateTimeFormatter;

LocalDateTime now = LocalDateTime.now();

// Predefined formats
String iso = now.format(DateTimeFormatter.ISO_DATE_TIME);

// Custom format
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
String formatted = now.format(formatter);
System.out.println(formatted);  // 2024-12-18 14:30:45
```

## Summary

✓ LocalDate for dates
✓ LocalTime for times
✓ LocalDateTime for both
✓ DateTimeFormatter for formatting

## What's Next?

**[Next: Utility Classes →](04-utility-classes.md)**

---

[← Back to String Utilities](02-string-utilities.md) | [Next: Utility Classes →](04-utility-classes.md)
