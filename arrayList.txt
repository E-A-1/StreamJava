package practicePrincy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayListExample {
    public static void main(String[] args) {
        Project firsProject = new Project(1, 26.5, "HealthCare", 5, 5, "2001/02/20");
        Project secondProject = new Project(2, 26.5, "FinTech", 5, 5, "2001/02/20");
        Project thirdProject = new Project(3, 26.5, "Advertising", 5, 5, "2001/02/20");
        Project fourthProject = new Project(4, 26.5, "Analytics", 5, 5, "2001/02/20");

        ArrayList<Project> projectList = new ArrayList<>();

        projectList.add(firsProject);
        projectList.add(secondProject);
        projectList.add(thirdProject);
        projectList.add(fourthProject);

        System.out.println(projectList.get(0).projectId);

        // 1 st approach

        Optional<Project> findProject = projectList.stream().filter(project -> project.projectId == 3).findFirst();
        System.out.println("project found is " + findProject.get().projectId);

        // 2nd approach
        List<Project> filteredPersons = projectList.stream()
                .filter(project -> project.projectId == 2)
                .collect(Collectors.toList());

        // 3 rd Approach
        Scanner scanner = new Scanner(System.in);
        int projectToFind = scanner.nextInt();
        Project projectFound = null;

        for (Project project : projectList) {
            if (project.projectId == projectToFind) {
                System.out.println("Project found");
                projectFound = project;
            }
        }

        System.out.println(projectFound);
        // 4th approach

        for (int i = 0; i < projectList.size(); i++) {

            Project currProject = projectList.get(i);
            if (currProject.projectId == projectToFind) {
                System.out.println("Project found");
                projectFound = currProject;

            }
        }

    }
}
