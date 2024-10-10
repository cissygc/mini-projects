import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {

        Scanner school = new Scanner(System.in);

        System.out.print("please enter your exam score= ");
        double examScore = school.nextDouble();

        System.out.print("please enter attendance percentage= ");
        double attendance = school.nextDouble();
        school.nextLine();
        System.out.println("Low    Medium    High");
        System.out.print("please enter your participation level= ");
        String level = school.nextLine();

        char note = 'F';

        if ((examScore < 0) || (attendance < 0)) {
            System.out.println("you have entered unvalid value.");
        } else if ((examScore > 100) || (attendance > 100)) {
            System.out.println("you have entered unvalid value.");
        } else {

            switch (level.toLowerCase()) {
                case "low":
                case "medium":
                case "high":
                    if (examScore >= 90) {
                        note = 'A';
                        if (attendance < 75) {
                            switch (level.toLowerCase()) {
                                case "low":
                                    note = 'C';
                                    break;
                                case "high":
                                    note = 'A';
                                    break;
                                default:
                                    note = 'B';
                            }
                        } else {
                            switch (level.toLowerCase()) {
                                case "low":
                                    note = 'B';
                                    break;
                                case "high":
                                    note = 'A';
                                    break;
                                default:
                                    note = 'A';
                            }
                        }


                    } else if (examScore >= 80) {
                        note = 'B';
                        if (attendance < 75) {
                            switch (level.toLowerCase()) {
                                case "low":
                                    note = 'D';
                                    break;
                                case "high":
                                    note = 'B';
                                    break;
                                default:
                                    note = 'C';
                            }
                        } else {
                            switch (level.toLowerCase()) {
                                case "low":
                                    note = 'C';
                                    break;
                                case "high":
                                    note = 'A';
                                    break;
                                default:
                                    note = 'B';
                            }
                        }
                    } else if (examScore >= 70) {
                        note = 'C';
                        if (attendance < 75) {
                            switch (level.toLowerCase()) {
                                case "low":
                                    note = 'E';
                                    break;
                                case "high":
                                    note = 'C';
                                    break;
                                default:
                                    note = 'D';
                            }
                        } else {
                            switch (level.toLowerCase()) {
                                case "low":
                                    note = 'D';
                                    break;
                                case "high":
                                    note = 'B';
                                    break;
                                default:
                                    note = 'C';
                            }
                        }
                    } else if (examScore >= 60) {
                        note = 'D';
                        if (attendance < 75) {
                            switch (level.toLowerCase()) {
                                case "low":
                                    note = 'F';
                                    break;
                                case "high":
                                    note = 'D';
                                    break;
                                default:
                                    note = 'E';
                            }
                        } else {
                            switch (level.toLowerCase()) {
                                case "low":
                                    note = 'E';
                                    break;
                                case "high":
                                    note = 'C';
                                    break;
                                default:
                                    note = 'D';
                            }
                        }
                    } else {
                        note = 'F';
                        if (attendance < 75) {
                            switch (level.toLowerCase()) {
                                case "low":
                                    note = 'F';
                                    break;
                                case "high":
                                    note = 'E';
                                    break;
                                default:
                                    note = 'F';
                            }
                        } else {
                            switch (level.toLowerCase()) {
                                case "low":
                                    note = 'F';
                                    break;
                                case "high":
                                    note = 'E';
                                    break;
                                default:
                                    note = 'F';
                            }
                        }

                    }
                    System.out.println("your note is " + note);
                    break;
                default:
                    System.out.println("your have entered unvalid string");

            }


        }


    }
}  