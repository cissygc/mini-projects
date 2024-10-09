
import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {

        Scanner school = new Scanner(System.in);

        System.out.print("please enter your exam score= ");
        double examScore = school.nextDouble();

        System.out.print("please enter attendance percentage= ");
        double attendance = school.nextDouble();
        school.nextLine();
        System.out.println("1-Low    2-Medium    3-High");
        System.out.print("please enter your participation level= ");
        int level = school.nextInt();

        char note = 'F';

        if ((examScore < 0) || (attendance < 0)) {
            System.out.println("you have entered unvalid value.");
        } else if ((examScore > 100) || (attendance > 100)) {
            System.out.println("you have entered unvalid value.");
        } else {

            switch (level) {
                case 1:
                case 2:
                case 3:
                    if (examScore >= 90) {
                        note = 'A';
                        if (attendance < 75) {
                            switch (level) {
                                case 1:
                                    note = 'C';
                                    break;
                                case 3:
                                    note = 'A';
                                    break;
                                default:
                                    note = 'B';
                            }
                        } else {
                            switch (level) {
                                case 1:
                                    note = 'B';
                                    break;
                                case 3:
                                    note = 'A';
                                    break;
                                default:
                                    note = 'A';
                            }
                        }


                    } else if (examScore >= 80) {
                        note = 'B';
                        if (attendance < 75) {
                            switch (level) {
                                case 1:
                                    note = 'D';
                                    break;
                                case 3:
                                    note = 'B';
                                    break;
                                default:
                                    note = 'C';
                            }
                        } else {
                            switch (level) {
                                case 1:
                                    note = 'C';
                                    break;
                                case 3:
                                    note = 'A';
                                    break;
                                default:
                                    note = 'B';
                            }
                        }
                    } else if (examScore >= 70) {
                        note = 'C';
                        if (attendance < 75) {
                            switch (level) {
                                case 1:
                                    note = 'E';
                                    break;
                                case 3:
                                    note = 'C';
                                    break;
                                default:
                                    note = 'D';
                            }
                        } else {
                            switch (level) {
                                case 1:
                                    note = 'D';
                                    break;
                                case 3:
                                    note = 'B';
                                    break;
                                default:
                                    note = 'C';
                            }
                        }
                    } else if (examScore >= 60) {
                        note = 'D';
                        if (attendance < 75) {
                            switch (level) {
                                case 1:
                                    note = 'F';
                                    break;
                                case 3:
                                    note = 'D';
                                    break;
                                default:
                                    note = 'E';
                            }
                        } else {
                            switch (level) {
                                case 1:
                                    note = 'E';
                                    break;
                                case 3:
                                    note = 'C';
                                    break;
                                default:
                                    note = 'D';
                            }
                        }
                    } else {
                        note = 'F';
                        if (attendance < 75) {
                            switch (level) {
                                case 1:
                                    note = 'F';
                                    break;
                                case 3:
                                    note = 'E';
                                    break;
                                default:
                                    note = 'F';
                            }
                        } else {
                            switch (level) {
                                case 1:
                                    note = 'F';
                                    break;
                                case 3:
                                    note = 'E';
                                    break;
                                default:
                                    note = 'F';
                            }
                        }

                    }
                    break;
                default:
                    System.out.println("your have entered unvalid string");

            }

            System.out.println("your note is: " +note);
        }


    }
}
