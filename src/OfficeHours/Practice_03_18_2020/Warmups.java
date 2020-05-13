package OfficeHours.Practice_03_18_2020;
/*
HTTP is the protocol that governs communications between web servers and web clients (i.e. browsers). Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request. Some of the codes and their meanings are listed below:
status code:
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

1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.

 */

import java.util.Scanner;

public class Warmups {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Your choice should be inclusively in this range.Thanks");
        System.out.println("\t\t 200 301 400 500 ");
        System.out.println("\t\t 201 303 401 503 ");
        System.out.println("\t\t 202 304 403  ");
        System.out.println("\t\t     307 404");
        System.out.println("             410");


        System.out.print("Enter your code number: ");
         int statusCode = input.nextInt();
        String result;

        if (statusCode == 200) result = "Ok";
        else if (statusCode == 201) result = "Created";
        else if (statusCode == 301) result = "Moved Permanently";
        else if (statusCode == 303) result = "See Other";
        else if (statusCode == 304) result = "Not Modified";
        else if (statusCode == 307) result = "Temporary Redirect";
        else if (statusCode == 400) result = "Bad Request";
        else if (statusCode == 401) result = "Unauthorized";
        else if (statusCode == 403) result = "Forbidden";
        else if (statusCode == 404) result = "Not Found";
        else if (statusCode == 410) result = "Gone";
        else if (statusCode == 500) result = "Internal Service Error";
        else if (statusCode == 503) result = "Unavailable";
        else result = "Code number invalid, try again";


        System.out.println(result);

    }

}