// 3. Employee Skill Assignment
// An employee can work on multiple projects.
// Given an array of employee skill scores, find all possible project teams
// whose total skill score equals a target value.
// Example:
// Input:
// [2, 3, 5, 7]
// Target = 10
// Output:
// [3,7]
// [2,3,5]

import java.util.ArrayList;
public class EmployeeSkillAssignment {
    static void findTeams(int[] skills,int index,int target,ArrayList<Integer> currentTeam,int currentSum) {
        if (currentSum == target) {
            System.out.println(currentTeam);
            return;
        }
        if (index == skills.length || currentSum > target) {
            return;
        }
        currentTeam.add(skills[index]);
        findTeams(skills,index + 1,target,currentTeam,currentSum + skills[index]);
        currentTeam.remove(currentTeam.size() - 1);
        findTeams(skills,index + 1,target,currentTeam,currentSum);
    }
    public static void main(String[] args) {
        int[] skills = {2, 3, 5, 7};
        int target = 10;
        ArrayList<Integer> arr = new ArrayList<>();
        findTeams(skills,0,target,arr,0);
    }
}