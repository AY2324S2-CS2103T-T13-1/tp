package seedu.address.model.person.exceptions;

import java.util.Objects;

import seedu.address.model.tag.Attendance;

public class AttendanceStatus {

    private String date;
    private String status;

    public AttendanceStatus(String date, String status) {
        this.date = date;
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof AttendanceStatus)) {
            return false;
        }

        AttendanceStatus otherAttendance = (AttendanceStatus) other;
        return date.equals(otherAttendance.date) && status.equals(otherAttendance.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, status);
    }

}
