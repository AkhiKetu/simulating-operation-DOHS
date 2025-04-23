package spring.simulatingoperationdohs.modelClass;

import java.time.LocalDate;

public class ServiceRequest {
    private int requestId;
    private String issueType;
    private String location;
    private String status;
    private String description;
    private String time;
    private String assignedTo;
    private LocalDate submissionDate;

    public ServiceRequest() {
    }

    public ServiceRequest(int requestId, String issueType, String location, String status, String description, String time, String assignedTo, LocalDate submissionDate) {
        this.requestId = requestId;
        this.issueType = issueType;
        this.location = location;
        this.status = status;
        this.description = description;
        this.time = time;
        this.assignedTo = assignedTo;
        this.submissionDate = submissionDate;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDate submissionDate) {
        this.submissionDate = submissionDate;
    }

    @Override
    public String toString() {
        return "ServiceRequest{" +
                "requestId=" + requestId +
                ", issueType='" + issueType + '\'' +
                ", location='" + location + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", time='" + time + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", submissionDate=" + submissionDate +
                '}';
    }
}
