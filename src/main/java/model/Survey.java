package model;

import java.io.Serializable;

public class Survey implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dob;           // giữ dạng String cho đơn giản
    private String heardFrom;     // Search engine / Word of mouth / Social Media / Other
    private boolean receiveAnnouncements;
    private boolean emailAnnouncements;
    private String contact;       // Email / Postal / Both

    public Survey() {}

    public Survey(String firstName, String lastName, String email, String dob,
                  String heardFrom, boolean receiveAnnouncements,
                  boolean emailAnnouncements, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.heardFrom = heardFrom;
        this.receiveAnnouncements = receiveAnnouncements;
        this.emailAnnouncements = emailAnnouncements;
        this.contact = contact;
    }

    // Getters/Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }
    public String getHeardFrom() { return heardFrom; }
    public void setHeardFrom(String heardFrom) { this.heardFrom = heardFrom; }
    public boolean isReceiveAnnouncements() { return receiveAnnouncements; }
    public void setReceiveAnnouncements(boolean receiveAnnouncements) { this.receiveAnnouncements = receiveAnnouncements; }
    public boolean isEmailAnnouncements() { return emailAnnouncements; }
    public void setEmailAnnouncements(boolean emailAnnouncements) { this.emailAnnouncements = emailAnnouncements; }
    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    // Helpers để hiển thị đẹp trên JSP EL
    public String getFullName() {
        String fn = firstName == null ? "" : firstName.trim();
        String ln = lastName == null ? "" : lastName.trim();
        return (fn + " " + ln).trim();
    }
    public String getReceiveAnnouncementsText() { return receiveAnnouncements ? "Yes" : "No"; }
    public String getEmailAnnouncementsText() { return emailAnnouncements ? "Yes" : "No"; }
}
