package Basics;

public class Conditional {

    void main(){

        //if statement
        int dailyPractice = 9;

                if (dailyPractice >= 10) {
                        System.out.println("Good consistency!");
                    }

        //if else statement
        int score = 42;

                if (score >= 50) {
                        System.out.println("Pass");
                    } else {
                        System.out.println("Fail");
                    }

        // if else-if Ladder
        int accuracy = 78;

                if (accuracy >= 90) {
                        System.out.println("Excellent");
                    }
                else if (accuracy >= 75) {
                        System.out.println("Good");
                    }
                else if (accuracy >= 60) {
                        System.out.println("Average");
                    }
                else {
                        System.out.println("Needs Improvement");
                    }

        //Nested if-else
        boolean hasSubscription = true;
                int solvedProblems = 220;

                if (hasSubscription) {

                        if (solvedProblems >= 200) {
                                System.out.println("Unlock Advanced Sheet");
                            } else {
                                System.out.println("Practice More Problems");
                            }

                    } else {
                        System.out.println("Upgrade to Premium");
                    }

        //Ternary Operator
        int streakDays = 35;

                String status = (streakDays >= 30) ? "Consistent" : "Irregular";

                System.out.println(status);

        // Switch Statement
//        switch (expression) {
//                case value1:
//                        // code
//                        break;
//                case value2:
//                        // code
//                        break;
//                default:
//                        // code
//                }



    }
}
