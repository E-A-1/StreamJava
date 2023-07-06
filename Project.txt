package practicePrincy;

public class Project {
    int projectId;
    double duration;
    String projectName;
    int teamSize;
    double developerCostPerHour;
    String commenceDate;

    public Project(int projectId,
            double duration,
            String projectName,
            int teamSize,
            double developerCostPerHour,
            String commenceDate) {
        this.projectId = projectId;
        this.duration = duration;
        this.projectName = projectName;
        this.teamSize = teamSize;
        this.developerCostPerHour = developerCostPerHour;
        this.commenceDate = commenceDate;

    }
}
