package spring.simulatingoperationdohs.modelClass;

public class IncidentReport {
    private int reportId;
    private String incidentType;
    private String description;
    private String time;
    private String status;
    private String location;

    public IncidentReport() {

    }

    public IncidentReport(int reportId, String incidentType, String description, String time, String status, String location) {
        this.reportId = reportId;
        this.incidentType = incidentType;
        this.description = description;
        this.time = time;
        this.status = status;
        this.location = location;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String incidentType) {
        this.incidentType = incidentType;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "IncidentReport{" +
                "reportId=" + reportId +
                ", incidentType='" + incidentType + '\'' +
                ", description='" + description + '\'' +
                ", time='" + time + '\'' +
                ", status='" + status + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
