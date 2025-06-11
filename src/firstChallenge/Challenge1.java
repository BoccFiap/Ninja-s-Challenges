package firstChallenge;

import javax.swing.*;

public class Challenge1 {
  public static void main(String[] args) {

    String ninjaName;
    int age;
    String mission;
    String nameMission;
    char levelMission;
    String completionStatus;

    ninjaName = "Naruto Uzumaki";
    age = 13;
    mission = "in progress";
    nameMission = "Find the bandit";
    levelMission = 'C';
    completionStatus = "";

    if (age < 15){
      if (levelMission == 'C' || levelMission == 'D') {
        completionStatus = "Complete";
      } else{
        completionStatus = "incomplete";
      }
    }

    System.out.printf("Name: %s\nAge: %d\nMission: %s\nName Mission: %s\nLevel Mission: %c\nCompletion Status: %s\n", ninjaName, age, mission, nameMission, levelMission, completionStatus);

    System.out.println();
    System.out.println();

    ninjaName = "Itachi";
    age = 17;
    mission = "Start";
    nameMission = "Massacre Uchiha";
    levelMission = 'A';
    completionStatus = "";

    if (age < 15){
      if (levelMission == 'C' || levelMission == 'D') {
        completionStatus = "Complete";
      } else{
        completionStatus = "incomplete";
      }
    }
    System.out.printf("Name: %s\nAge: %d\nMission: %s\nName Mission: %s\nLevel Mission: %c\nCompletion Status: %s\n", ninjaName, age, mission, nameMission, levelMission, completionStatus);

    System.out.println();
    System.out.println();

    ninjaName = "Sasuke";
    age = 13;
    mission = "Finished";
    nameMission = "Village reconnaissance";
    levelMission = 'B';
    completionStatus = "";


    if (age < 15){
      if (levelMission == 'C' || levelMission == 'D') {
          completionStatus = "Complete";
      } else{
        completionStatus = "incomplete";
      }
    }


    System.out.printf("Name: %s\nAge: %d\nMission: %s\nName Mission: %s\nLevel Mission: %c\nCompletion Status: %s", ninjaName, age, mission, nameMission, levelMission, completionStatus);
  }
}
