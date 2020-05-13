package day12_JavaRecap;
/*
STATUS CODES
200, OK
201, Created
202, Accepted
301, Moved Permanently
303, See Other
304, Not Modified
307, Temporary Redirect
400, Bad Request
401, Unauthorized
403, Forbidden
404, Not Found
410, Gone
500, Internal Server Error
503, Service Unavailable

Given an int variable status, write a switch statement that prints out, on a line by itself, the appropriate label from the above list based on status. Otherwise, print warning message: "Invalid status code!".

 */

import java.util.Scanner;

public class SwitchStatus {
    public static void main(String[] args) {
        Scanner status = new Scanner(System.in);
        System.out.println("Enter the code :");

        int statusCode = status.nextInt();
        String result = "";

        switch (statusCode) {
            case 200 :
                result = "Ok.";
                break;

            case 201 :
                result = "Created.";
                break;

            case 202 :
                result = "Accepted.";
                break;

            case 301 :
                result = "Moved Permanently.";

            default :
                result = "Invalid Status.";
        }
        System.out.println(result);

    }
}
